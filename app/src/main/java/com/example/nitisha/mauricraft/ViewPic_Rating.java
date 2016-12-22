package com.example.nitisha.mauricraft;

/**
 * Created by Nitisha on 22/12/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;


/**
 * Created by Essoo Farheen on 12/14/2016.
 */
public class ViewPic_Rating extends Activity {

    ImageView imagebutton, phone, sms, homeIcon,picture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pic_rating);


        imagebutton = (ImageView) findViewById(R.id.imagebtnprofpic);
        imagebutton.setClickable(true);
        imagebutton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View p) {

                Intent loadprofile = new Intent(ViewPic_Rating.this, Edit_Profile.class);
                startActivity(loadprofile);

            }

        });

        phone = (ImageView) findViewById(R.id.imagebuttoncall);
        phone.setClickable(true);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:58650143"));
                startActivity(callIntent);

            }
        });


        sms = (ImageView) findViewById(R.id.imagebtnmessage);
        sms.setClickable(true);
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {

                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:"));
                startActivity(sendIntent);

            }

        });


        homeIcon = (ImageView) findViewById(R.id.iBtnHome);
        homeIcon.setClickable(true);
        homeIcon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View p) {

                Intent loadprofile = new Intent(ViewPic_Rating.this, ArtisanMenu.class);
                startActivity(loadprofile);

            }

        });
    }
}