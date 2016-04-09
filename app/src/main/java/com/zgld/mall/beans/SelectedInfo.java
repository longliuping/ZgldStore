package com.zgld.mall.beans;

import android.widget.GridView;

import com.zgld.mall.adapter.SelectedInfoAdapter;

import java.util.List;

/**
 * Created by LongLiuPing on 2016/3/16.
 */
public class SelectedInfo {
    SelectedInfoAdapter selectedInfoAdapter;
    List<Sku> listInfo;
    GridView gridview;
    int attributeId;

    public SelectedInfoAdapter getSelectedInfoAdapter() {
        return selectedInfoAdapter;
    }

    public void setSelectedInfoAdapter(SelectedInfoAdapter selectedInfoAdapter) {
        this.selectedInfoAdapter = selectedInfoAdapter;
    }

    public List<Sku> getListInfo() {
        return listInfo;
    }

    public void setListInfo(List<Sku> listInfo) {
        this.listInfo = listInfo;
    }

    public GridView getGridview() {
        return gridview;
    }

    public void setGridview(GridView gridview) {
        this.gridview = gridview;
    }

    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
    }
}
