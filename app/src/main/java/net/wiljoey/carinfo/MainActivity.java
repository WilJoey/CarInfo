package net.wiljoey.carinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by wiljoey on 11/16/15.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnOnePieceList = (Button) findViewById(R.id.btnOnePieceList);

        btnOnePieceList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, OnePieceActivity.class);
                startActivity(intent);
            }
        });

        Button btnOnePieceListActivity = (Button) findViewById(R.id.btnOnePieceListActivity);
        btnOnePieceListActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent();
                intent.setClass(MainActivity.this, OnePieceListActivity.class);
                startActivity(intent);
            }
        });

        Button btnSimpleList = (Button) findViewById(R.id.btnGreatSimpleList);
        btnSimpleList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent();
                intent.setClass(MainActivity.this, SimpleList.class);
                startActivity(intent);
            }
        });

    }
}
