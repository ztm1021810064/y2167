package cn.entity;

import java.util.List;

public class Page {
	 private int everyPage;          //每页显示记录数
	    private int totalCount;         //总记录数
	    private int totalPage;          //总页数
	    private int currentPage;        //当前页
	    private int beginIndex;         //查询起始点
	    
	    public int getEveryPage() {
			return everyPage;
		}


		public void setEveryPage(int everyPage) {
			this.everyPage = everyPage;
		}


		public int getTotalCount() {
			return totalCount;
		}


		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}


		public int getTotalPage() {
			return totalPage;
		}


		public void setTotalPage(int totalPage) {
			this.totalPage = totalPage;
		}


		public int getCurrentPage() {
			return currentPage;
		}


		public void setCurrentPage(int currentPage) {
			this.currentPage = currentPage;
		}


		public int getBeginIndex() {
			return beginIndex;
		}


		public void setBeginIndex(int beginIndex) {
			this.beginIndex = beginIndex;
		}




		public Page(int everyPage, int totalCount, int totalPage, 
	            int currentPage,int beginIndex) {  //自定义构造方法
	        this.everyPage = everyPage;
	        this.totalCount = totalCount;
	        this.totalPage = totalPage;
	        this.currentPage = currentPage;
	        this.beginIndex = beginIndex;

	    }
}
