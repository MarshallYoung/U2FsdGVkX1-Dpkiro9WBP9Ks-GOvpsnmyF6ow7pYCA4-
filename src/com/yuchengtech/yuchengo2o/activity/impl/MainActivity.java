package com.yuchengtech.yuchengo2o.activity.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.event.OnClick;
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
		setContentView(R.layout.activity_main_port);
		ViewUtils.inject(this);
	}

	@Override
	@OnClick({ R.id.tv_cashier, R.id.tv_orders, R.id.tv_sales })
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tv_cashier:
			// 收银
			Toast.makeText(this, "收银", Toast.LENGTH_SHORT).show();
			break;
		case R.id.tv_orders:
			// 订单管理
			Intent enterOrders = new Intent(this, OrdersActivity.class);
			startActivity(enterOrders);
			break;
		case R.id.tv_sales:
			// 店铺活动
			break;

		default:
			break;
		}
	}

}
