package com.example.fragment;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SecondFragment extends Fragment {
    View view;
    Button SecondButton;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState){
        view = inflater.inflate(R.layout.activity_second_fragment,container, false);
        SecondButton = view.findViewById(R.id.secondbutton);
        SecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Second Fragment",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
