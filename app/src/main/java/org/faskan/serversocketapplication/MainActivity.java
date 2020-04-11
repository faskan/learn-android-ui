package org.faskan.serversocketapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final String MAIN_MESSAGE = "MESSAGE";
    private int mCount;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.text_count);
        if(savedInstanceState != null) {
            String savedText = savedInstanceState.getString("count");
            mShowCount.setText(savedText);
        }
    }

    @Override
    protected void onStart() {
        Log.d(LOG_TAG, "onStart");
        super.onStart();
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Hello!!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        mShowCount.setText(Integer.toString(mCount));
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MAIN_MESSAGE, ((EditText) findViewById(R.id.editText_msgToSecondActivity)).getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("count",mShowCount.getText().toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
}
