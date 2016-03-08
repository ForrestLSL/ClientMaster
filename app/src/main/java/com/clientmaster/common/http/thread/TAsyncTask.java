package com.clientmaster.common.http.thread;

import android.content.Context;
import android.os.AsyncTask;

import com.clientmaster.common.http.listener.TaskListener;
import com.clientmaster.common.http.utils.NetUtil;


public class TAsyncTask<Result> extends AsyncTask<Object, Object, Result> {
	protected TaskListener<Result> taskListener;
	protected Context mContext;
	protected boolean isNoNet = false;

	public TAsyncTask(Context context, TaskListener<Result> listener) {
		this.taskListener = listener;
		this.mContext = context;
		listener.onStart();
		isNoNet = !NetUtil.isOpenNetwork(context);
		if (isNoNet) {
			onCancelled();
		}
	}

	@Override
	protected Result doInBackground(Object... params) {
		return null;
	}

	@Override
	protected void onPostExecute(Result result) {
		super.onPostExecute(result);
		if (!isNoNet) {
			try {
				taskListener.onFinish(result);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void onCancelled() {
		super.onCancelled();
		taskListener.onStop(isNoNet);
	}
}
