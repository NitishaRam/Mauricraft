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

/**
 * Created by Essoo Farheen on 12/16/2016.
 */
public class Help_menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);


        ImageView Home;

        Home = (ImageView) findViewById(R.id.iBtnHome);
        Home.setClickable(true);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent menu = new Intent(Help_menu.this, ArtisanMenu.class);
                startActivity(menu);
            }

        });
    }
}
