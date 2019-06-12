package com.example.imageviewer;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView animalList;
    AnimalCustomAdapter animalAdapter;
    ArrayList<Animal> animalArray = new ArrayList<>();

    AnimalDisplayFragment animalDisplayFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        animalArray.add(new Animal(R.drawable.ic_acromantula,getString(R.string.acromantula),getString(R.string.acromantula_description)));
        animalArray.add(new Animal(R.drawable.ic_centaur,getString(R.string.centaur),getString(R.string.centaur_description)));
        animalArray.add(new Animal(R.drawable.ic_grindylow,getString(R.string.grindylow),getString(R.string.grindylow_description)));
        animalArray.add(new Animal(R.drawable.ic_hippogrif,getString(R.string.hippogrif),getString(R.string.hippogrif_description)));
        animalArray.add(new Animal(R.drawable.ic_pixies,getString(R.string.pixies),getString(R.string.pixies_description)));



        animalAdapter = new AnimalCustomAdapter(MainActivity.this, R.layout.listview, animalArray);

        animalList = findViewById(R.id.listView1);
        animalList.setItemsCanFocus(false);
        animalList.setAdapter(animalAdapter);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This is a Actionbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
