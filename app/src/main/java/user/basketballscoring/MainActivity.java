package user.basketballscoring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public final String TAG = "CheckActivityLifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate called!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called!");
    }
}
