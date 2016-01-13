package com.example.androidloginproject;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	Button mButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mButton = (Button) findViewById(R.id.button1);
		mButton.setOnClickListener(this);
		
		/*EditText username = (EditText)findViewById(R.id.editText1);
		EditText password = (EditText)findViewById(R.id.editText2);	*/	
		
		/*if(password.getText().toString().equals("admin")){
			Toast.makeText(this, "Hello "+username, Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show();
		}*/
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.hello_android, menu);
		return true;
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d("onStart","User start activity");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d("onResume","User resume activity");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d("onPause","User pause activity");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d("onDestroy","User desctroyed activity");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d("onStop","User Stop activity");
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
	
		if (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) {
		Log.d("OnKeyDown","ActionDown");
		}
		return super.onKeyDown(keyCode, event);
	}

	@Override
		public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		float touchX = event.getX();
		float touchY = event.getY();
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			Log.d("ActionDown","ActionDown");
			break;
		case MotionEvent.ACTION_MOVE:
		Log.d("ACTION_MOVE","touchX " + touchX);
		Log.d("ACTION_MOVE","touchY " + touchY);
		break;

		}
		return super.onTouchEvent(event);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.button1:
			EditText username = (EditText)findViewById(R.id.editText1);
			EditText password = (EditText)findViewById(R.id.editText2);
			if(username.getText().toString().equals("")){
				Toast.makeText(this, "Invalid Username", Toast.LENGTH_SHORT).show();
			}else{
				if(password.getText().toString().equals("admin")){
					Toast.makeText(this, "Hello "+username.getText(), Toast.LENGTH_SHORT).show();
				}else{
					Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show();
				}
			}
			
			/*Toast.makeText(this, "Hello Android", Toast.LENGTH_SHORT).show();*/
			break;
		
		}
	}
}
