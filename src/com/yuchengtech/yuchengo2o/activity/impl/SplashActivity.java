package com.yuchengtech.yuchengo2o.activity.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.yuchengtech.yuchengo2o.R;

/**
 * 展示公司logo的界面
 * 
 * @author 袁帅 Create on 2015-04-09
 */
public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		Intent intent = new Intent(this, LoginActivity.class);
		startActivity(intent);
		finish();
	}

}
