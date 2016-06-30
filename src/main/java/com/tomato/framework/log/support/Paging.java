/**
 * 
 */
package com.tomato.framework.log.support;

/**
 * @author Hunhun
 *
 * 下午5:07:22
 */
public class Paging {

	public static final int DEFAULT_PAGE_SIZE = 20;
	public static final int MAX_PAGE_SIZE = 50;
	public static final int DEFAULT_CURRENT_PAGE = 1;
	private int pageSize = 20;
	private int currentPage = 1;
	private int totalCount;
	private Object result;

	public Paging() {
	}

	public Paging(int pageSize) {
		this.pageSize = pageSize;
	}

	public Paging(int pageSize, int curPage) {
		if(pageSize <= 0) {
			this.pageSize = 20;
		} else {
			this.pageSize = pageSize > 50?50:pageSize;
		}

		this.currentPage = curPage;
	}

	public int getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public Object getResult() {
		return this.result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
	
}
