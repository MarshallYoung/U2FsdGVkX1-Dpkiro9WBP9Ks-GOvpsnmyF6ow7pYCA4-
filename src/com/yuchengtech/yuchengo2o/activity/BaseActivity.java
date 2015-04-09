package com.yuchengtech.yuchengo2o.activity;

import com.yuchengtech.yuchengo2o.Yucheng020Application;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * 集成了一些功能的Activity基类
 * 
 * @author 袁帅 Create at 2015-04-08
 */
public class BaseActivity extends Activity {

	long touchTime = 0; // 单击物理后退键的时间点
	long waitTime = 2000; // 在多少秒内第二次按后退键会退出application

	/**
	 * 判断是否有网络连接,没有返回false
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
	 * 连按两次退出Application的功能
	 */
	@Override
	public void onBackPressed() {
		long currentTime = System.currentTimeMillis();
		if ((touchTime + waitTime) < currentTime) {
			Toast.makeText(this, "再次点击退出", Toast.LENGTH_SHORT).show();
			touchTime = currentTime;
		} else {
			finish();
		}
	}
}
