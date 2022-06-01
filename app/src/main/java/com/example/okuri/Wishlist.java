package com.example.okuri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Wishlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        // Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.navp);

        bottomNavigationView.setSelectedItemId(R.id.wishlist);

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

        // Fin navigation


        // Bouton trash 1
        ImageView wish1 = (ImageView) findViewById(R.id.imageView18);
        ImageView wish1i = (ImageView) findViewById(R.id.imageView19);
        TextView wish1t1 = (TextView) findViewById(R.id.textView26);
        TextView wish1t2 = (TextView) findViewById(R.id.textView9);
        ImageButton boutonTrash1 = (ImageButton) findViewById(R.id.trashButton1);


        boutonTrash1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wish1.setVisibility(View.GONE);
                boutonTrash1.setVisibility(View.GONE);
                wish1i.setVisibility(View.GONE);
                wish1t1.setVisibility(View.GONE);
                wish1t2.setVisibility(View.GONE);
            }
        });

        // Bouton trash 2
        ImageView wish2 = (ImageView) findViewById(R.id.imageView30);
        ImageView wish2i = (ImageView) findViewById(R.id.imageView28);
        TextView wish2t1 = (TextView) findViewById(R.id.textView30);
        TextView wish2t2 = (TextView) findViewById(R.id.textView29);
        ImageButton boutonTrash2 = (ImageButton) findViewById(R.id.trashButton2);


        boutonTrash2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wish2.setVisibility(View.GONE);
                boutonTrash2.setVisibility(View.GONE);
                wish2i.setVisibility(View.GONE);
                wish2t1.setVisibility(View.GONE);
                wish2t2.setVisibility(View.GONE);
            }
        });

        // Bouton trash 3
        ImageView wish3 = (ImageView) findViewById(R.id.imageView31);
        ImageView wish3i = (ImageView) findViewById(R.id.imageView29);
        TextView wish3t1 = (TextView) findViewById(R.id.textView31);
        TextView wish3t2 = (TextView) findViewById(R.id.textView32);
        ImageButton boutonTrash3 = (ImageButton) findViewById(R.id.trashButton3);


        boutonTrash3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wish3.setVisibility(View.GONE);
                boutonTrash3.setVisibility(View.GONE);
                wish3i.setVisibility(View.GONE);
                wish3t1.setVisibility(View.GONE);
                wish3t2.setVisibility(View.GONE);

            }
        });



    }


}