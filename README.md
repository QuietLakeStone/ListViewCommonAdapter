# ListViewCommonAdapter
optimized and common BaseAdapter include ViewHolder convertView.

ViewHolder use SparseArray<View> mViews to cache itemView;

mListView.setAdapter(new MyAdapter(MainActivity.this, 3,R.layout.item_view));
  3   is     @Override
            public int getCount() {
	            return mNum;
	          }                         it can be List.size()   replace;
	          
	          
only this--->	          ((TextView)holder.getView(R.id.tv_title)).setText("孙悟空");
			                  ((TextView)holder.getView(R.id.tv_content)).setText("这是大师兄");
			                  
			         we can use         Chain programming     because return this;
