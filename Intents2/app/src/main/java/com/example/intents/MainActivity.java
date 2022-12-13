package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Context context;
private EditText textEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        textEntry = findViewById(R.id.editText);
        findViewById(R.id.button_start_intent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FullscreenActivity.class);

                String enteredText = textEntry.getText().toString();

                intent.putExtra(context.getResources().getString(R.string.sample_string_key), enteredText);
                startActivity(intent);
            }
        });
    }
}