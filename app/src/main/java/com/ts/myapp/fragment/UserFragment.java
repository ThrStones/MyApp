package com.ts.myapp.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ts.myapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment {
    private TextView tv_message;

    public UserFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        tv_message = view.findViewById(R.id.tv_title);
        return view;
    }
}
