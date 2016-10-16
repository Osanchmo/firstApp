package com.example.a21753725a.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button bton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View frag = inflater.inflate(R.layout.fragment_main, container, false);

        bton = (Button) frag.findViewById(R.id.bton);
        final TextView textMsg = (TextView) frag.findViewById(R.id.textMsg);
        bton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textMsg.setText("Hola Mundo!");

            }
        });

        return frag;
    }

}
