package com.example.felipe.ultimaterealm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmResults;

public class MostrarDato extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar);
        TextView show = (TextView)findViewById(R.id.show);
        Realm.init(this);
        Realm realm = Realm.getDefaultInstance(); //creando el objeto de la base de datos
        RealmResults<Information> results = realm.where(Information.class).findAllAsync();
        //buscando los datos
        results.load();
        String output="";
        for(Information information:results){
            output+=information.toString();
        }
        show.setText(output);
    }


}
