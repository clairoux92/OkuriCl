package com.example.okuri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        // Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.navp);

        bottomNavigationView.setSelectedItemId(R.id.notifications2);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.wishlist:
                        startActivity(new Intent(getApplicationContext()
                                ,Wishlist.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profil:
                        startActivity(new Intent(getApplicationContext()
                                ,Profil.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.notifications2:
                        return true;
                    case R.id.recherche:
                        startActivity(new Intent(getApplicationContext()
                                ,Recherche.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.mur:
                        startActivity(new Intent(getApplicationContext()
                                ,Mur.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });

        // Fin navigation

        // Bouton trash 1
        ImageView notif1 = (ImageView) findViewById(R.id.imageView32);
        ImageView notif1i = (ImageView) findViewById(R.id.imageView42);
        TextView notif1t1 = (TextView) findViewById(R.id.textView35);
        TextView notif1t2 = (TextView) findViewById(R.id.textView34);
        ImageButton boutonTrash1 = (ImageButton) findViewById(R.id.NtrashButton1);


        boutonTrash1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notif1.setVisibility(View.GONE);
                notif1i.setVisibility(View.GONE);
                notif1t1.setVisibility(View.GONE);
                notif1t2.setVisibility(View.GONE);
                boutonTrash1.setVisibility(View.GONE);

            }
        });

        // Bouton trash 2
        ImageView notif2 = (ImageView) findViewById(R.id.imageView33);
        ImageView notif2i = (ImageView) findViewById(R.id.imageView43);
        TextView notif2t1 = (TextView) findViewById(R.id.textView36);
        TextView notif2t2 = (TextView) findViewById(R.id.textView37);
        ImageButton boutonTrash2 = (ImageButton) findViewById(R.id.NtrashButton2);


        boutonTrash2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notif2.setVisibility(View.GONE);
                notif2i.setVisibility(View.GONE);
                notif2t1.setVisibility(View.GONE);
                notif2t2.setVisibility(View.GONE);
                boutonTrash2.setVisibility(View.GONE);
            }
        });

        // Bouton trash 3
        ImageView notif3 = (ImageView) findViewById(R.id.imageView34);
        ImageButton boutonTrash3 = (ImageButton) findViewById(R.id.NtrashButton3);


        boutonTrash3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notif3.setVisibility(View.GONE);
                boutonTrash3.setVisibility(View.GONE);

            }
        });

        // Bouton trash 4
        ImageView notif4 = (ImageView) findViewById(R.id.imageView35);
        ImageButton boutonTrash4 = (ImageButton) findViewById(R.id.NtrashButton4);


        boutonTrash4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notif4.setVisibility(View.GONE);
                boutonTrash4.setVisibility(View.GONE);

            }
        });
    }
}