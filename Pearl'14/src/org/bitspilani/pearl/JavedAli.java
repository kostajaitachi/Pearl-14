package org.bitspilani.pearl;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class JavedAli extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		setContentView(R.layout.event1);
		TextView tv = (TextView)findViewById(R.id.title);
		tv.setText(R.string.javedali);
		TextView tv1 = (TextView)findViewById(R.id.description);
		tv1.setText(R.string.javedali_ds);
		
	}
}
