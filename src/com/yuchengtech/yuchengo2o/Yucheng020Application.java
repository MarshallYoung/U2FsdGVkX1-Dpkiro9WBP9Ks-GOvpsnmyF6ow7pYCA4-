package com.yuchengtech.yuchengo2o;

import android.app.Application;

/**
 * 应用入口
 */
public class Yucheng020Application extends Application {
	private static Yucheng020Application instance = null;

	@Override
	public void onCreate() {
		super.onCreate();
		instance = this;
	}

	public static Yucheng020Application getInstance() {
		return instance;
	}
}
