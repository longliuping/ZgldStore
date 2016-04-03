package com.zgld.mall.activity;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import com.zgld.mall.R;
import com.zgld.mall.beans.County;
import com.zgld.mall.utils.Contents;

/**
 * 区
 *
 */
public class CountyActivity extends BaseActivity implements OnItemClickListener {
    ListView listview;
    LayoutInflater layoutInflater;
    InfoAdapter infoAdapter;
    List<County> listInfo = new ArrayList<County>();

    @Override
    public void handleMsg(Message msg) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_county);
        layoutInflater = LayoutInflater.from(this);
        findViewById(R.id.back).setVisibility(View.GONE);
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(getString(R.string.title_selected_address));
        listview = (ListView) findViewById(R.id.listview);
        listview.setOnItemClickListener(this);

        infoAdapter = new InfoAdapter();
        listInfo = Contents.listProvince.get(Contents.selectedProvincePosition).getCitys()
                .get(Contents.selectedCityPosition).getCountys();
        listview.setAdapter(infoAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Contents.selectedCountyPosition = position;
        infoAdapter.notifyDataSetChanged();
        setResult(RESULT_OK);
        finish();
    }

    class InfoAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return listInfo.size();
        }

        @Override
        public Object getItem(int position) {
            return listInfo.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        class ViewHolder {
            TextView item_type, item_right;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            ViewHolder holder = null;
            if (convertView == null) {
                holder = new ViewHolder();
                convertView = layoutInflater.inflate(R.layout.item_publish_productr_type, null);
                holder.item_type = (TextView) convertView.findViewById(R.id.item_type);
                holder.item_right = (TextView) convertView.findViewById(R.id.item_right);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            County info = listInfo.get(position);
            holder.item_right.setVisibility(View.GONE);
            if (info != null) {
                holder.item_type.setText(info.getName());
                if (Contents.selectedCountyPosition == position) {
                    holder.item_right.setVisibility(View.VISIBLE);
                }
            }
            return convertView;
        }

    }
}
