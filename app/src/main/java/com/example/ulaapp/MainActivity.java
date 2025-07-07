package com.example.ulaapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    // variable initialization
    LinearLayout toMoviePageBtn, toConcertPageBtn;
    ImageView toInfoPage, toSettingsPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // set layout elements to variables

        toMoviePageBtn = findViewById(R.id.MovieOptionContainer);
        toConcertPageBtn = findViewById(R.id.ConcertOptionContainer);
        toInfoPage = findViewById(R.id.InfoButton);
        toSettingsPage = findViewById(R.id.SettingsButton);

        // click listeners

        toMoviePageBtn.setOnClickListener(V-> {
            Log.d("ClickEvent", "Click on MOVIE option");
        });
        toConcertPageBtn.setOnClickListener(V-> {
            Log.d("ClickEvent", "Click on CONCERT option");
        });
        toInfoPage.setOnClickListener(V-> {
            Log.d("ClickEvent", "info btn");
        });
        toSettingsPage.setOnClickListener(V-> {
            Log.d("ClickEvent", "settings btn");
        });


    }
}