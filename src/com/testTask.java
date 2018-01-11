package com;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class testTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new testTask().taskByScheduled();


	}
	
	
	public void taskByThread() throws InterruptedException{
		testThread  td=new testThread();
		while(true){
			td.run();
			//td.start();
			td.sleep(1000*3);
		}
	}
	
	
	public void taskByTimer(){
		TimerTask timerTask=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("timerTask run.........");
			}
		};
		Timer  timer=new Timer();
		timer.schedule(timerTask, 1000,1000*2);
		
	}
	
	public void taskByScheduled(){
		Runnable ra=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runable run.....");
				
			}
		};
		ScheduledExecutorService ses=Executors.newSingleThreadScheduledExecutor();
		ses.scheduleAtFixedRate(ra, 0, 500, TimeUnit.MILLISECONDS);
	}

}
