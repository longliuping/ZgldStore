package com.zgld.mall.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.android.volley.Request;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.zgld.mall.R;
import com.zgld.mall.adapter.HomeProductAdapter;
import com.zgld.mall.adapter.HotSupplierAdapter;
import com.zgld.mall.beans.Categories;
import com.zgld.mall.beans.City;
import com.zgld.mall.beans.County;
import com.zgld.mall.beans.HotCategory;
import com.zgld.mall.beans.Province;
import com.zgld.mall.beans.SupperArea;
import com.zgld.mall.beans.SupperHot;
import com.zgld.mall.beans.Supplier;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.XMLAddressHandler;
import com.zgld.mall.widget.NiceSpinner;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class HotSupplierActivity extends BaseActivity implements AdapterView.OnItemSelectedListener,PullToRefreshBase.OnRefreshListener2 ,AdapterView.OnItemClickListener{
    Categories info = null;

    Province province;
    NiceSpinner niceSpinnerProvince;
    List<String> datasetProvince = new LinkedList<>();

    List<City> cityList = new ArrayList<>();
    NiceSpinner niceSpinnerCity;
    List<String> datasetCity = new LinkedList<>();

    List<County> countyList = new ArrayList<>();
    NiceSpinner niceSpinnerCounty;
    List<String> datasetCounty = new LinkedList<>();
    int areaid =0;
    int pageNum = 1;
    PullToRefreshScrollView scrollview;
    GridView gridview;
    HotSupplierAdapter infoAdapter;
    List<Supplier> listInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_hot_supplier);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        info = (Categories) this.getIntent().getSerializableExtra(Contents.INFO);
        if(info==null){
            finish();
            return;
        }
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText(info.getName());
        try {
            InputStream inStream = this.getResources().getAssets().open("address.xml");
            SAXParserFactory spf = SAXParserFactory.newInstance();// 创建解析器
            SAXParser saxParser = spf.newSAXParser();
            XMLAddressHandler handler = new XMLAddressHandler();
            saxParser.parse(inStream, handler);
            province = handler.getProvinces().get(0);
            inStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        niceSpinnerProvince = (NiceSpinner) findViewById(R.id.nice_spinner_province);
        datasetProvince.add(province.getName());
        niceSpinnerProvince.attachDataSource(datasetProvince);

        niceSpinnerCity = (NiceSpinner) findViewById(R.id.nice_spinner_city);
        cityList = province.getCitys();
        for (int i=0;i<province.getCitys().size();i++){
            datasetCity.add(province.getCitys().get(i).getName());
        }
        niceSpinnerCity.attachDataSource(datasetCity);
        niceSpinnerCity.setOnItemSelectedListener(this);

        niceSpinnerCounty = (NiceSpinner) findViewById(R.id.nice_spinner_county);
        countyList = cityList.get(0).getCountys();
        datasetCounty = new LinkedList<>();
        for (int i=0;i<countyList.size();i++){
            datasetCounty.add(countyList.get(i).getName());
        }
        niceSpinnerCounty.attachDataSource(datasetCounty);
        niceSpinnerCounty.setOnItemSelectedListener(this);
        areaid = countyList.get(0).getId();
        scrollview = (PullToRefreshScrollView) findViewById(R.id.scrollview);
        scrollview.setMode(PullToRefreshBase.Mode.BOTH);
        scrollview.setOnRefreshListener(this);
        gridview = (GridView) findViewById(R.id.gridview);
        gridview.setOnItemClickListener(this);
        initData();
    }

    @Override
    public void handleMsg(Message msg) {
        scrollview.onRefreshComplete();
        try{
            if(msg.getData().getInt(Contents.STATUS)==200){
                switch (msg.what){
                    case 201:
                        if(pageNum==1){
                            listInfo = new ArrayList<>();
                            infoAdapter = new HotSupplierAdapter(this,listInfo);
                            gridview.setAdapter(infoAdapter);
                        }
                        JSONArray jsonArray = new JSONObject(msg.getData().getString(Contents.JSON)).getJSONObject(Contents.DATA).getJSONArray(Contents.LISTINIFO);
                        List<Supplier> supperAreaList = new Gson().fromJson(jsonArray.toString(),new TypeToken<List<Supplier>>(){}.getType());
                        if(supperAreaList!=null && supperAreaList.size()>0){
                            listInfo.addAll(supperAreaList);
                        }
                        infoAdapter.notifyDataSetChanged();
                        pageNum++;
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()){
            case R.id.nice_spinner_province:

                break;
            case R.id.nice_spinner_city:
                countyList = cityList.get(position).getCountys();
                datasetCounty = new LinkedList<>();
                for (int i=0;i<countyList.size();i++){

                    datasetCounty.add(countyList.get(i).getName());
                }
                niceSpinnerCounty.attachDataSource(datasetCounty);
                areaid = countyList.get(0).getId();
                pageNum = 1;
                initData();
                break;
            case R.id.nice_spinner_county:
                areaid = countyList.get(position).getId();
                pageNum = 1;
                initData();
                break;
        }
    }
    void initData(){
        Map<String,String> m = new HashMap<>();
        m.put(Contents.PAGENUM,pageNum+"");
        m.put(Contents.PAGESIZE,18+"");
        m.put("areaid",areaid+"");
        m.put("hotid",info.getCategoryId()+"");
        getData(Request.Method.POST, 201, "supplier/hot_area_supplier.html", m, null, pageNum);
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {
        pageNum = 1;
        initData();
    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {
        initData();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent();
        intent.setClass(this, SupperProductActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(Contents.INFO,listInfo.get(position));
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
