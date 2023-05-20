package com.vag.vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;

import android.os.Bundle;

import com.vag.R;
import com.vag.databinding.ActivityMainBinding;
import com.vag.vista.fragmentos.LoginFragment;

public class MainActivity extends AppCompatActivity implements LoginFragment.LoginFragInterface {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginFragment fragmento = new LoginFragment();

//        NavHostFragment navH = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_activity_main);

    }

    @Override
    public void onAceptarLoginFrag(String user) {

    }

}