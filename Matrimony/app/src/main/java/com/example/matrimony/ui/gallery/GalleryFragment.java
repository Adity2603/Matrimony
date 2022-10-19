package com.example.matrimony.ui.gallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.matrimony.R;
import com.example.matrimony.databinding.FragmentGalleryBinding;
import com.example.matrimony.edit_profile;

public class GalleryFragment extends Fragment {


    Activity context ;




    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        context=getActivity();

        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textGallery;
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;


    }


    public void onStart(){
        super.onStart();
        Button btn = (Button) context.findViewById(R.id.edit_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context , edit_profile.class);
                startActivity(i);
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }




}


//<TextView
//        android:id="@+id/text_gallery"
//                android:layout_width="match_parent"
//                android:layout_height="wrap_content"
//                android:layout_marginStart="8dp"
//                android:layout_marginTop="8dp"
//                android:layout_marginEnd="8dp"
//                android:textAlignment="center"
//                android:textSize="20sp"
//                app:layout_constraintBottom_toBottomOf="parent"
//                app:layout_constraintEnd_toEndOf="parent"
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toTopOf="parent" />