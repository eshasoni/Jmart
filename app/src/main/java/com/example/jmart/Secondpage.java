package com.example.jmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Secondpage extends AppCompatActivity {
    private Button login;
    String cityy;
    Spinner mySpinner;
    ArrayAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_secondpage );
        Spinner mySpinner = findViewById( R.id.city );
        final ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Secondpage.this, android.R.layout.simple_list_item_1,getResources().getStringArray( R.array.names ));
        myAdapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        mySpinner.setAdapter( myAdapter);
        login = findViewById( R.id.log );
        mySpinner = findViewById( R.id.city);
            login.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent( Secondpage.this, Login.class );
                    startActivity( intent1 );

                }
            });

    }

}
