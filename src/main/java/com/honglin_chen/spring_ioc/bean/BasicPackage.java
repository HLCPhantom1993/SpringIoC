package com.honglin_chen.spring_ioc.bean;

/* BasicPackage 执行 CustomerPackage 接口实现其类本身定义的support()方法 */
public class BasicPackage implements CustomerPackage {
	@Override
	public String support() {
		return "Support basic customers"; 
	}
}
