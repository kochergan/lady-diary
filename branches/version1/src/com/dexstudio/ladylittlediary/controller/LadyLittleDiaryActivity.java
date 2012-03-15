package com.dexstudio.ladylittlediary.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class LadyLittleDiaryActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
    }
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()) {
    	case R.id.optionPreferences:
    		
    		return true;
    		
    	case R.id.optionSave:
    		
    		return true;
    		
    	case R.id.optionStatistic:
    		
    		return true;
    		
    	default:
			return super.onOptionsItemSelected(item);
    	}
    }
}