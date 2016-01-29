package com.example.appsd.arclayoutcircel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt = (Button) findViewById(R.id.a);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click a", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,Another.class);
                startActivity(intent);
            }
        });


      /*  more details : https://github.com/bulbulhossen/ArcLayout*/
    }
}
