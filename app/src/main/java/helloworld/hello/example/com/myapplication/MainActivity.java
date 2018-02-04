package helloworld.hello.example.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText jumlah;
    EditText menu;
    Button eatbus;
    Button abnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jumlah = (EditText) findViewById(R.id.editText2) ;
        menu = (EditText) findViewById(R.id.editText);
        eatbus = (Button) findViewById(R.id.button);
        abnormal = (Button) findViewById(R.id.button3);

        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = menu.getText().toString();
                String count = jumlah.getText().toString();

                Intent in = new Intent(getApplicationContext(), Main2Activity.class);

                in.putExtra("myname", name);
                in.putExtra("mycount", count);
                startActivity(in);

            }
        });
    abnormal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = menu.getText().toString();
            String count = jumlah.getText().toString();
            Intent in = new Intent(getApplicationContext(), Main3Activity.class);

            in.putExtra("mycount", count);
            in.putExtra("myname", name);

            startActivity(in);
        }
    });
    }

}




