package org.bitspilani.pearl;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class Music extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		setContentView(R.layout.event1);
		TextView tv = (TextView)findViewById(R.id.title);
		tv.setText(R.string.music);
		TextView tv1 = (TextView)findViewById(R.id.description);
		tv1.setText(R.string.music_ds);
	}
}
