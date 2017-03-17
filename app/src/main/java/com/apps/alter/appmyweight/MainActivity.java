package com.apps.alter.appmyweight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt ;
    Button pressButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pressButton=(Button)findViewById(R.id.prsButton);

        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Merupakan lahan untuk memberi perintah
                Toast.makeText(getApplicationContext(),"Berhasil di click",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
