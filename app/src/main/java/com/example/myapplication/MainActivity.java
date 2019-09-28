package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemClickListener {

    String yabasha[]={"Africa","America","Europe","Asia","Australia"};
    ListView lv;
    int picked;
    Intent si;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        picked = 0;
        lv = (ListView) findViewById(R.id.lv);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,yabasha);

        lv.setAdapter(adp);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setOnItemClickListener(this);

        si = new Intent (this,Main2Activity.class);

    }

    public void next(View view) {
        si.putExtra("n",picked);
        startActivity(si);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                Toast.makeText(this, "Africa", Toast.LENGTH_SHORT).show();
                picked = 0;
                break;
            case 1:
                Toast.makeText(this, "America", Toast.LENGTH_SHORT).show();
                picked = 1;
                break;
            case 2:
                Toast.makeText(this, "Europe", Toast.LENGTH_SHORT).show();
                picked = 2;
                break;
            case 3:
                Toast.makeText(this, "Asia", Toast.LENGTH_SHORT).show();
                picked = 3;
                break;
            case 4:
                Toast.makeText(this, "Australia", Toast.LENGTH_SHORT).show();
                picked = 4;
                break;

        }
    }
}
