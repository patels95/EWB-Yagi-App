package com.example.ewbyagiapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	private Button mAbout;
	private Button mInstructions;
	private Button mReader;
	private LinearLayout mFooter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mAbout = (Button) findViewById(R.id.aboutUs);
		mInstructions = (Button) findViewById(R.id.instructions);
		mReader = (Button) findViewById(R.id.reader);
		mFooter = (LinearLayout) findViewById(R.id.footer);
		
		mAbout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startAbout();
			}
		});
		
		mInstructions.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startInstructions();
			}
		});
		
		mReader.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startReader();
			}
		});
		
		mFooter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				gaiClick();	
			}
		});
	}
	
	private void startAbout(){
		Intent intent = new Intent(this, AboutActivity.class);
		startActivity(intent);
	}
	
	private void startInstructions(){
		Intent intent = new Intent(this, InstructionsActivity.class);
		startActivity(intent);
	}
	
	private void startReader(){
		Intent intent = new Intent(this, ReaderActivity.class);
		startActivity(intent);
	}
	
	private void gaiClick(){
		String url ="http://globalappinitiative.org/";
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
		startActivity(intent);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
