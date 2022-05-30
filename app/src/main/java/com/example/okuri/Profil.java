package com.example.okuri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        // Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.navp);

        bottomNavigationView.setSelectedItemId(R.id.profil);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.wishlist:
                        startActivity(new Intent(getApplicationContext()
                                ,Wishlist.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.mur:
                        startActivity(new Intent(getApplicationContext()
                                ,Mur.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profil:
                        return true;
                    case R.id.recherche:
                        startActivity(new Intent(getApplicationContext()
                                ,Recherche.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.notifications2:
                        startActivity(new Intent(getApplicationContext()
                                ,Notifications.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });
    }
}