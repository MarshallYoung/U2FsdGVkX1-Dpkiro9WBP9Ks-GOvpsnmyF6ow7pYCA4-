package com.yuchengtech.yuchengo2o.activity.impl;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.WriterException;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.yuchengtech.yuchengo2o.R;
import com.yuchengtech.yuchengo2o.activity.BaseActivity;
import com.zxing.activity.CaptureActivity;
import com.zxing.encoding.EncodingHandler;

public class MainActivity extends BaseActivity implements OnClickListener {

	@ViewInject(R.id.et_webaddress)
	private EditText et_webaddress;// 测试用,网址
	@ViewInject(R.id.btn_createqrcode)
	private Button btn_createqrcode;// 测试用,生成二维码
	@ViewInject(R.id.iv_qrcode)
	ImageView iv_qrcode;// 测试用,二维码图像
	@ViewInject(R.id.btn_scanner)
	private Button btn_scanner;// 测试用,扫描二维码
	@ViewInject(R.id.tv_result)
	private TextView tv_result;// 测试用,扫描结果

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewUtils.inject(this);
	}

	@Override
	@OnClick({ R.id.btn_createqrcode, R.id.btn_scanner })
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_createqrcode:
			Toast.makeText(this, "生成", Toast.LENGTH_SHORT).show();
			try {
				Bitmap qrBitmap = EncodingHandler.createQRCode(et_webaddress
						.toString().trim(), 180);
				iv_qrcode.setImageBitmap(qrBitmap);
			} catch (WriterException e) {
				e.printStackTrace();
			}

			break;
		case R.id.btn_scanner:
			Toast.makeText(this, "扫描", Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(this, CaptureActivity.class);
			startActivityForResult(intent, 0);
			break;

		}

	}

	/**
	 * 测试用,返回测试结果
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (resultCode == RESULT_OK) {
			tv_result.setText(data.getExtras().getString("result"));

		}
	}

}
