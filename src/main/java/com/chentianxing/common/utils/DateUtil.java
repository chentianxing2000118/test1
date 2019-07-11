/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtil.java 
 * @Prject: chentianxing_test1
 * @Package: com.chentianxing.common.utils 
 * @Description: TODO
 * @author: 陈天星  
 * @date: 2019年7月11日 下午7:35:12 
 * @version: V1.0   
 */
package com.chentianxing.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author:陈天星
 * @date: 2019年7月11日 下午7:35:12  
 */
public class DateUtil {

	public static Date randomDate(Date startDate){
		
		Date endDate = new Date();
		long i = (long) (Math.random() * (endDate.getTime() - startDate.getTime() + 1)+endDate.getTime());
		endDate.setTime(i);
		return endDate;
		
	}
	
}
