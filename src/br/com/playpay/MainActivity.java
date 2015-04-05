package br.com.playpay;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//alignCenterTextViewActivity();
	}
	

	/**
	 * Alingn text center on Main Activity(Action Bar)
	 */
	private void alignCenterTextViewActivity() {
		TextView customView = (TextView) LayoutInflater.from(this).inflate
				(R.layout.activity_main, null);
		ActionBar.LayoutParams params = new ActionBar.LayoutParams(
			     ActionBar.LayoutParams.FILL_PARENT, 
			     ActionBar.LayoutParams.MATCH_PARENT, 
			     Gravity.CENTER);
		customView.setText(getResources().getString(R.string.app_name)); 
		getSupportActionBar().setCustomView(customView, params);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}else if(id == R.id.action_newaccount){
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
