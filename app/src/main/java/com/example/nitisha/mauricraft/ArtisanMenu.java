package com.example.nitisha.mauricraft;

/**
 * Created by Nitisha on 22/12/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Essoo Farheen on 12/12/2016.
 */

public class ArtisanMenu extends Activity {

    ImageView edit_prof, menu_camera, menu_rating, help, picture;
     private  Button Exit;
    static final int CAM_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        edit_prof = (ImageView) findViewById(R.id.picProfile);
        edit_prof.setClickable(true);
        edit_prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent e_p = new Intent(ArtisanMenu.this, Edit_Profile.class);
                startActivity(e_p);
            }
        });





        edit_prof = (ImageView) findViewById(R.id.picRating);
        edit_prof.setClickable(true);
        edit_prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent e_p = new Intent(ArtisanMenu.this, Edit_Profile.class);
                startActivity(e_p);
            }
        });

        menu_camera = (ImageView) findViewById(R.id.picCamera);
        menu_camera.setClickable(true);
        menu_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                Intent intent_camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent_camera, CAM_REQUEST);

            }
        });


        menu_rating = (ImageView) findViewById(R.id.picRating);
        menu_rating.setClickable(true);
        menu_rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent intent_rating = new Intent(ArtisanMenu.this, ViewPic_Rating.class);
                startActivity(intent_rating);
            }
        });


        picture = (ImageView) findViewById(R.id.picPicture);
        picture.setClickable(true);
        picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent intent_rating = new Intent(ArtisanMenu.this, ViewPic_Rating.class);
                startActivity(intent_rating);
            }
        });

        help = (ImageView) findViewById(R.id.TViewHelp);
        help.setClickable(true);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent intent_rating = new Intent(ArtisanMenu.this, Help_menu.class);
                startActivity(intent_rating);
            }
        });

        Exit= (Button) findViewById(R.id.btnExit);

        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent Exit = new Intent(ArtisanMenu.this, MainRegistrationPage.class);
                startActivity(Exit);
            }
        });



    }
}