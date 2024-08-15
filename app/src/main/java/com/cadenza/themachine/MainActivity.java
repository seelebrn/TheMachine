package com.cadenza.themachine;

import static android.content.ContentValues.TAG;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize MediaPlayer
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sample);

        // Find the Button by ID
        Button button = findViewById(R.id.button);

        // Set up the click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start playing the audio
                mp.start();
            }
        });

    }
}
