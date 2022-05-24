package com.example.okuri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Connexion extends AppCompatActivity {
    private Button buttonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        // Ouvrir le Mur quand cliqué sur Se connecter
        buttonlogin = (Button) findViewById(R.id.login);
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMur();
            }
        });
    }

    public void openMur() {
        Intent intent = new Intent(this, Mur.class);
        startActivity(intent);
    }
}
