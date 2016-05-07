package com.ecc.lihao;


import java.util.Collections;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private ListView mListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListView = (ListView) findViewById(R.id.list_view);
		
		mListView.setAdapter(new MyAdapter(MainActivity.this, 3,R.layout.item_view));
	}
	class MyAdapter extends CommonAdapter {
		
		
		
		public MyAdapter(Context context, int num, int itemLayoutId) {
			super(context, num, itemLayoutId);
			// TODO 自动生成的构造函数存根
		}

		@Override
		public void convert(ViewHolder holder, Object t) {
			// TODO 自动生成的方法存根
			((TextView)holder.getView(R.id.tv_title)).setText("孙悟空");
			((TextView)holder.getView(R.id.tv_content)).setText("孙悟空");
			
			
		}
		
	}
	
}
