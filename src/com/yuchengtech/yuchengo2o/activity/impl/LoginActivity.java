package com.yuchengtech.yuchengo2o.activity.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.yuchengtech.yuchengo2o.R;
import com.yuchengtech.yuchengo2o.activity.BaseActivity;

/**
 * 登陆界面
 * 
 * @author 袁帅 Create on 2015-04-09
 */
public class LoginActivity extends BaseActivity implements OnClickListener {

	@ViewInject(R.id.et_company)
	private EditText et_company;// 公司编号
	@ViewInject(R.id.et_account)
	private EditText et_account;// 账户编号
	@ViewInject(R.id.et_password)
	private EditText et_password;// 密码
	@ViewInject(R.id.cb_save_account)
	private CheckBox cb_save_account;// 保存账号
	@ViewInject(R.id.cb_auto_logins)
	private CheckBox cb_auto_login;// 自动登录
	@ViewInject(R.id.btn_login)
	private Button btn_login;

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
			// 点击了登陆按钮
			Intent enterHomeIntent = new Intent(this, MainActivity.class);
			startActivity(enterHomeIntent);
			break;
		default:
			break;
		}
	}
}
