package com.clientmaster.test;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;

import com.clientmaster.common.http.bean.HttpPair;
import com.clientmaster.common.http.bean.RadiumListBaseBean;
import com.clientmaster.common.http.listener.TaskListener;
import com.clientmaster.common.http.thread.TAsyncTask;
import com.clientmaster.common.http.utils.HttpHelper;
import com.google.gson.reflect.TypeToken;

public class GetRadiumListAsyncTask extends
		TAsyncTask<RadiumListBaseBean<List<RadiumListBean>>> {
	private ArrayList<HttpPair> pairs;

	public GetRadiumListAsyncTask(Context context,
			TaskListener<RadiumListBaseBean<List<RadiumListBean>>> listener,
			ArrayList<HttpPair> pairs) {
		super(context, listener);
		// TODO Auto-generated constructor stub
		this.pairs = pairs;
	}

	@Override
	protected RadiumListBaseBean<List<RadiumListBean>> doInBackground(
			Object... params) {
		// pairs.add(new HttpPair("name", "input"));
		RadiumListBaseBean<List<RadiumListBean>> bean = HttpHelper.getInstance(
				mContext).post(MyInterface.RDIUM_URL, pairs,
				new TypeToken<RadiumListBaseBean<List<RadiumListBean>>>() {
				}.getType(), null);
		return bean;
	}

	@Override
	protected void onPostExecute(RadiumListBaseBean<List<RadiumListBean>> result) {
		super.onPostExecute(result);
	}
}
