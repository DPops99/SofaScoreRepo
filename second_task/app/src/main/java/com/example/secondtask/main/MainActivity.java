package com.example.secondtask.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;


import com.example.secondtask.R;
import com.example.secondtask.main.first_fragment.InputFragment;
import com.example.secondtask.main.second_fragment.ShowFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navView = findViewById(R.id.nav_view);

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_view,new InputFragment()).commit();
        }
        setListeners();
    }

    public void setListeners(){
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selected = null;
                switch (item.getItemId()){
                    case R.id.input_menu:
                        selected = new InputFragment();
                        break;
                    case R.id.show_menu:
                        selected = new ShowFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_view,selected).commit();
                return true;
            }
        });
    }
}
