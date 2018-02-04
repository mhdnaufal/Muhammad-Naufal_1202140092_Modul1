package helloworld.hello.example.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);
        setContentView(R.layout.activity_main3);
        TextView display = (TextView) findViewById(R.id.textView15);
        TextView display2 = (TextView) findViewById(R.id.textView10);
        Intent in = getIntent();

        String name = in.getStringExtra("myname");
        String count = in.getStringExtra("mycount");
        display.setText(name);
        display2.setText(count);

        Toast.makeText(getApplicationContext(),
                "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
    }
}
