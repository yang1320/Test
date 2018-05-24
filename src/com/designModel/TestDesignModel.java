/**  
* @Title: TestDesignModel.java  
* @Package com.designModel  
* @Description: TODO(用一句话描述该文件做什么)  
* @author yangfei 
* @date 2018年3月27日  
* @version V1.0  
*/ 
package com.designModel;

/**  
 * @ClassName: TestDesignModel  
 * @Description: TODO(测试设计模式类)  
 * @author yangfei
 * @date 2018年3月27日  
 *    
 */
public class TestDesignModel {

	/**   
	 * @Title: main   
	 * @Description: TODO(测试入口)        
	 * @param: @param args	 
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-mainTestDesignModelgenerated method stub
		Singleton s1=Singleton.getSingleInstance();
		Singleton s2=Singleton.getSingleInstance();
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}

}
