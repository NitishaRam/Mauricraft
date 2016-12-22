package com.example.nitisha.mauricraft;

/**
 * Created by Nitisha on 22/12/2016.
 */
import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Essoo Farheen on 12/14/2016.
 */
public class Edit_Profile extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile);

        ImageView Home ;
        Button save;



        Home = (ImageView) findViewById(R.id.iBtnHome);

        Home.setClickable(true);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent menu = new Intent(Edit_Profile.this, ArtisanMenu.class);
                startActivity(menu);
            }
        });

        save = (Button) findViewById(R.id.btnSave);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent menu = new Intent(Edit_Profile.this, ArtisanMenu.class);
                startActivity(menu);
            }
        });


    }

}



