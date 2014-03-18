package org.bitspilani.pearl;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

public class Home extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		setContentView(R.layout.home);
		
final AnimationDrawable anim;
		
		
		final ImageView iv=(ImageView) findViewById(R.id.imageView1);
		iv.setBackgroundResource(R.animator.animation);
		anim=(AnimationDrawable) iv.getBackground();
	
		 anim.start();  
		  
	     long totalDuration = 0;  
	      for(int i = 0; i< anim.getNumberOfFrames();i++){  
	       totalDuration += anim.getDuration(i);  
	      }  
	      Timer timer = new Timer();  
	  
	   TimerTask timerTask = new TimerTask(){  
	       @Override  
	       public void run() {  
	  
	                anim.stop();   
	                startActivity(new Intent(Home.this,Pearl.class));
	                finish();
	       }  
	      };  
	   timer.schedule(timerTask, totalDuration); 
		}
		
		/*Thread timer =new Thread(){
			public void run()
			{
				try
				{
				Thread.sleep(3000);
				}
				catch(Exception e){}
				finally{
					startActivity(new Intent(Home.this,Pearl.class));
					finish();
				}
			}
		};
		
		timer.start();*/
		
		
	

}
