package com.neusoft.office.gongzuojihua.util;

public class StrUtil {

	private static StrUtil strUtil = null;

	private StrUtil() {
		
	}
	
	public static String getString(String string){
		if (strUtil == null) {
			strUtil = new StrUtil();
		}
		String[] str = string.split("[年,月]");
		String str1 ="";
	    for (int i = 0; i < str.length; i++) {
	    	
	    	if(i==0){
	    		str1+=str[i]+"-";
	    	}else{
	    		str1+=str[i];
	    	}  
	    }	   
		return str1;
	}
	
	
	public static String getInt(String string){
		if (strUtil == null) {
			strUtil = new StrUtil();
		}		
		String str="";
	
		if(string.equals("未开始")){
			str="0";
		}else if(string.equals("已开始")){
			str="1";
		}else if(string.equals("已完结")){
			str="2";
		}else if(string.equals("已送审")){
			str="3";
		}else if(string.equals("科长已驳回")){
			str="4";
		}else if(string.equals("已归档")){
			str="5";
		}else if(string.equals("科长审批已通过")){
			str="6";
		} else if(string.equals("局长审批已通过")){
			str="7";
		}else if(string.equals("局长已驳回")){
			str="8";
		}  
		return str;
	}
	
	
}
