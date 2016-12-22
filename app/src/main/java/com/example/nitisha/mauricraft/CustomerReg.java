package com.example.nitisha.mauricraft;


        import android.app.Activity;
        import android.content.Intent;
        import android.media.Image;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;


/**
 * Created by Essoo Farheen on 12/12/2016.
 */
public class CustomerReg extends Activity {
    ImageView Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_registration);



        Home = (ImageView)findViewById(R.id.iBtnHome);
        Home.setClickable(true);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent menu = new Intent(CustomerReg.this, ArtisanMenu.class);
                startActivity(menu);
            }
        });


    }
}


