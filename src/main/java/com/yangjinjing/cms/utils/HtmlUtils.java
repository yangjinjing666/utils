package com.yangjinjing.cms.utils;

/** 
* @author 作者:杨今敬
* @version 创建时间：2019年12月23日 上午9:09:23
* 类功能说明 
*/
public class HtmlUtils {
	
	/**
	 * html  字符的转义处理
	 * @param str
	 * @return
	 */
	public static String htmlspecialchars(String str){
		str = str.replaceAll("&", "&amp;");
		str = str.replaceAll("<", "&lt;");
		str = str.replaceAll(">", "&gt;");
		str = str.replaceAll("\"", "&quot;");
		return str;
	}
}
