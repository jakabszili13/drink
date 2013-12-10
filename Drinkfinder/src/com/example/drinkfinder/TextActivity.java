package com.example.drinkfinder;

import java.io.File;
import java.io.InputStream;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.AssetManager;
import android.view.Menu;
import android.widget.TextView;

public class TextActivity extends Activity {
	private TextView tv;
	private int number;
	private String[] letters = {"(0-9)","(A)","(B)","(C)","(D)","(E)","(F)","(G)","(H)","(I)","(J)",
			"(K)","(L)","(M)","(N)","(O)","(P)","(Q)","(R)","(S)","(T)","(U)","(V)","(W)","(X)","(Y)","(Z)"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text);
		tv = (TextView) findViewById(R.id.textViewList);
		 Bundle bundle = getIntent().getExtras();
		 if (bundle != null) {
	        	number = bundle.getInt("number");
	        	File file = new File("test.txt");
	        	
	        }else{
	        	///????
	        }
		  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.text, menu);
		return true;
	}

}
