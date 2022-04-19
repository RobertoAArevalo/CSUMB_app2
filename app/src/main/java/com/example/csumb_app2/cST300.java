package com.example.csumb_app2;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * This is a class called CST300 which is being called from
 * MainActivity via a function, and it is extending to AppCompatActivity.
 * It will run after the button is clicked from MainActivity.java.
 * A description will be presented for CST 300.
 */
public class cST300 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Calls the super from onCreate.
        super.onCreate(savedInstanceState);
        //Sets content view base on the XML file.
        setContentView(R.layout.cst300);

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

        //link to videoview, have a URI that points to this video
        //either point it to this file or to the url (website simpler)
        //start the video

        //to run the video

        //Found the video
//        WebView rabbitVid = findViewById(R.id.rabbitVid);
//        /**
//         * changes the settings.
//         */
//        rabbitVid.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                return false;
//            }
//        });
//
//        WebSettings webSettings = rabbitVid.getSettings(); // initiate variable websetting.
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setLoadWithOverviewMode(true);
//        webSettings.setUseWideViewPort(true);
//
//        //Imports the video. : ERROR: EARLIER -> NO INTERNET. MANIFIESTO GIVE INTERNET.
//        rabbitVid.loadUrl("https://www.w3schools.com/tags/mov_bbb.mp4");


