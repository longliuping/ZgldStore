package com.zgld.mall.sync;

import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.content.Context;
import android.os.AsyncTask;

import com.zgld.mall.utils.ConfirmDialog;

/**
 * 异步上传图片
 * 
 * @author LLP
 * 
 */
public class AsyncUpImgTask extends AsyncTask<String, Void, String> {
	private CallbackPic callback;
	private String fileName, str;
	private byte[] stream;
	ConfirmDialog confirmDialog;
	Context context;

	public AsyncUpImgTask(Context context, CallbackPic callback, String fileName, byte[] stream, String str) {
		this.callback = callback;
		this.fileName = fileName;
		this.str = str;
		this.stream = stream;
		this.context = context;
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		confirmDialog = new ConfirmDialog(context, "图片上传中...");
		confirmDialog.show();
	}

	@Override
	protected String doInBackground(String... params) {
		String result = null;
		String end = "\r\n";
		String twoHyphens = "--";
		String boundary = "*****";
		try {
			URL url = new URL(str);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			/* 允许Input、Output，不使用Cache */
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setUseCaches(false);
			/* 设置传送的method=POST */
			con.setRequestMethod("POST");
			/* setRequestProperty */
			con.setRequestProperty("Connection", "Keep-Alive");
			con.setRequestProperty("Charset", "UTF-8");
			con.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
			/* 设置DataOutputStream */
			DataOutputStream ds = new DataOutputStream(con.getOutputStream());
			ds.writeBytes(twoHyphens + boundary + end);
			ds.writeBytes("Content-Disposition: form-data; " + "name=\"file\";filename=\"" + fileName + "\";" + end);
			ds.writeBytes(end);
			/* 设置每次写入1024bytes */
			int bufferSize = 1024;
			byte[] buffer = new byte[bufferSize];
			ByteArrayInputStream bais = new ByteArrayInputStream(stream);

			int length = -1;
			/* 从文件读取数据至缓冲区 */
			while ((length = bais.read(buffer)) != -1) {
				/* 将资料写入DataOutputStream中 */
				ds.write(buffer, 0, length);
			}
			ds.writeBytes(end);
			ds.writeBytes(twoHyphens + boundary + twoHyphens + end);
			/* close streams */
			bais.close();
			ds.flush();
			/* 取得Response内容 */
			InputStream is = con.getInputStream();
			int ch;
			StringBuffer b = new StringBuffer();
			while ((ch = is.read()) != -1) {
				b.append((char) ch);
			}

			result = b.toString().trim();
			ds.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	protected void onPostExecute(String result) {
		super.onPostExecute(result);
		if (confirmDialog != null && confirmDialog.isShowing()) {
			confirmDialog.dismiss();
		}
		callback.success(result);
	}

	public interface CallbackPic {
		public void success(String json);
	}
}
