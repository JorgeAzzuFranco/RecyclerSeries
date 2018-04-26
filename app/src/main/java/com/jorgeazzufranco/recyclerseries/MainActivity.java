package com.jorgeazzufranco.recyclerseries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    SeriesAdapter adapter;
    ArrayList<Serie> series;
    LinearLayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        series =new ArrayList<>();
        rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);

        prepareSeries();
        adapter = new SeriesAdapter(series, this);
        rv.setAdapter(adapter);
    }

    private void prepareSeries() {
        String TAG = "Mensaje";
        series= new ArrayList<>();

        series.add(new Serie("World Trigger", "75", R.drawable.wtr, "Anime created by Daisuke Ashihara" ));
        series.add(new Serie("AKB0048", "26", R.drawable.akb, "Anime created by  Shōji Kawamori" ));
        series.add(new Serie("K-ON", "41", R.drawable.kon, "Anime created by Kakifly" ));
        series.add(new Serie("Sora no Otoshimono", "13", R.drawable.sno, "Anime created by Suu Minazuki"));

    }
}
