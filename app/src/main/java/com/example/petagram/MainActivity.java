package com.example.petagram;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;

import com.example.petagram.adapter.PageAdapter;
import com.example.petagram.vista.fragment.BlankFragment;
import com.example.petagram.vista.fragment.RecyclerViewFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayaout;
    private ViewPager viewPager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        tabLayaout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();
        setToolBar();


        if (toolbar != null){
            setSupportActionBar(toolbar);
        }


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

    /*public void incrementValue(View view){
        TextView tv = findViewById(R.id.textView);
        int i = Integer.parseInt(tv.getText().toString());
        i++;
        tv.setText(i+"");

    }*/

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new RecyclerViewFragment());
        fragments.add(new BlankFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayaout.setupWithViewPager(viewPager);

    }

    public void setToolBar(){
        Toolbar appBar = findViewById(R.id.appBar);
        setSupportActionBar(appBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        tabLayaout.getTabAt(0).setIcon(R.drawable.iconhouse);
        tabLayaout.getTabAt(1).setIcon(R.drawable.iconpug);

    }
}