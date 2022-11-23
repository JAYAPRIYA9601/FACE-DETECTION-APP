//To initialize the Firebase
package com.example.facedetectionapp;
//https://github.com/JAYAPRIYA9601/FACE-DETECTION-APP.git
import android.app.Application;

import com.google.firebase.FirebaseApp;


public class FaceDetection extends Application {
    public static final String RESULT_TEXT = "RESULT_TEXT";
    public static final String RESULT_DIALOG = "RESULT_DIALOG";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}