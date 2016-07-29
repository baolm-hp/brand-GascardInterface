package com.handpay.obm.gascard.bean;

import java.io.Serializable;
import java.util.List;

public class PageResultBean<T>  implements Serializable{

	private static final long serialVersionUID = 18541115684L;
	
	private int pageSize;
	
	private int pageNo;
	
	private int totalSize;
	
	private int totalPages;
	
	private List<T> data;

	

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(int size) {
		this.totalSize = size;
	}

	public int getTotalPages() {
		if(this.pageSize==0)
			return 0;
		int pages=this.totalSize/this.pageSize;
		pages=this.totalSize%this.pageSize != 0 ? pages+1 : pages;
		return pages;
	}


	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
	

}
