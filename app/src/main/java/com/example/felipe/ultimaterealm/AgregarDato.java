package com.example.felipe.ultimaterealm;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import io.realm.Realm;

public class AgregarDato extends AppCompatActivity {

    EditText name,age;
    Realm realm;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar);
        name = (EditText)findViewById(R.id.name);
        age = (EditText)findViewById(R.id.age);


        Realm.init(this);    //inicializar para acceder a la base de datos para esta actividad
        realm = Realm.getDefaultInstance();   //crear un objeto para la base de datos de lectura y escritura

        findViewById(R.id.addbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realm.beginTransaction();  //abrir la base de datossss
                //database operation
                Information obj = realm.createObject(Information.class);  //esto creará un objeto de información que se insertará en dtabase

                obj.setName(name.getText().toString());
                obj.setAge(age.getText().toString());
                realm.commitTransaction(); //close the database
                finish();
            }
        });
    }



}
