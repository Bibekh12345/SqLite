package com.sqllite;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import helper.MyHelper;

public class MainActivity extends AppCompatActivity {

    EditText etword, etmeaning;
    Button btnaddword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etmeaning = findViewById(R.id.et_meaning);
        etword = findViewById(R.id.et_word);
        btnaddword = findViewById(R.id.btn_AddWord);

        final MyHelper myHelper = new MyHelper(this);
        final SQLiteDatabase sqLiteDatabase = myHelper.getWritableDatabase();

        btnaddword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long id = myHelper.InsertData(etword.getText().toString(), etmeaning.getText().toString(), sqLiteDatabase);
                if (id > 0){
                    Toast.makeText(MainActivity.this, "Successful" + id, Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
