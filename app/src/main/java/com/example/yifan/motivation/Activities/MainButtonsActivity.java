package com.example.yifan.motivation.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.yifan.motivation.R;

public class MainButtonsActivity extends Activity {

    private static final String LOG_TAG = MainButtonsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_buttons);
    }

    public void onTaskButtonPressed(View v){
        Log.i(LOG_TAG, "task button pressed");

    }

    public void onCalendarButtonPressed(View v){
        Log.i(LOG_TAG, "calendar button pressed");
    }

    public void onTestimonialsButtonPressed(View v){
        Log.i(LOG_TAG, "testimonials button pressed");
    }

    public void onNetworkButtonPressed(View v){
        Log.i(LOG_TAG, "network button pressed");
    }


}
