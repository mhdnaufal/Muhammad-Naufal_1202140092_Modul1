package helloworld.hello.example.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView display = (TextView) findViewById(R.id.textView4);
        TextView display2 = (TextView) findViewById(R.id.textView12);
        TextView display3 = (TextView) findViewById(R.id.textView7);
        Intent in = getIntent();

        String name = in.getStringExtra("myname");
        String count = in.getStringExtra("mycount");

        display.setText(name);
        display2.setText(count);


        Toast.makeText(getApplicationContext(),
                "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }
    }

