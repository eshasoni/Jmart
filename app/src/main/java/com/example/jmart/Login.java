 package com.example.jmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

 public class Login extends AppCompatActivity {
     private Button loginn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
        Spinner type_Spinner = findViewById( R.id.type );
        ArrayAdapter<String> myadap = new ArrayAdapter<>(Login.this, android.R.layout.simple_list_item_1,getResources().getStringArray( R.array.type));
        myadap.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        type_Spinner.setAdapter( myadap );

        loginn = findViewById( R.id.login1 );
        loginn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent( Login.this, Fourth.class );
                startActivity( intent2 );
            }
        } );


    }
}
