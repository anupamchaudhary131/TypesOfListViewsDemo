package com.example.typesoflistviewsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView autoTxtView;

    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrIds = new ArrayList<>();
    ArrayList<String> arrLanguages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        spinner = (Spinner)findViewById(R.id.spinner);
        autoTxtView = (AutoCompleteTextView)findViewById(R.id.autoTxtView);


       // listView


        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Rajan");
        arrNames.add("Ranveer");
        arrNames.add("Ramu");
        arrNames.add("Rama");
        arrNames.add("jatin");
        arrNames.add("nitin");
        arrNames.add("nitish");
        arrNames.add("rohit");
        arrNames.add("shubham");
        arrNames.add("Ravi");
        arrNames.add("kapil");
        arrNames.add("shiv");
        arrNames.add("shiva");
        arrNames.add("shankar");
        arrNames.add("shyam");
        arrNames.add("ritik");
        arrNames.add("roshan");
        arrNames.add("Reeshu");
        arrNames.add("Reshma");
        arrNames.add("Rekha");
        arrNames.add("Rita");
        arrNames.add("Riya");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0)
                {
                    Toast.makeText(getApplicationContext(), "Clicked First Item", Toast.LENGTH_LONG).show();
                }
            }
        });


        // spinner

        arrIds.add("Select Any ID Proof");
        arrIds.add("Aadhar Card");
        arrIds.add("PAN Card");
        arrIds.add("VOTER ID Card");
        arrIds.add("Driving Licence Card");
        arrIds.add("Ration Card");
        arrIds.add("Passport");
        arrIds.add("Xth Score Card");
        arrIds.add("XIIth Score Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrIds);
        spinner.setAdapter(spinnerAdapter);


        // AutoCompleteTextView


        arrLanguages.add("C");
        arrLanguages.add("C++");
        arrLanguages.add("C#");
        arrLanguages.add("Objective C");
        arrLanguages.add("CScript");
        arrLanguages.add("Java");
        arrLanguages.add("JavaScript");

        ArrayAdapter<String> autoAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrLanguages);
        autoTxtView.setAdapter(autoAdapter);
        autoTxtView.setThreshold(1);

    }
}