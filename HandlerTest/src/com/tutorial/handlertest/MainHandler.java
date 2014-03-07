package com.tutorial.handlertest;
import android.os.Handler;
public class MainHandler extends Handler{
	private static Handler mHandler;
	public static Handler getMainHandler()
	{
		return mHandler;
	}
	
	public MainHandler(Handler h) 
	{
		mHandler = h;
	}
}