package com.nmnmnm.vkla;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private TextView infoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected void onActivityResult(int requestCode, Intent data){

        super.onActivityResult(requestCode, requestCode, data);

        if (requestCode == CHOOSE_THIEF) {
            if (requestCode == RESULT_OK) {
                String thiefname = data.getStringExtra(MainActivity2Activity.THIEF);
                infoTextView.setText(thiefname);
            } else {
                infoTextView.setText("");
            }
        }
    }




    static final private int CHOOSE_THIEF = 0;

    public void onClick(View v) {
        Intent questionIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
        startActivityForResult(questionIntent, CHOOSE_THIEF);

           }


}
