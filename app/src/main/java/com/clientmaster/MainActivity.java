package com.clientmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.clientmaster.common.http.bean.HttpPair;
import com.clientmaster.common.http.bean.RadiumListBaseBean;
import com.clientmaster.common.http.listener.TaskListener;
import com.clientmaster.test.GetRadiumListAsyncTask;
import com.clientmaster.test.RadiumListBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView testview;
    private ArrayList<HttpPair> pairs;
    private int page = 0;
    private List<RadiumListBean> mListRadium;// 场馆数据
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.button);
        testview= (TextView) findViewById(R.id.textview);
        mListRadium=new ArrayList<RadiumListBean>();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refreshXiangmu();

            }
        });
    }
    /**
     * 获取场馆列表接口数据
     */
    private void refreshXiangmu() {
        // TODO Auto-generated method stub
        page = 1;
        pairs = new ArrayList<HttpPair>();
        pairs.add(new HttpPair("rows", "10"));
        pairs.add(new HttpPair("page", page + ""));
        pairs.add(new HttpPair("xzb","39.542637" ));// MyService.LONGITUDE
        pairs.add(new HttpPair("yzb","116.232922" ));// +MyService.LATITUDE
        pairs.add(new HttpPair("sportsitem", ""));
        pairs.add(new HttpPair("level", ""));
        pairs.add(new HttpPair("khpjlevel", ""));
        pairs.add(new HttpPair("spa3", ""));// 省
        pairs.add(new HttpPair("spa4", "" + ""));// 城市
        pairs.add(new HttpPair("spa5", ""));// 区或县
        // pairs.add(new HttpPair("name", "")) ;

        new GetRadiumListAsyncTask(MainActivity.this,
                new TaskListener<RadiumListBaseBean<List<RadiumListBean>>>() {

                    @Override
                    public void onStop(boolean isNoNet) {

                    }

                    @Override
                    public void onStart() {
                    }

                    @Override
                    public void onFinish(
                            RadiumListBaseBean<List<RadiumListBean>> result) {
                        // TODO Auto-generated method stub
//						 pullToRefreshListView.onRefreshComplete();
                        if (mListRadium != null && mListRadium.size() > 0) {
                            mListRadium.clear();
                        }
                        if (result != null && result.getRows() != null
                                && result.getRows().size() > 0) {
                            List<RadiumListBean> data = result.getRows();
                            for (int i = 0; i < data.size(); i++) {
                                mListRadium.add(data.get(i));
                            }
                        }
                        testview.setText(mListRadium.get(0).getName());
                    }
                }, pairs).execute();

    }
}
