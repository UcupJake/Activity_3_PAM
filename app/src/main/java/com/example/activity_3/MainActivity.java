package com.example.activity_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.login_user, menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item) {
        if (item.getItemId() == R.id.menu1) {
            startActivity(new Intent(this, Menu1Activity.class));
        } else if (item.getItemId() == R.id.menu2) {
            startActivity(new Intent(this, Menu2Activity.class));
        } else if (item.getItemId() == R.id.menu3) {
            startActivity(new Intent(this, Menu3Activity.class));
        }

        return  true;
    }


}
