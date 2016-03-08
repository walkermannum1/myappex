package com.example.user.myapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 2016/3/8.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(R.layout.second_layout);
        setContentView(R.layout.second_layout);
    }
    Button button2 = (Button) findViewById(R.id.button_2);
    button2.setOnClickListener(new DialogInterface.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:10086"))
            startActivity(intent);
        }
    });
}
}
