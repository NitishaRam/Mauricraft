package com.example.nitisha.mauricraft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainRegistrationPage extends AppCompatActivity {
    Button a_Login ,a_Register,ArtisanRegForm,Quit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_registration_page);



        a_Login=(Button) findViewById(R.id.btnlogin);

        a_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {

                Intent menu =new Intent(MainRegistrationPage.this,ArtisanMenu.class);
                startActivity(menu);


                a_Register=(Button) findViewById(R.id.btnCustReg);
                a_Register.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View c) {
                        Intent customerR=new Intent(MainRegistrationPage.this,CustomerReg.class);
                        startActivity(customerR);

                    }
                });

                ArtisanRegForm=(Button) findViewById(R.id.btnregister);
                ArtisanRegForm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View c) {
                        Intent ArtisanR=new Intent(MainRegistrationPage.this,Register_Artisan.class);
                        startActivity(ArtisanR);

                    }
                });

                Quit = (Button)findViewById(R.id.btnExit);

                Quit.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        //Finish method is used to close all open activities.
                        finish();

                    }
                });



            }
        });
    }
}