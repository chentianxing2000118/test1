/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Person.java 
 * @Prject: chentianxing_test1
 * @Package: com.chentianxing.common.bean 
 * @Description: TODO
 * @author: 陈天星  
 * @date: 2019年7月11日 下午7:33:23 
 * @version: V1.0   
 */
package com.chentianxing.common.bean;

import java.util.Date;

/** 
 * @ClassName: Person 
 * @Description: TODO
 * @author:陈天星
 * @date: 2019年7月11日 下午7:33:23  
 */
public class Person {

	private String name;
	private Integer age;
	private String abount;
	private Date created;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbount() {
		return abount;
	}
	public void setAbount(String abount) {
		this.abount = abount;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Person(String name, Integer age, String abount, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.abount = abount;
		this.created = created;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", abount=" + abount + ", created=" + created + "]";
	}
	
}
