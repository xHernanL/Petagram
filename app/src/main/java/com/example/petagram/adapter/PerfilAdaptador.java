package com.example.petagram.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petagram.modelo.Mascota;
import com.example.petagram.R;

import java.util.ArrayList;

public class PerfilAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {
    ArrayList<Mascota> mascotas;
    Activity activity;

    public PerfilAdaptador(ArrayList<Mascota> mascotas, Activity activity){

        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaAdaptador.MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //Darle vida a nuestro Layaout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_blank, parent, false);
        return new MascotaAdaptador.MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaAdaptador.MascotaViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
