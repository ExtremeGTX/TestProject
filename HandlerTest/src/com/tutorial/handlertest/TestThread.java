package com.tutorial.handlertest;

import android.os.Handler;
import android.util.Log;

public class TestThread implements Runnable{

	Handler mHandler;
	public TestThread() {
		//Get MainHandler Instance 
		mHandler = MainHandler.getMainHandler();
	}
	
	@Override
	public void run() {
		while(true)
		{
			mHandler.obtainMessage(100).sendToTarget();
			Log.v("MyApp", "inside Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
