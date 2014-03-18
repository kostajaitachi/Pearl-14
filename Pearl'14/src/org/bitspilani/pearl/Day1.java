package org.bitspilani.pearl;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.webkit.WebView;

public class Day1 extends Activity{
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onCreate(savedInstanceState);
    	getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
    	setContentView(R.layout.web);
		WebView webView = (WebView) findViewById(R.id.web123);
		webView.getSettings().setBuiltInZoomControls(true);
		webView.loadDataWithBaseURL("file:///android_asset/", "<img src='file:///android_res/drawable/day1sch.png' />", "text/html", "utf-8", null);

    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// TODO Auto-generated method stub
    	return super.onCreateOptionsMenu(menu);
    }

}
