package com.jackson_siro.mfunshareshop.adaptor;

import com.jackson_siro.mfunshareshop.*;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

	public class CustomList extends ArrayAdapter<String>{
	
		private final Activity context;
		private final String[] mytext;
		private final String[] mytexti;
		private final String[] mytextii;
		
	public CustomList(Activity context,	String[] mytext, String[] mytexti, String[] mytextii) {
		super(context, R.layout.list_singl, mytext);
		this.context = context;
		this.mytext = mytext;
		this.mytexti = mytexti;
		this.mytextii = mytextii;

	}
	
	@Override
	public View getView(int position, View view, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView= inflater.inflate(R.layout.list_single, null, true);
		TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
		TextView txtTitlei = (TextView) rowView.findViewById(R.id.txti);
		TextView txtTitleii = (TextView) rowView.findViewById(R.id.txtii);
	
		ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
		txtTitle.setText(mytext[position]);
		txtTitlei.setText(mytexti[position]);
		txtTitleii.setText(mytextii[position]);
	
		return rowView;
	
	}
}