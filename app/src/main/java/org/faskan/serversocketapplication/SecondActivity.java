package org.faskan.serversocketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String stringExtra = getIntent().getStringExtra(MainActivity.MAIN_MESSAGE);
        ((TextView) findViewById(R.id.textView_secondActivity)).setText(stringExtra);
    }
}
