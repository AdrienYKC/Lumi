package ARKstudios.lumiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class SettingsMenu extends AppCompatActivity {

    public ImageButton menu;
    public ImageButton settings;
    public ImageButton color;
    public ImageButton baby;
    public ImageButton notifications;
    Intent nextScreen;

    public void init(){

        menu = (ImageButton) findViewById(R.id.imageButton5);
        settings = (ImageButton) findViewById(R.id.imageButton7);
        color = (ImageButton) findViewById(R.id.imageButton6);
        baby = (ImageButton) findViewById(R.id.imageButton8);
        notifications = (ImageButton) findViewById(R.id.imageButton9);

    }

    public void menuButtonClicked(View view){

        if (settings.getVisibility() == View.INVISIBLE) {

            settings.setVisibility(View.VISIBLE);
            color.setVisibility(View.VISIBLE);
            baby.setVisibility(View.VISIBLE);
            notifications.setVisibility(View.VISIBLE);
        }//end if
        else {

            settings.setVisibility(View.INVISIBLE);
            color.setVisibility(View.INVISIBLE);
            baby.setVisibility(View.INVISIBLE);
            notifications.setVisibility(View.INVISIBLE);
        }//end else

    }

    public void settingsButtonClicked(View view){
        nextScreen = new Intent(this, SettingsMenu.class);
        startActivity(nextScreen);
    }
    public void colorButtonClicked(View view){
        nextScreen = new Intent(this, ColorMenu.class);
        startActivity(nextScreen);
    }
    public void babyButtonClicked(View view){
        nextScreen = new Intent(this, BabyMenu.class);
        startActivity(nextScreen);
    }
    public void notificationsButtonClicked(View view){
        nextScreen = new Intent(this, NotificationsMenu.class);
        startActivity(nextScreen);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_menu);
        init();
    }
}
