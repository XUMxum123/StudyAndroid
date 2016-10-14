package com.xum.study;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

public class LockActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View lock_ui = getLayoutInflater().inflate(R.layout.activity_lock, null);
		//setContentView(lock_ui);
		new AlertDialog.Builder(this).setTitle("请输入")  
        .setIcon(android.R.drawable.ic_dialog_info)  
        .setView(lock_ui).setPositiveButton("确定", null)  
        .setNegativeButton("取消", null).show(); 
	}

}
