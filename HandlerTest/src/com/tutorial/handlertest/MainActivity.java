package com.tutorial.handlertest;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;

public class MainActivity extends Activity implements Callback {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Setup UIHandler and static Class MainHandler
		new MainHandler(new Handler(getMainLooper(), this));
		// Launch a thread for testing our handler
		new Thread(new TestThread()).start();
	}

	@Override
	public boolean handleMessage(Message msg) {
		// TODO Auto-generated method stub
		Log.v("MyApp", "Msg From TestThread: " + msg.toString());
		return false;
	}

}
