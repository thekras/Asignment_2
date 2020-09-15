package com.example.asignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText E;
    TextView T;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.Hbutton);
        E = (EditText) findViewById(R.id.Uname);
        T = (TextView) findViewById(R.id.TVname);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = E.getText().toString();
                T.setText("Hello "+ s+"!");


            }
        });
    }
}