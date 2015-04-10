package com.yuchengtech.yuchengo2o.activity.impl;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.lidroid.xutils.ViewUtils;
import com.yuchengtech.yuchengo2o.R;
import com.yuchengtech.yuchengo2o.activity.BaseActivity;

/**
 * 应用主界面
 * 
 * @author 袁帅 Create on 2015-04-10
 */
public class MainActivity extends BaseActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewUtils.inject(this);
	}

	@Override
	public void onClick(View v) {

	}

}
