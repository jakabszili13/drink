package com.example.drinkfinder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener {
	private Button alphabetic,ingredients;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		alphabetic = (Button) findViewById(R.id.alphabet);
		ingredients = (Button) findViewById(R.id.selecter);
		alphabetic.setOnClickListener(this);
		ingredients.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v==alphabetic){
			startSecondActivity();
			}else if(v==ingredients){
				startThirdActivity();
			}
		
	}
	public void startSecondActivity(){
		Intent launchOtherActivity = new Intent(getApplicationContext(),SecondActivity.class);
		startActivity(launchOtherActivity);
	}
	public void startThirdActivity(){
		Intent launchOtherActivity = new Intent(getApplicationContext(),ThirdActivity.class);
		startActivity(launchOtherActivity);
	}

}
