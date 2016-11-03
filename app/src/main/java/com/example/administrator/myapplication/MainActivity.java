package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count();
    }

    private void count() {
        int a[]={1,4,8,16,23};
        int b[]={2,3,9,20};
        int c[]={1,4,8,16,23,0,0,0,0};
        int temp=0;
        for (){

        }


        for(int i=0;i<c.length;i++){
            Log.i("count",c[i]+"");
        }


    }
}
