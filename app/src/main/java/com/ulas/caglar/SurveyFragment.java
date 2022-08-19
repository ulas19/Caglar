package com.ulas.caglar;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.firestore.FirebaseFirestore;
import com.ulas.caglar.databinding.FragmentSurveyBinding;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SurveyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SurveyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    FragmentSurveyBinding binding;
    public SurveyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SurveyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SurveyFragment newInstance(String param1, String param2) {
        SurveyFragment fragment = new SurveyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSurveyBinding.inflate(inflater, container, false);



        binding.option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.question.setText("Alfabe");
                binding.option1.setText("E");
                binding.option2.setText("F");
                binding.option3.setText("G");
                binding.option4.setText("H");
            }
        });

        binding.option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.question.setText("Alfabe");
                binding.option1.setText("E");
                binding.option2.setText("F");
                binding.option3.setText("G");
                binding.option4.setText("H");
            }
        });

        binding.option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.question.setText("Alfabe");
                binding.option1.setText("E");
                binding.option2.setText("F");
                binding.option3.setText("G");
                binding.option4.setText("H");
            }
        });

        binding.option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.question.setText("Alfabe");
                binding.option1.setText("E");
                binding.option2.setText("F");
                binding.option3.setText("G");
                binding.option4.setText("H");
            }
        });
        return binding.getRoot();
    }
}