package com.example.matrimony.ui.password;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.matrimony.R;
import com.example.matrimony.databinding.FragmentChangepasswordBinding;
import com.example.matrimony.databinding.FragmentHomeBinding;
import com.example.matrimony.ui.home.HomeViewModel;

public class changepassword extends Fragment {



    private FragmentChangepasswordBinding binding;






    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {





        ChangepasswordViewModel changepasswordViewModel =
                new ViewModelProvider(this).get(ChangepasswordViewModel.class);

        binding = FragmentChangepasswordBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;



















//    private ChangepasswordViewModel mViewModel;
//
//    public static changepassword newInstance() {
//        return new changepassword();
//    }
//
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_changepassword, container, false);
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        mViewModel = new ViewModelProvider(this).get(ChangepasswordViewModel.class);
//        // TODO: Use the ViewModel
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}