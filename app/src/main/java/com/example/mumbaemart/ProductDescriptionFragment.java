package com.example.mumbaemart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductDescriptionFragment extends Fragment {

    public ProductDescriptionFragment() {
        // Required empty public constructor
    }

    public String body;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_description, container, false);
        TextView descriptionBody = view.findViewById(R.id.tv_product_description);
        descriptionBody.setText(body);
        return view;
    }
}