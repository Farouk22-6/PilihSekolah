package com.example.pilihsekolah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSekolah;
    private ArrayList<sekolah> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSekolah = findViewById(R.id.rv_sekolah);
        rvSekolah.setHasFixedSize(true);

        list.addAll(SekolahData.GetSekolahData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvSekolah.setLayoutManager(new LinearLayoutManager(this));
        ListSekolahAdapter listHeroAdapter = new ListSekolahAdapter(list);
        rvSekolah.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode (item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode (int selectedMode) {
        switch (selectedMode){
            case R.id.my_profile:
                Intent myprofile = new Intent(MainActivity.this,Halaman_about.class);
                startActivity(myprofile);
                    break;
        }
    }
}
