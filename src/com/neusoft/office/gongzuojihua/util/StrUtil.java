package com.neusoft.office.gongzuojihua.util;

public class StrUtil {

	private static StrUtil strUtil = null;

	private StrUtil() {
		
	}
	
	public static String getString(String string){
		if (strUtil == null) {
			strUtil = new StrUtil();
		}
		String[] str = string.split("[��,��]");
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
	
		if(string.equals("δ��ʼ")){
			str="0";
		}else if(string.equals("�ѿ�ʼ")){
			str="1";
		}else if(string.equals("�����")){
			str="2";
		}else if(string.equals("������")){
			str="3";
		}else if(string.equals("�Ƴ��Ѳ���")){
			str="4";
		}else if(string.equals("�ѹ鵵")){
			str="5";
		}else if(string.equals("�Ƴ�������ͨ��")){
			str="6";
		} else if(string.equals("�ֳ�������ͨ��")){
			str="7";
		}else if(string.equals("�ֳ��Ѳ���")){
			str="8";
		}  
		return str;
	}
	
	
}
