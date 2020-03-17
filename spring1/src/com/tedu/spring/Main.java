package com.tedu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setUser("Tom");
//		helloWorld.hello(); 
		
		//1. ���� Spring �� IOC ����
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		//2. �� IOC �����л�ȡ bean ��ʵ��
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld2");
		
		//������������ȡ bean ��ʵ��: Ҫ����  IOC ������ֻ��һ����֮����ƥ��� bean, ���ж������׳��쳣. 
		//һ�������, �÷�������, ��Ϊһ�������, ��һ�� IOC ������һ�����Ͷ�Ӧ�� bean Ҳֻ��һ��. 
//		HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);
		
		
		
	}
	
}
