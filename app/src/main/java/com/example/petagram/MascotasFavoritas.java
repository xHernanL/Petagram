package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        iniciarListaMascotas();
        inicializarAdaptador();

        getSupportActionBar().setHomeButtonEnabled(true);
    }

   public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void iniciarListaMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.superdog2,"Chiquito"));
        mascotas.add(new Mascota(R.drawable.dog1,"Gemma"));
        mascotas.add(new Mascota(R.drawable.superdog3,"Toti"));
        mascotas.add(new Mascota(R.drawable.supercat1,"Uma"));
        mascotas.add(new Mascota(R.drawable.supercat2,"Pipi"));
    }
}