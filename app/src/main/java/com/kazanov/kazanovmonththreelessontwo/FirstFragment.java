package com.kazanov.kazanovmonththreelessontwo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.Random;

public class FirstFragment extends Fragment {

    MaterialButton buttonOne;
    MaterialButton buttonTwo;
    MaterialButton buttonThree;

    String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    Integer [] numbers = {1, 10, 11, 12, 14, 18, 200, 2000, 23333};
    Boolean aBoolean = true;
    Double aDouble = 0.17;
    Float aFloat = 0.999F;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews();
        onClickListener();
    }

    private void onClickListener() {
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            navigateToSecondFragment();
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                navigateToThirdFragment();
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToFourthFragment();
            }
        });
    }

    private void navigateToSecondFragment() {

        Random random = new Random();
        int index = random.nextInt(days.length);
        SecondFragment secondFragment = new SecondFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_one", days[index]);
        secondFragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, secondFragment).commit();
    }

    private void navigateToThirdFragment() {

        ArrayList <Integer> selection = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (a < numbers[i]){
                a = numbers[i];
            }
        }
        for (int j = 0; j < a; j=j+2) {
            for (int i = 0; i < numbers.length; i++) {
                if (j==numbers[i]){
                    selection.add(numbers[i]);
                }
            }
        }
        ThirdFragment thirdFragment = new ThirdFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_two", String.valueOf(selection));
        thirdFragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, thirdFragment).commit();
    }

    private void navigateToFourthFragment() {

        ArrayList <String> list = new ArrayList<>();
        list.add(String.valueOf(aBoolean));
        list.add(String.valueOf(aDouble));
        list.add(String.valueOf(aFloat));

        FourthFragment fourthFragment = new FourthFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_three", String.valueOf(list));
        fourthFragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fourthFragment).commit();
    }

        private void findViews() {
    buttonOne = requireActivity().findViewById(R.id.button_one);
    buttonTwo = requireActivity().findViewById(R.id.button_two);
    buttonThree = requireActivity().findViewById(R.id.button_three);
    }

}