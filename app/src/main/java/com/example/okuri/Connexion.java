package com.example.okuri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Connexion extends AppCompatActivity {
    private Button boutonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        // Ouvrir le mur quand cliqué sur Se connecter
        boutonLogin = (Button) findViewById(R.id.login);
        boutonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMur();
            }
        });

    }

    public void openActivityMur () {
        Intent intent = new Intent(this, Mur.class);
        startActivity(intent);
    }


}
