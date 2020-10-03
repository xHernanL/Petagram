package com.example.petagram;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        iniciarListaMascotas();
        inicializarAdaptador();


        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemStrella:
                Intent intent = new Intent(MainActivity.this, MascotasFavoritas.class);
                startActivity(intent);
                return true;

            case R.id.contacto:
                Intent intentContacto = new Intent(MainActivity.this, Contacto.class);
                startActivity(intentContacto);
                return true;

            case R.id.acercaDe:
                Intent intentAcercaDe = new Intent(MainActivity.this, AcercaDe.class);
                startActivity(intentAcercaDe);
                return true;

            default:
                final boolean b = super.onOptionsItemSelected(item);
                return b;
        }
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void iniciarListaMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.dog1,"Gemma"));
        mascotas.add(new Mascota(R.drawable.superdog2,"Chiquito"));
        mascotas.add(new Mascota(R.drawable.superdog3,"Toti"));
        mascotas.add(new Mascota(R.drawable.supercat1,"Uma"));
        mascotas.add(new Mascota(R.drawable.supercat2,"Pipi"));
    }


    public void incrementValue(View view){
        TextView tv = findViewById(R.id.textView);
        int i = Integer.parseInt(tv.getText().toString());
        i++;
        tv.setText(i+"");

    }
}