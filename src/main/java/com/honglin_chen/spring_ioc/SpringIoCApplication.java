/* Spring Boot Application 的 root 程序 */
package com.honglin_chen.spring_ioc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
/* 导入context support中的ClassPathXml功能实现读取Bean文件 */ 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
/* 导入客户服务接口 */ 
import com.honglin_chen.spring_ioc.service.CustomerService;

@SpringBootApplication
public class SpringIoCApplication {

	public static void main(String[] args) {
		/* 通过注入bean构造文件为应用创建一个context */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		/* 通过context将customerService bean初始化 */ 
		CustomerService service = context.getBean(CustomerService.class);
		/* 通过bean文件的设置, 当对customerService bean初始化后, 其对应的成员变量customerPackage
		 * 会被依赖注入机制赋值(通过setter方法), 因为<ref>的bean属性, 我们会将basicPackage bean自
		 * 动捆绑到customerPackage(通过setter方法和<ref bean=" ">机制会自动触发setCustomerPack
		 * age方法实现赋值). 
		 */
		System.out.println(service.callSupport()); 
		/* 当前的方法返回的是通过赋值过的customerPackage call的BasicPackage中的support方法实现 */ 
		
		/* 为了避免资源泄漏, 程序结束需要将context资源释放并关闭 */
		context.close();
	}

}

