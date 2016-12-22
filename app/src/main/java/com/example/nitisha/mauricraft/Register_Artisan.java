package com.example.nitisha.mauricraft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Essoo Farheen on 12/14/2016.
 */
public class Register_Artisan extends Activity{

    Button button;
    EditText UsernameField;
    EditText passwordfield;
    ImageView Home;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artisan_registration);

        UsernameField = (EditText) findViewById(R.id.Usernamefield);
        UsernameField.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (UsernameField.getText().length() > 15) {
                    UsernameField.setError("Username is too long!");

                }
            }

        });

        passwordfield = (EditText) findViewById(R.id.passwordfield);
        passwordfield.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (passwordfield.getText().length() < 5 || passwordfield.getText().length()>15 ) {
                    passwordfield.setError("Incorrect,Password is too short or too long!");
                }
            }
        });


        button = (Button) findViewById(R.id.nextBtn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register_Artisan.this, Edit_Profile.class);
                startActivity(intent);

            }

        });
        Home = (ImageView)findViewById(R.id.iBtnHome);
        Home.setClickable(true);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent menu = new Intent(Register_Artisan.this, ArtisanMenu.class);
                startActivity(menu);
            }
        });


    }
}
