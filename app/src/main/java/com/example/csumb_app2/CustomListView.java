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

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CustomListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
    }
}