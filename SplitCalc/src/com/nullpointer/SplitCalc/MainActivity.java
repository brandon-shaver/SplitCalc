package com.nullpointer.SplitCalc;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;




public class MainActivity extends ActionBarActivity implements OnClickListener {
	
	private static TextView input;
	private static TextView resultView;
	
	private static String inputString;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button one = (Button) findViewById(R.id.button1);
		Button two = (Button) findViewById(R.id.button2);
		Button three = (Button) findViewById(R.id.button3);
		Button four = (Button) findViewById(R.id.button4);
		Button five = (Button) findViewById(R.id.button5);
		Button six = (Button) findViewById(R.id.button6);
		Button seven = (Button) findViewById(R.id.button7);
		Button eight = (Button)findViewById(R.id.button8);
		Button nine = (Button) findViewById(R.id.button9);
		Button zero = (Button) findViewById(R.id.button0);
		
		
		Button plus = (Button) findViewById(R.id.buttonPlus);
		Button sub = (Button) findViewById(R.id.buttonSub);
		Button mult = (Button) findViewById(R.id.buttonMult);
		Button div = (Button) findViewById(R.id.buttonDiv);
		Button leftPar = (Button) findViewById(R.id.buttonDec);
		Button rightPar = (Button) findViewById(R.id.buttonRightPar);
		
		Button clear = (Button) findViewById(R.id.buttonClear);
		Button eval = (Button) findViewById(R.id.evalButton);
		
		input = (TextView) findViewById(R.id.theInputTextView);
		resultView = (TextView) findViewById(R.id.theResultTextView);

		one.setOnClickListener(this);
		two.setOnClickListener(this);
		three.setOnClickListener(this);
		four.setOnClickListener(this);
		five.setOnClickListener(this);
		six.setOnClickListener(this);
		seven.setOnClickListener(this);
		eight.setOnClickListener(this);
		nine.setOnClickListener(this);
		zero.setOnClickListener(this);
		
		plus.setOnClickListener(this);
		sub.setOnClickListener(this);
		mult.setOnClickListener(this);
		div.setOnClickListener(this);
		leftPar.setOnClickListener(this);
		rightPar.setOnClickListener(this);
		
		clear.setOnClickListener(this);
		eval.setOnClickListener(this);
		
		inputString = new String();
		
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

	@Override
	public void onClick(View v) {
		
		int targetId = v.getId();
		
		if (targetId == R.id.button1){inputString = inputString + "1";}
		if (targetId == R.id.button2){inputString = inputString + "2";}
		if (targetId == R.id.button3){inputString = inputString + "3";}
		if (targetId == R.id.button4){inputString = inputString + "4";}
		if (targetId == R.id.button5){inputString = inputString + "5";}
		if (targetId == R.id.button6){inputString = inputString + "6";}
		if (targetId == R.id.button7){inputString = inputString + "7";}
		if (targetId == R.id.button8){inputString = inputString + "8";}
		if (targetId == R.id.button9){inputString = inputString + "9";}
		if (targetId == R.id.button0){inputString = inputString + "0";}
		
		if (targetId == R.id.buttonPlus){inputString = inputString + "+";}
		if (targetId == R.id.buttonSub){inputString = inputString + "-";}
		if (targetId == R.id.buttonMult){inputString = inputString + "*";}
		if (targetId == R.id.buttonDiv){inputString = inputString + "/";}
		if (targetId == R.id.buttonDec){inputString = inputString + "(";}
		if (targetId == R.id.buttonRightPar){inputString = inputString + ")";}
		
		if (targetId == R.id.buttonClear){inputString = "";}
		
		input.setText(inputString);
		
		if (targetId == R.id.evalButton){
			
			String result = Calculator.evalExpression(inputString);
			resultView.setText(result);
			
			}

		
		Log.i("APP", "Object clicked " + targetId);
		
	}
	
	public static void evalInput(String input){
		
		if (input.length() > 2){
			
			
			
			
		}
	}


}
