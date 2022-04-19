/**
 * @author Roberto Arevalo
 * This is to create an Android application.
 * CSUMB Module 7 - Android App. Development
 * 4/19/22
 * This application will allow for seeing the curriculum involved in the the
 * CS- Computer Science Online Program. It uses Java and XML to run.
 * Program specifics: Pixel_3a_API_32_arm64-v8a, Android Gradle Plugin Version
 *
 *
 *
 */

package com.example.csumb_app2;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

/**
 * This is a class called VideoActivity which is being called from
 * MainActivity via a function, and it is extending to AppCompatActivity.
 * It will run after the button is clicked from MainActivity.java.
 * A video will start to play from
 * https://www.w3schools.com/tags/mov_bbb.mp4.
 */
public class VideoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Calls the super from onCreate.
        super.onCreate(savedInstanceState);
        //Sets content view base on the XML file.
        setContentView(R.layout.activity_video);

        //link to videoview, have a URI that points to this video
        //either point it to this file or to the url (website simpler)
        //start the video


        //to run the video
        //Found the video
        WebView rabbitVid = findViewById(R.id.rabbitVid);
        /**
         * changes the settings.
         */
        rabbitVid.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        WebSettings webSettings = rabbitVid.getSettings(); // initiate variable websetting.
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);

        //Impots the video. : ERROR: EARLIER -> NO INTERNET. MANIFIESTO GIVE INTERNET.
        rabbitVid.loadUrl("https://www.w3schools.com/tags/mov_bbb.mp4");

 Button backButton; // creates backButton
        backButton = findViewById(R.id.back);
        // matches variable with boxes
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchScene(view, MainActivity.class);
            }
        });
    }

    /**
     * This function takes one from this class to the clsTranfform's class
     *
     * @param view
     */
    public void switchScene(View view, Class<?> b) {//starts activity
        Intent intent = new Intent(this, b);
        startActivity(intent);
        finish();
    }
}