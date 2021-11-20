package com.example.arraylist_adapter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        b=findViewById(R.id.button);
        e=findViewById(R.id.editTextTextPersonName);
        ArrayList<String>friendlist=new ArrayList<String>();
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                friendlist );;

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

       /*friendlist.add("ali");
        friendlist.add("amna");
        friendlist.add("alia");
        friendlist.add("aksar");*/
                lv.setAdapter(arrayAdapter);
                friendlist.add(e.getText().toString());
                Collections.sort(friendlist);
                arrayAdapter.notifyDataSetChanged();
            }
        });

      /*  lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Delete Recod")
                        .setMessage("Do you really want to delete this task!")
                        .setCancelable(false)
                        .setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                friendlist.remove(position);
                                arrayAdapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .show();
            }

        });
*/
       /*lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Log.i("you selected",friendlist.get(i));
            }
            });*/
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent newintent= new Intent(MainActivity.this,detail.class);
                Log.i("you selected",friendlist.get(i));
                startActivity(newintent);

            }
        });

    }
}