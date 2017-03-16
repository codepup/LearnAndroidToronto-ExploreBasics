// This is the namespace that organizes a set of all related classes and interfaces.
package com.example.matt.myapplication;

// This is how you'd import packages.
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// public is a keyword in Java, class, and extends are key words in Java.
// What do they have in common on the screen?

// This is the signature of the class. It follows the format:
// access type VariableName extends SubClassName

// public means that any other class can access the MainActivity class.
// class is a Type - is the a common superinterface for all types in Java.
// What is a Type?
// The keyword extends means that the MainActivity subclass inherits all public and protected
// members of its parent.
// Android has defined a class called Activity, which is a single focused thing that the
// user can do.
public class MainActivity extends AppCompatActivity {
    // This is an override annotation.
    // Developers usually override methods to implement there own features
    // on a method. By practice, most methods you will be overriding,
    // are interfaces.
    @Override
    // The onCreate method is actually very special to Android -
    // it's part of the Activity lifecycle.
    protected void onCreate(Bundle savedInstanceState) {
        // Since this is being implemented we use
        // AppCompatActivity (the superclass) implementation of the onCreate() method.
        super.onCreate(savedInstanceState);
        // Inflates the Activity's UI.
        setContentView(R.layout.activity_main);




    }
}
