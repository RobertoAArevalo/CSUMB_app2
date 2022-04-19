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
 *
 */

package com.example.csumb_app2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// extending to AppCompatActivity allows for using onCreate
// onCreate makes it so the moment the program reaches
// a specific part it does something else I want it to do

/**
 * This is MainActivity class that
 */
public class MainActivity extends AppCompatActivity {

    /**
     *
     * @param savedInstanceState
     */

    Button videoButtonEvent; //creates a variable type button called buttonEvent
    Button cST300ButtonEvent; //creates a variable, type button for CST 300
    Button cST338ButtonEvent; //creates a variable, type button for CST 338
    Button cST363ButtonEvent; //creates a variable, type button for CST 363
    Button cST334ButtonEvent; //creates a variable, type button for CST 334
    Button cST311ButtonEvent; //creates a variable, type button for CST 311
    Button cST336ButtonEvent; //creates a variable, type button for CST 336
    Button cST370ButtonEvent; //creates a variable, type button for CST 370
    Button cST462sButtonEvent; //creates a variable, type button for CST 462s
    Button cST383ButtonEvent; //creates a variable, type button for CST 383
    Button cST438ButtonEvent; //creates a variable, type button for CST 438
    Button cST489ButtonEvent; //creates a variable, type button for CST 489
    Button cST499ButtonEvent; //creates a variable, type button for CST 499

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Calls the super from onCreate.
        super.onCreate(savedInstanceState);
        //Sets content view base on the XML file.
        setContentView(R.layout.activity_main);
//        System.out.println("called");
        videoButtonEvent = findViewById(R.id.buttonVideo);
        // matches variable with boxes
        videoButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               System.out.println("button is clicked");
//                Toast.makeText(getApplicationContext(), "Botton Clicked",
//                        Toast.LENGTH_SHORT).show();
                switchScene(view, VideoActivity.class);
            }
        });

        //Stores the button
        cST300ButtonEvent = findViewById(R.id.CST300);
        // matches variable with boxes
        cST300ButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){
                switchScene(view, cST300.class);
            }
        });

        //Stores the button
        cST338ButtonEvent = findViewById(R.id.CST338);
        cST338ButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){
                switchScene(view, cST338.class);
            }
        });
        //Stores the button
        cST363ButtonEvent = findViewById(R.id.CST363);
        cST363ButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){
                switchScene(view, cST363.class);
            }
        });
        //Stores the button
        cST334ButtonEvent = findViewById(R.id.CST334);
        cST334ButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){
                switchScene(view, cST334.class);
            }
        });

        //Stores the button
        cST336ButtonEvent = findViewById(R.id.CST336);
        cST336ButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){
                switchScene(view, cST336.class);
            }
        });

        //Stores the button
        cST311ButtonEvent = findViewById(R.id.CST311);
        cST311ButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){
                switchScene(view, cST311.class);
            }
        });

        //Stores the button
        cST370ButtonEvent = findViewById(R.id.CST370);
        cST370ButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){
                switchScene(view, cST370.class);
            }
        });

        //Stores the button
        cST462sButtonEvent = findViewById(R.id.CST462S);
        cST462sButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){
                switchScene(view, cST462S.class);
            }
        });

        //Stores the button
        cST383ButtonEvent = findViewById(R.id.CST383);
        cST383ButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){
                switchScene(view, cST383.class);
            }
        });

        //Stores the button
        cST438ButtonEvent = findViewById(R.id.CST438);
        cST438ButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){ switchScene(view, cST438.class); }
        });

        //Stores the button
        cST489ButtonEvent = findViewById(R.id.CST489);
        cST489ButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){
                switchScene(view, cST489.class);
            }
        });

        //Stores the button
        cST499ButtonEvent = findViewById(R.id.CST499);
        cST499ButtonEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view){
                switchScene(view, cST499.class);
            }
        });

    }


    /**
     * This function takes one from this class to the clsTranfform's class
     * @param view
     */
    public void switchScene(View view, Class<?> b){//starts activity
        Intent intent = new Intent(this, b );
        startActivity(intent);
        finish();
    }

//    /**
//     * This function links to the other view videoActivity (class).
//     * @param view
//     */
//    public void videoActivity(View view)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, VideoActivity.class);
//        startActivity(intent);
//        finish();
//    }
//
//    /**
//     * This funciton links to the other view cST300 (class).
//     * @param cST300
//     */
//    public void cST300(View cST300)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST300.class);
//        startActivity(intent);
//        finish();
//    }
//
//    /**
//     * This funciton links to the other view cST338 (class).
//     * @param cST338
//     */
//    public void cST338(View cST338)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST338.class);
//        startActivity(intent);
//        finish();
//    }
//
//    /**
//     * This funciton links to the other view cST363 (class).
//     * @param cST363
//     */
//    public void cST363(View cST363)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST363.class);
//        startActivity(intent);
//        finish();
//    }
//
//    /**
//     * This funciton links to the other view cST334 (class).
//     * @param cST334
//     */
//    public void cST334(View cST334)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST334.class);
//        startActivity(intent);
//        finish();
//    }
//    /**
//     * This funciton links to the other view cST334 (class).
//     * @param cST311
//     */
//    public void cST311(View cST311)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST311.class);
//        startActivity(intent);
//        finish();
//    }
//    /**
//     * This funciton links to the other view cST334 (class).
//     * @param cST336
//     */
//    public void cST336(View cST336)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST336.class);
//        startActivity(intent);
//        finish();
//    }
//    /**
//     * This funciton links to the other view cST334 (class).
//     * @param cST370
//     */
//    public void cST370(View cST370)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST370.class);
//        startActivity(intent);
//        finish();
//    }
//    /**
//     * This funciton links to the other view cST334 (class).
//     * @param cST462S
//     */
//    public void cST462S(View cST462S)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST462S.class);
//        startActivity(intent);
//        finish();
//    }
//    /**
//     * This funciton links to the other view cST383 (class).
//     * @param cST383
//     */
//    public void cST383(View cST383)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST383.class);
//        startActivity(intent);
//        finish();
//    }
//    /**
//     * This funciton links to the other view cST383 (class).
//     * @param cST438
//     */
//    public void cST438(View cST438)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST438.class);
//        startActivity(intent);
//        finish();
//    }
//
//    /**
//     * This funciton links to the other view cST334 (class).
//     * @param cST489
//     */
//    public void cST489(View cST489)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST489.class);
//        startActivity(intent);
//        finish();
//    }
//    /**
//     * This funciton links to the other view cST334 (class).
//     * @param cST499
//     */
//    public void cST499(View cST499)//declaring an intent to go from here
//    // to the VideoActivity.java class
//    {
//        //starts activity
//        Intent intent = new Intent(this, cST499.class);
//        startActivity(intent);
//        finish();
//    }



    //create other fxns to go into a different classes (need to create classes
    //for each individual CST class).
    //button should be calling the video activity function



}

