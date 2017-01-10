package io.shigemk2.labyrinth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private LabyrinthView labyrinthView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        labyrinthView = new LabyrinthView(this);
        setContentView(labyrinthView);
    }
}
