package com.zgld.mall.beans;

import java.util.ArrayList;
import java.util.List;

public class ProductReviewData {
	private int totelcount;
	private List<ProductReview> data = new ArrayList<ProductReview>();

	public int getTotelcount() {
		return totelcount;
	}

	public void setTotelcount(int totelcount) {
		this.totelcount = totelcount;
	}

	public List<ProductReview> getData() {
		return data;
	}

	public void setData(List<ProductReview> data) {
		this.data = data;
	}

}
