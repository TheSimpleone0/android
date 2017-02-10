package com.example.maakni.teachers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    int compteur;
    Button ajouter;
    Button supprimer;
    Button zero;
    TextView afficheur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);
        compteur= 3;
        ajouter = (Button) findViewById(R.id.bN_cop);
        supprimer= (Button) findViewById(R.id.bN_ex);
        zero=(Button) findViewById(R.id.bzero);
        afficheur= (TextView) findViewById(R.id.tvSecondeAct);
        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compteur ++;
                afficheur.setText("Vous avez " + compteur + " copines");



            }
        });
        supprimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (compteur!=0) {
                    compteur--;
                }
                afficheur.setText("Vous avez " + compteur + " copines");


            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compteur =0;
                afficheur.setText("Vous avez 0 copines");

            }
        });
    }
   /* public void addCopine(View v){
        compteur ++;
        afficheur.setText("Vous avez " + compteur + " copines");


    }
    public void delCopine(View v){
        if (compteur!=0) {
            compteur--;
        }
        afficheur.setText("Vous avez " + compteur + " copines");
        }

    public void zero(View v){
        compteur =0;
        afficheur.setText("Vous avez 0 copines");
    }*/
}
