package com.wz.proxy;

public class RealSearcher implements Searcher {

	@Override
	public String doSearch(String userId, String keyword) {
		// TODO Auto-generated method stub
		System.out.println("用户"+userId+"使用关键词"+keyword+"查询商务信息！");
		return "返回具体内容";
	}

}
