/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: chentianxing_test1
 * @Package: com.chentianxing.common.utils 
 * @Description: TODO
 * @author: 陈天星  
 * @date: 2019年7月11日 下午7:03:10 
 * @version: V1.0   
 */
package com.chentianxing.common.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author:陈天星
 * @date: 2019年7月11日 下午7:03:10  
 */
public class StringUtilTest {

	/**
	 * Test method for {@link com.chentianxing.common.utils.StringUtil#hasLength(java.lang.String)}.
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	public void testHasLength() throws UnsupportedEncodingException {
		boolean hasLength = StringUtil.hasLength(" ");
		System.out.println(hasLength);
	}

	/**
	 * Test method for {@link com.chentianxing.common.utils.StringUtil#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
		boolean hasLength = StringUtil.hasText(" ");
		System.out.println(hasLength);
	}

	@Test
	public void testRandomChineseString() {
		String str = StringUtil.randomChineseString(8);
		System.out.println(str);
	}
	
	@Test
	public void testGenerateChineseName() {
		String str = StringUtil.generateChineseName();
		System.out.println(str);
	}
	
}
