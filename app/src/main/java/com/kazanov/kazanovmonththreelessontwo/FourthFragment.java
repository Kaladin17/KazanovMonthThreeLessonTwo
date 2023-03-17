package com.kazanov.kazanovmonththreelessontwo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FourthFragment extends Fragment {

    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    } @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews();
        getBundle();
    }

    private void findViews() {
        textView = requireView().findViewById(R.id.fourth_fragment_tv);
    }

    private void getBundle() {
        if (getArguments() !=null){
            String list = getArguments().getString("key_three");
            textView.setText(list);
        }
    }
}