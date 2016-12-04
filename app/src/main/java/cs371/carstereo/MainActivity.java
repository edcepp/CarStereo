package cs371.carstereo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    boolean displayOn = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayOn = false;
    }

    public void powerOn(View view) {
        TextView channel_text_color = (TextView)findViewById(R.id.channel_display);
        if (displayOn) {
            channel_text_color.setTextColor(Color.GREEN);}
        else {
            channel_text_color.setTextColor(Color.BLACK);
        }
        displayOn = !displayOn;
    }
}
