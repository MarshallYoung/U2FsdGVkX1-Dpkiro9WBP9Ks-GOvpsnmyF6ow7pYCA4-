package com.yuchengtech.yuchengo2o.activity;

import com.yuchengtech.yuchengo2o.R;
import com.yuchengtech.yuchengo2o.Yucheng020Application;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * 添加了一些功能的Activity基类
 * 
 * @author 袁帅 Create at 2015-04-08
 */
public class BaseActivity extends Activity {

	long touchTime = 0; // 第一次按下后退键的时间点
	long waitTime = 2000; // 在多少毫秒内第二次按下后退键就会退出application

	/**
	 * 判断是否联网
	 */
	public boolean hasInternetConnected() {
		ConnectivityManager manager = (ConnectivityManager) Yucheng020Application
				.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
		if (manager != null) {
			NetworkInfo network = manager.getActiveNetworkInfo();
			if (network != null && network.isConnectedOrConnecting()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 监听后退按键,连击两次后退退出application
	 */
	@Override
	public void onBackPressed() {
		long currentTime = System.currentTimeMillis();
		if ((touchTime + waitTime) < currentTime) {
			Toast.makeText(this,
					this.getResources().getString(R.string.exit_note),
					Toast.LENGTH_SHORT).show();
			touchTime = currentTime;
		} else {
			finish();
		}
	}
}
