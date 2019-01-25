package com.honglin_chen.spring_ioc.service;

/* 导入CustomPackage包 */
import com.honglin_chen.spring_ioc.bean.CustomerPackage;

public class CustomerService {
	/* 在客户服务中创建一个客户包裹接口实例 */ 
	CustomerPackage customerPackage; 
	
	/* 通过setter注入初始化customerPackage, 将传入的客户包裹实例参量赋值到customerPackage */
	public void setCustomerPackage(CustomerPackage customerPackage) {
		this.customerPackage = customerPackage; 
	}
	
	/* 服务提供callSupport方法 */ 
	public String callSupport() {
		return customerPackage.support(); 
	}
}
