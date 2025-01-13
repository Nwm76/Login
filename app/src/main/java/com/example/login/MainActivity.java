package com.example.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText nazwa;

    EditText haslo;

    Button login;

    TextView logindwa;

    TextView haslodwa;

    TextView nazwiskoo;

    TextView imie;

    TextView im;

    TextView naz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;




        });
        nazwa = findViewById(R.id.nazwa);
        haslo = findViewById(R.id.haslo);
        imie = findViewById(R.id.imie);
        nazwiskoo = findViewById(R.id.nazwiskoo);
        findViewById(R.id.login);
        login = findViewById(R.id.login);
        logindwa = findViewById(R.id.logindwa);
        haslodwa = findViewById(R.id.haslodwa);
        im = findViewById(R.id.im);
        naz = findViewById(R.id.naz);

        login.setOnClickListener(login -> {
            logindwa.setText(nazwa.getText());
            haslodwa.setText(haslo.getText());
            im.setText(imie.getText());
            naz.setText(nazwiskoo.getText());

        });
        haslo.getText();

    }
}
