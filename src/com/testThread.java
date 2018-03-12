package com;

import org.junit.Test;

public class testThread extends Thread  implements Runnable{
	public static void main(String[] args) throws InterruptedException {
//		new testThread().deadLock();//此种死锁与jdk版本有关，jdk1.8报错
	
	}
	


	
	
	public void getNameAndState(){
		while(true){
			testThread tThread=new testThread();
			tThread.start();	//start开辟新线程
			
			System.out.println("tThread.getState:\t"+tThread.getState());
			//tThread.start();	//不能多次启动一个线程；与当前线程threadStatus有关
			tThread.run();
			System.out.println("main's thread:\t"+Thread.currentThread().getName());
		}	
		
	}
	
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000*3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("tThread's thread:\t"+Thread.currentThread().getName());
		// TODO Auto-generated method stub

	}
	
//	@Test
//	public void deadLock(){
//		Object o1="A";
//		Object o2="B";
//		testThread t1=new testThread(){
//			@Override
//			public void run() {
//				synchronized (o2) {
//					
//					try {
//						System.out.println("o2lock!:"+Thread.currentThread().getName());
//						Thread.sleep(1000*1);	//同步块执行一旦被锁，同步块随时中断执行
//						System.out.println("o2lock after!");
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println("进入o1！");
//					//System.out.println(o2);
//				}
//			}
//		};
//		
//		testThread t2=new testThread(){
//			@Override
//			public void run() {
//				
//				synchronized (o1) {
//					
//					try {
//						System.out.println("111111o1lock!:"+Thread.currentThread().getName());
//						Thread.sleep(1000*1);
//						System.out.println("111o1lock after!");
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println("进入o2！");
//					//System.out.println(o1);
//				}
//				
//			}
//		};
//		
//		t1.start();
//		t2.start();
//		
//	} 
	

}
