package org.bitspilani.pearl;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class EventManaging extends Activity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		setContentView(R.layout.events);
		
		ImageButton i1 = (ImageButton)findViewById(R.id.event1);
		ImageButton i2 = (ImageButton)findViewById(R.id.event2);
		ImageButton i3 = (ImageButton)findViewById(R.id.event3);
		ImageButton i4 = (ImageButton)findViewById(R.id.event4);
		ImageButton i5 = (ImageButton)findViewById(R.id.event5);
		ImageButton i6 = (ImageButton)findViewById(R.id.event6);
		ImageButton i7 = (ImageButton)findViewById(R.id.event7);
		ImageButton i8 = (ImageButton)findViewById(R.id.event8);
		ImageButton i9 = (ImageButton)findViewById(R.id.event9);
		ImageButton i10 = (ImageButton)findViewById(R.id.event10);
		ImageButton i11 = (ImageButton)findViewById(R.id.event11);
		ImageButton i12 = (ImageButton)findViewById(R.id.event12);
		ImageButton i13 = (ImageButton)findViewById(R.id.event13);
		ImageButton i14 = (ImageButton)findViewById(R.id.event14);
		ImageButton i15 = (ImageButton)findViewById(R.id.event15);
		ImageButton i16 = (ImageButton)findViewById(R.id.event16);
		ImageButton i17 = (ImageButton)findViewById(R.id.event17);
		ImageButton i18 = (ImageButton)findViewById(R.id.event18);
		ImageButton i19 = (ImageButton)findViewById(R.id.event19);
		ImageButton i20 = (ImageButton)findViewById(R.id.event20);
		
		i1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,WolfMother.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,JavedAli.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Catharasis.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,HipHop.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Glitterati.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		
		i6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,TillDeaf.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Electro.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Fraglore.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Aspire.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		i10.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Finance.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		
		i11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Music.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i12.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Arts.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i13.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Dance.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i14.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,VFX.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i15.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Photog.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		
		i16.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Drama.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i17.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Journal.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i18.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Literary.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
		i19.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Quiz.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		i20.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EventManaging.this,Hindi.class));
				overridePendingTransition(R.layout.from_middle, R.layout.to_middle);
			}
		});
		
	}
}
