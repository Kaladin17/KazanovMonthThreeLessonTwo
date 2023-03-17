package com.kazanov.kazanovmonththreelessontwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    FragmentContainerView fragmentContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigateToFirstFragment();
    }


    private void navigateToFirstFragment() {
    getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new FirstFragment()).commit() ;
    }
}