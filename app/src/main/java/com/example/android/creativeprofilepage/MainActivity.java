package com.example.android.creativeprofilepage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import rb.popview.PopField;

public class MainActivity extends AppCompatActivity {
    PopField popField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popField = PopField.attach2Window(this);

        final TextView follow = (TextView) findViewById(R.id.tv);
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext()
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View addView = layoutInflater.inflate(R.layout.samplebutton, null);         //Inflate new view from xml
                TextView newTextView = (TextView) addView.findViewById(R.id.sampletv);    //Reference the newview
                newTextView.setText("Follow");
                popField.popView(follow, addView, true);
            }
        });

    }
}
