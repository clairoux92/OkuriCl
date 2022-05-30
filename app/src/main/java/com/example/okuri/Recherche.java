package com.example.okuri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Recherche extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);

        // Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.navp);

        bottomNavigationView.setSelectedItemId(R.id.recherche);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mur:
                        startActivity(new Intent(getApplicationContext()
                                ,Mur.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profil:
                        startActivity(new Intent(getApplicationContext()
                                ,Profil.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.wishlist:
                        startActivity(new Intent(getApplicationContext()
                                ,Wishlist.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.recherche:
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


