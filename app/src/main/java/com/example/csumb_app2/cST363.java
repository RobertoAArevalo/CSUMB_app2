package com.example.csumb_app2;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * This is a class called CST363 which is being called from
 * MainActivity via a function, and it is extending to AppCompatActivity.
 * It will run after the button is clicked from MainActivity.java.
 * A description will be presented for CST 363.
 */
public class cST363 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Calls the super from onCreate.
        super.onCreate(savedInstanceState);
        //Sets content view base on the XML file.
        setContentView(R.layout.cst363);

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