package com.axel.menuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.action_camera) {
            Toast.makeText(this, "Camera", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.action_search) {
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
            return true;
        }else if (item.getItemId() == R.id.action_notifications) {
            Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show();
            return true;
        }else if (item.getItemId() == R.id.action_settings) {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_contextuel, menu);
        menu.setHeaderTitle("Select Color");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_bleu) {

        } else if (item.getItemId() == R.id.action_yellow) {

        }else if (item.getItemId() == R.id.action_white) {

        }
        return true;
    }
}
