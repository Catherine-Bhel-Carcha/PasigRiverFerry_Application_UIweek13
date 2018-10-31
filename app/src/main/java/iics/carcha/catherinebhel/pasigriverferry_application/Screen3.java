package iics.carcha.catherinebhel.pasigriverferry_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.other) {
            i = new Intent(this, Screen2.class);
            startActivity(i);
        }
        // } else if (v.getId() == R.id.stations) {
        //    i = new Intent(getIntent().ACTION_VIEW);
        //  i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.589595 + "," + 120.975579));
        //chooser = Intent.createChooser(i, "Choose A Map App");
        //startActivity(chooser);
    }
}