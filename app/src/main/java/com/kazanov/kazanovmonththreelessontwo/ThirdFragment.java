package com.kazanov.kazanovmonththreelessontwo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ThirdFragment extends Fragment {

    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    } @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews();
        getBundle();
    }

    private void findViews() {
        textView = requireView().findViewById(R.id.third_fragment_tv);
    }

    private void getBundle() {
        if (getArguments() !=null){
            String numbers = getArguments().getString("key_two");
            textView.setText(numbers);
        }
    }
}