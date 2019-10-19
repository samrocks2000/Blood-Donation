package com.example.blood_donation.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.blood_donation.CreateRequestActivity;
import com.example.blood_donation.MainActivity;
import com.example.blood_donation.R;
import com.example.blood_donation.RequestsActivity;
import com.example.blood_donation.SearchActivity;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    Button buttonRequests, buttonSearch , buttonCreateRquest;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
       View root = inflater.inflate(R.layout.fragment_home, container, false);
        buttonSearch = root.findViewById(R.id.button_Search);
        buttonRequests = root.findViewById(R.id.button_requests);
        buttonCreateRquest = root.findViewById(R.id.button_create_request);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), SearchActivity.class);
                startActivity(i);
            }
        });

        buttonCreateRquest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), CreateRequestActivity.class);
                startActivity(i);
            }
        });

        buttonRequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), RequestsActivity.class);
                startActivity(i);
            }
        });

        return root;
    }
}