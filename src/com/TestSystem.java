/**  
* @Title: TestSystem.java  
* @Package com  
* @Description: TODO(用一句话描述该文件做什么)  
* @author yangfei 
* @date 2018年3月28日  
* @version V1.0  
*/ 
package com;

/**  
 * @ClassName: TestSystem  
 * @Description: TODO(系统环境测试类)  
 * @author yangfei
 * @date 2018年3月28日  
 *    
 */
public class TestSystem {
	public static void main(String[] args) {
		System.out.println(System.getenv("testkey"));
//		.equals(System.getenv("foo"));
	}
}
