package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int licznikPolubien = 0;
    private TextView licznikText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        licznikText = findViewById(R.id.like_counter);
        Button przyciskPolub = findViewById(R.id.button_like);
        Button przyciskUsun = findViewById(R.id.button_unlike);

        przyciskPolub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                licznikPolubien++;
                zaktualizujLicznik();
            }
        });

        przyciskUsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznikPolubien > 0) {
                    licznikPolubien--;
                }
                zaktualizujLicznik();
            }
        });
    }

    private void zaktualizujLicznik() {
        licznikText.setText(licznikPolubien + " polubień");
    }
}