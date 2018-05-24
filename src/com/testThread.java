package com;
import java.util.Map;
import org.junit.Test;
import com.yangfeiself.tool.JsonConvert;
public class testThread extends Thread  implements Runnable{
	public static void main(String[] args) throws Exception {
//		new testThread().deadLock();//此种死锁与jdk版本有关，jdk1.8报错
		Map<Thread, StackTraceElement[]> maps = Thread.getAllStackTraces();
		System.out.println("当前程序中的线程集合："+JsonConvert.toJson(maps.keySet()));
		for (Thread thread : maps.keySet()) {
			System.out.println("线程名称："+thread.getName());
		}
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
		/**
		 * Attach Listener
			Finalizer
			Signal Dispatcher
			Reference Handler
			是JVM 启动的
			下边做一个解释：
			Attach Listener ：线程是负责接收到外部的命令，而对该命令进行执行的并且吧结果返回给发送者。通常我们会用一些命令去要求jvm给我们一些反馈信息，如：java -version、jmap、jstack等等。如果该线程在jvm启动的时候没有初始化，那么，则会在用户第一次执行jvm命令时，得到启动。
			signal dispather： 前面我们提到第一个Attach Listener线程的职责是接收外部jvm命令，当命令接收成功后，会交给signal dispather线程去进行分发到各个不同的模块处理命令，并且返回处理结果。signal dispather线程也是在第一次接收外部jvm命令时，进行初始化工作。
			Finalizer：  用来执行所有用户Finalizer 方法的线程
			Reference Handler ：它主要用于处理引用对象本身（软引用、弱引用、虚引用）的垃圾回收问题。
		 */
}
