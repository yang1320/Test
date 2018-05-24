/**  
* @Title: Singleton.java  
* @Package com.designModel  
* @Description: TODO(用一句话描述该文件做什么)  
* @author yangfei 
* @date 2018年3月27日  
* @version V1.0  
*/ 
package com.designModel;

/**  
 * @ClassName: Singleton  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author yangfei
 * @date 2018年3月27日  
 *    
 */
public class Singleton {
	private String field1;
	private String field2;
	
	private static Singleton singleton;
	/**
	 * @return the field1
	 */
	public String getField1() {
		return field1;
	}

	/**
	 * @param field1 the field1 to set
	 */
	public void setField1(String field1) {
		this.field1 = field1;
	}

	/**
	 * @return the field2
	 */
	public String getField2() {
		return field2;
	}

	/**
	 * @param field2 the field2 to set
	 */
	public void setField2(String field2) {
		this.field2 = field2;
	}

	private Singleton(){
		field1="1";
		field2="2";
		
	}
	
	/**
	 * 
	 * @Title: getSingleInstance   
	 * @Description: TODO(获取一个唯一实例)        
	 * @param: @return	 
	 * @return: Singleton      
	 * @throws
	 */
	public static Singleton getSingleInstance(){
		if(null==singleton){
			singleton=new Singleton();
			return singleton;
		}else{
			return singleton;
		}
		
	}
}
