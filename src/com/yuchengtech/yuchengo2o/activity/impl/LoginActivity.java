package com.yuchengtech.yuchengo2o.activity.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.yuchengtech.yuchengo2o.R;
import com.yuchengtech.yuchengo2o.activity.BaseActivity;

/**
 * 登陆界面
 * 
 * @author 袁帅 Create on 2015-04-09
 */
public class LoginActivity extends BaseActivity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		ViewUtils.inject(this);
	}

	@Override
	@OnClick(R.id.btn_login)
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_login:
			// 点击登陆
			Intent intent = new Intent(this, MainActivity.class);
			startActivity(intent);

			break;
		}
	}
}
