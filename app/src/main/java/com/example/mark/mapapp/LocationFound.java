package com.example.mark.mapapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by gerrity95 on 16/08/16.
 */
public class LocationFound extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_found);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // get action bar
        ActionBar actionBar = getActionBar();

        final Button restaurantList =(Button)findViewById(R.id.ButtonFindFood);
        assert restaurantList != null;
        restaurantList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent act2 = new Intent(view.getContext(),RestaurantList.class);
                startActivity(act2);

            }
        });


        Button submitButton = (Button) findViewById(R.id.ButtonFindFood);
        submitButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Add click functions here
            }
        });

        final EditText restaurantName = (EditText) findViewById(R.id.restaurantName);
        String chosenRestaurant = restaurantName.getText().toString();

        final Spinner foodTypeSpinner = (Spinner) findViewById(R.id.SpinnerFoodType);
        String chosenFoodtype = foodTypeSpinner.getSelectedItem().toString();

        final Spinner locationSpinner = (Spinner) findViewById(R.id.SpinnerLocation);
        String chosenLocation = locationSpinner.getSelectedItem().toString();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }


}
