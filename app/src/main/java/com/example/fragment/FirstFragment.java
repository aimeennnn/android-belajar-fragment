package com.example.fragment;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class FirstFragment extends Fragment {
    View view;
    Button firstButton;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState){
        view = inflater.inflate(R.layout.activity_first_fragment,container, false);
        firstButton = view.findViewById(R.id.firstbutton);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"First Fragment",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
