package com.xum.study;

import android.os.Bundle;
import android.util.Log;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    
	public final static String LockActivity_Intent = "com.xum.intent.action.LockActivity";
	public final static String TAG = "MainActivity";
	public final static int LOCK_REQUEST_TO_LOCK = 0;
	private TextView resultText;
	private Button show;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		show.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(LockActivity_Intent);
				startActivityForResult(i, MainActivity.LOCK_REQUEST_TO_LOCK);
			}
		});
	}

	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		Log.d(TAG,"onActivityResult " + requestCode + " " + resultCode);
		if(requestCode == MainActivity.LOCK_REQUEST_TO_LOCK){
			switch(resultCode){
			    case 1: //Matched
			    	Log.d(TAG,"success match");
			    	// do something ...
			    	resultText.setText("success!");
			    	break;
			}
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
