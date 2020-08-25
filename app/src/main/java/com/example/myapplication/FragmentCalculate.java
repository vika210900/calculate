package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.FragmentCalculateBinding;

public class FragmentCalculate extends Fragment {
    private FragmentCalculateBinding binding;

    public static FragmentCalculate newInstance() {

        Bundle args = new Bundle();

        FragmentCalculate fragment = new FragmentCalculate();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_calculate, container, false);

        return binding.getRoot();
    }
}
