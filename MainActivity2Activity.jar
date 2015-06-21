package com.nmnmnm.vkla;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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

    public final static String THIEF = "com.nmnmnm.vkla.THIEF";

    public void onRadionClick(View v) {
        Intent answerIntent = new Intent();

        switch (v.getId()) {

            case R.id.radioDog:
                answerIntent.putExtra(THIEF, "Сраный пёсик");
                break;

            case R.id.radioCrow:
                answerIntent.putExtra(THIEF, "Ворона");

            case R.id.radioCat:
                answerIntent.putExtra(THIEF, "Лошадь Прожевальского");
                break;
            default:
                break;
        }
         setResult(RESULT_OK, answerIntent);
        finish();

    }
}
