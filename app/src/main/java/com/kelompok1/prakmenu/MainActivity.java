package com.kelompok1.prakmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu1) {
            startActivity(new Intent(this, Menu1.class));
            return true;
        } else if (id == R.id.menu2) {
            startActivity(new Intent(this, Menu2.class));
            return true;
        } else if (id == R.id.menu3) {
            startActivity(new Intent(this, Menu3.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
