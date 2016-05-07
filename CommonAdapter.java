package com.ecc.lihao;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;



public abstract class CommonAdapter extends BaseAdapter {
	protected int mNum;
	protected Context mContext;
	protected LayoutInflater mInflater;
	protected int mItemLayoutId;
	public CommonAdapter(Context context,int num,int itemLayoutId) {
		// TODO 自动生成的构造函数存根
		this.mContext = context;
		this.mNum = num;
		this.mInflater = LayoutInflater.from(context);
		this.mItemLayoutId = itemLayoutId;
	}
	@Override
	public int getCount() {
		// TODO 自动生成的方法存根
		return mNum;
	}

	@Override
	public Object getItem(int position) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO 自动生成的方法存根
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
ViewHolder holder = ViewHolder.get(mContext, convertView, parent,mItemLayoutId, position);
		convert(holder, getItem(position));
		
		
		return holder.getmConvertView();
	}
	public abstract void convert(ViewHolder holder,Object obj);

}
