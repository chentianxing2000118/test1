/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: NewTest.java 
 * @Prject: chentianxing_test1
 * @Package: com.chentianxing.common.utils 
 * @Description: TODO
 * @author: 陈天星  
 * @date: 2019年7月11日 下午7:49:20 
 * @version: V1.0   
 */
package com.chentianxing.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import org.junit.Test;

import com.chentianxing.common.bean.Person;

/** 
 * @ClassName: NewTest 
 * @Description: TODO
 * @author:陈天星
 * @date: 2019年7月11日 下午7:49:20  
 */
public class NewTest {

	@Test
	public void testAddPerson() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try {
			d = df.parse("2010-1-1");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		for (int i = 0; i < 100; i++) {
			Person p = new Person(StringUtil.generateChineseName(), RandomUtil.random(1, 120), StringUtil.randomChineseString(140), DateUtil.randomDate(d));
			System.out.println(p);
		}
		
		
	}
	
}
