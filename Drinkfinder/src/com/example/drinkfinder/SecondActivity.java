package com.example.drinkfinder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class SecondActivity extends Activity  {
	
	ImageView selectedImage;  
	private int number;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
     selectedImage=(ImageView)findViewById(R.id.imageView1);
     gallery.setSpacing(1);
     gallery.setAdapter(new GalleryImageAdapter(this));

      // click listener for Gallery
     gallery.setOnItemClickListener(new OnItemClickListener() {
        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            number = position;
            Toast.makeText(SecondActivity.this, "Your selected position = " + number, Toast.LENGTH_SHORT).show();
        	Intent launchActivity = new Intent(getApplicationContext(),
                    TextActivity.class);
        	launchActivity.putExtra("number", number);
         }


     });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}


