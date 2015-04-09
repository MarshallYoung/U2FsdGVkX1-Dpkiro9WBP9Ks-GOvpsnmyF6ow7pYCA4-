package com.yuchengtech.yuchengo2o.activity;

import com.yuchengtech.yuchengo2o.Yucheng020Application;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * ������һЩ���ܵ�Activity����
 * 
 * @author Ԭ˧ Create at 2015-04-08
 */
public class BaseActivity extends Activity {

	long touchTime = 0; // ����������˼���ʱ���
	long waitTime = 2000; // �ڶ������ڵڶ��ΰ����˼����˳�application

	/**
	 * �ж��Ƿ�����������,û�з���false
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
	 * ���������˳�Application�Ĺ���
	 */
	@Override
	public void onBackPressed() {
		long currentTime = System.currentTimeMillis();
		if ((touchTime + waitTime) < currentTime) {
			Toast.makeText(this, "�ٴε���˳�", Toast.LENGTH_SHORT).show();
			touchTime = currentTime;
		} else {
			finish();
		}
	}
}
