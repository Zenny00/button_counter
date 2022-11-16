package com.example.tapbuttoncounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //Model | Holds counter object
    private Counter count;

    //View | Corresponds to the text view component
    private TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        //Calls counter constructor
        count = new Counter();

        //Get the text view component
        countView = (TextView) findViewById(R.id.textView);
    }

    //Increment the count by 1 and update the view
    public void countTap(View view)
    {
        count.addCount();
        countView.setText(count.getCount().toString());
        Log.d("Event time: " + Calendar.getInstance().getTime().toString(), "Button click count: " + count.getCount().toString());
    }
}