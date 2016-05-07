package com.ecc.lihao;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
	
	
	private final SparseArray<View> mViews;
	private int mPosition;
	private View mConvertView;
	
	public ViewHolder(Context context,ViewGroup parent,int itemLayoutId,int position) {
		// TODO 自动生成的构造函数存根
		this.mPosition = position;
		this.mConvertView = LayoutInflater.from(context).inflate(itemLayoutId, parent,false);
		this.mViews = new SparseArray<View>();
		mConvertView.setTag(this);
	}
	
	public static ViewHolder get(Context context,View convertView,ViewGroup parent,int itemLayoutId,int position) {
		if (convertView == null) {
			return new ViewHolder(context, parent, itemLayoutId, position);
		} else {
			ViewHolder holder = (ViewHolder) convertView.getTag();
			holder.mPosition = position;
			return holder;
		}
		
	}
	
	public View getmConvertView() {
		return mConvertView;
	}

	public <T extends View>T getView(int viewId) {
		View view = mViews.get(viewId);
		if (view == null) {
			view = mConvertView.findViewById(viewId);
			mViews.put(viewId, view);
		}
		return (T) view;
	}
	
	//设置TextView的值
	public ViewHolder setText(int viewId,String text){
		TextView tv = getView(viewId);
		tv.setText(text);
		return this;
	}
	//ImageView的值
	public ViewHolder setImageResource(int viewId,int resId) {
		ImageView iv = getView(viewId);
		iv.setImageResource(resId);
		return this;
	}
	public ViewHolder setImageBitmap(int viewId,Bitmap bm) {
		ImageView iv = getView(viewId);
		iv.setImageBitmap(bm);
		return this;
	}
	public ViewHolder setImageUri(int viewId,Uri uri) {
		ImageView iv = getView(viewId);
		iv.setImageURI(uri);
		return this;
	}
	
}
