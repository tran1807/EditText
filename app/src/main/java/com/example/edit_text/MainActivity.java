package com.example.edit_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNoiDung;
    Button btnNoidung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNoiDung = (EditText) findViewById(R.id.editTextNoiDung);
        btnNoidung = (Button) findViewById(R.id.buttonClick);

        btnNoidung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noidung = edtNoiDung.getText().toString();
                Toast.makeText(MainActivity.this, noidung, Toast.LENGTH_SHORT).show();
            }
        });
    }
}