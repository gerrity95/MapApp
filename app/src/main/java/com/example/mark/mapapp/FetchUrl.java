package com.example.mark.mapapp;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by gerrity95 on 24/07/16.
 */
public class FetchUrl extends AsyncTask<String, Void, String> {

    downloadUrl newDl = new downloadUrl();

    @Override
    protected String doInBackground(String... url) {
        //For storing data from web service
        String data = "";

        try {
            //Fetching the data from web service;
            data = newDl.downloadUrl(url[0]);
            Log.d("Background Task Data", data.toString());
        } catch (Exception e) {
            Log.d("Background task", e.toString());
        }
        return data;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);

        ParserTask parserTask = new ParserTask();

        //Invoke the thread for parsing the JSON data
        parserTask.execute(result);
    }


}
