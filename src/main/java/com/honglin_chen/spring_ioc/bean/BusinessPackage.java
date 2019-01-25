package com.honglin_chen.spring_ioc.bean;

public class BusinessPackage implements CustomerPackage {
	@Override
	public String support() {
		return "Support Business Customers";
	}
}
