package com.yuchengtech.yuchengo2o.activity.impl;

import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import cn.aigestudio.datepicker.interfaces.OnDateSelected;
import cn.aigestudio.datepicker.views.DatePicker;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.yuchengtech.yuchengo2o.R;

/**
 * 订单查询界面
 * 
 * @author 袁帅 Create on 2015-04-14
 */
public class OrdersActivity extends Activity implements OnClickListener {

	private DatePicker mDatePicker;// 时间选择器

	@ViewInject(R.id.btn_time)
	private Button btn_time;// 弹出时间选择窗口
	@ViewInject(R.id.btn_search)
	private Button btn_search;// 搜索
	@ViewInject(R.id.tv_order_num_for_search)
	private TextView tv_search;// 输入订单号的文本框
	@ViewInject(R.id.rv_orders)
	private RecyclerView mRecyclerView;// 订单列表
	private RecyclerView.LayoutManager mLayoutManager;// 列表管理器

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_orders);
		ViewUtils.inject(this);
		// 初始化时间选择器
		// TODO
		// 初始化RecylcerView
		mRecyclerView.setHasFixedSize(true);// 设置View固定尺寸
		mLayoutManager = new LinearLayoutManager(this);
		mRecyclerView.setLayoutManager(mLayoutManager);
	}

	@Override
	@OnClick({ R.id.btn_time })
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_time:
			// 点击了弹出时间选择器按钮
			final AlertDialog dialog = new AlertDialog.Builder(this).create();
			dialog.show();
			DatePicker datePicker = new DatePicker(OrdersActivity.this);
			datePicker.setOnDateSelected(new OnDateSelected() {
				@Override
				public void selected(List<String> date) {
					StringBuffer timeSpan = null;// 时间区间
					// 将点选的时间加入到字符串中
					for (String time : date) {
						timeSpan.append(time);
					}
					tv_search.setText(timeSpan);
					dialog.dismiss();
				}
			});
			ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
					ViewGroup.LayoutParams.WRAP_CONTENT,
					ViewGroup.LayoutParams.WRAP_CONTENT);
			dialog.getWindow().setContentView(datePicker, params);
			dialog.getWindow().setGravity(Gravity.CENTER);

			break;

		default:
			break;
		}
	}

	/**
	 * 订单展示列表的适配器
	 */
	private class OrderAdapter extends RecyclerView.Adapter {

		@Override
		public int getItemCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void onBindViewHolder(ViewHolder arg0, int arg1) {
			// TODO Auto-generated method stub

		}

		@Override
		public ViewHolder onCreateViewHolder(ViewGroup arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
