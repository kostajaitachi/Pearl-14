package org.bitspilani.pearl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class Schedule extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		setContentView(R.layout.schedule_layout);
		
		ImageButton  day01 = (ImageButton)findViewById(R.id.day1);
		ImageButton  day02 = (ImageButton)findViewById(R.id.day2);
		ImageButton  day03 = (ImageButton)findViewById(R.id.day3);
		
		day01.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Schedule.this,Day1.class));
			}
		});
		
		day02.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Schedule.this,Day2.class));
			}
		});

		day03.setOnClickListener(new View.OnClickListener() {
	
	@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
		startActivity(new Intent(Schedule.this,Day3.class));
			}
		});
	}
	
	
	
	

}
