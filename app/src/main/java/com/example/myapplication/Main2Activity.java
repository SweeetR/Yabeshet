package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent gi;
    String capital [][] = {{"Abuja","Nairobi","Rabat","Accra","Algier","Addis Ababa","Hartum"},{"Washington","Ottawa","Mexico city","Brazilia","Buenos Aires","Bogota","Lima"},{"Berlin","Rome","London","Paris","Madrid","Amsterdam","stockholm"},{"Jerusalem","New dehli","Tokyo","Beijing","Bangkok","Tehran","Bagdad"},{"Wellington","Nokualofa","Suva","Funafuti","Melekeok","Tarawa","Port vila"}};

    String Population [][]= {{"776,298","4,556,381","577,827","30,096,970","41,929,421","3,384,569","1,974,647"},{"7,666,343","994,837","8,918,653","2,302,102","2,891,000","10,779,000","9,751,717"},{"3,580,188","2,850,239","8,787,892","12,089,098","3,324,854","854,000","965,232"},{"874,186","18,749,992","37,435,191","24,302,851","69,183,173","8,422,166","9,825,221"},{"418,500","108,020","920,938","6,152","381","118,016","299,882"}};

    String Africa[]= {"Nigeria","Kenya","morocco","Ghana","Algeria","Ethiopia","Sudan"};
    String America[]= {"United States" , "Canada" , "Mexico", "Brazil","Argentina","Colombia","Peru"};
    String Europe [] = {"Germany","Italy","United Kingdom","France","Spain","Netherlands","Sweden"};
    String Asia[] = {"Israel","India","Japan","China","Thailand","Iran","Iraq"};
    String Australia[] = {"New Zealand","Tonga","Fiji","Tuvalu","Palau","Kiribati","Vanuatu"};

    ListView lv;

    int picked;

    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gi = getIntent();
         picked = gi.getIntExtra("n",0);

        lv = (ListView) findViewById(R.id.lv);

        switch (picked){

            case 0 : ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item,Africa);
                lv.setAdapter(adp);
            break;

            case 1 : ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item,America);
                lv.setAdapter(adp2);
            break;

            case 2 : ArrayAdapter<String> adp3 = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item,Europe);
                lv.setAdapter(adp3);
            break;

            case 3 : ArrayAdapter<String> adp4 = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item,Asia);
                lv.setAdapter(adp4);
            break;

            case 4: ArrayAdapter<String> adp5 = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item,Australia);
                lv.setAdapter(adp5);
            break;

        }


        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setOnItemClickListener(this);


        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        tv1.setText("Capital City:"+capital[picked][position]);
        tv2.setText("Population:"+Population[picked][position]);
    }
}
