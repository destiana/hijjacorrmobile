package com.example.lenovog40.tampilanawal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

private Context context;
public Integer[] images={

R.drawable.birutanpaalis, R.drawable.ikat1,
R.drawable.ikat2, R.drawable.ikat3,
R.drawable.terangalis, R.drawable.terangtanpaalis,


};

public ImageAdapter(Context c){

context=c;

}
@Override
public int getCount(){
return images.length;


}
	@Override
public Object getItem(int position){
	return images[position];

}
public long getItemId(int position){
	return 0;
}
public View getView(int position, View convertView, ViewGroup parent){
ImageView imageView = new ImageView(context);
imageView.setImageResource(images[position]);
imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
imageView.setLayoutParams(new GridView.LayoutParams(240,240));
return imageView;
}




}
