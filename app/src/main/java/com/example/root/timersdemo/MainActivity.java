package com.example.root.timersdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Timer - (CountDownTimer) Method - It will run the method again and again to a certain time after specific delay*/
        new CountDownTimer(10000, 1000) {

            public void onTick(long milliSecondsUntilDone) {
                //  Countdown is counting down. (every seconds)

                Log.i("Seconds left", String.valueOf(milliSecondsUntilDone/1000));
            }

            public void onFinish() {
                //Counter is finished. (After 10 sec)

                Log.i("Done", "Countdown timer finished");
            }

        }.start();



        /* Timer - (Handler) Method - It will run the method again and again after specific delay for infinite time  */
        /*
        final Handler handler = new Handler();    // Control the timing of certain methods
        Runnable run = new Runnable() {     // The certain method of handler
            @Override
            public void run() {
                // insert code to be run every specific time
                Log.i("Runnable run", "i sec later");



                // It will run the Runnable method again and again after specific time later
                handler.postDelayed(this, 1000);
            }
        };

        handler.post(run);*/
    }
}
