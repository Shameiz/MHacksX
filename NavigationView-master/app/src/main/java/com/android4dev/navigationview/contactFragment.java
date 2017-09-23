package com.android4dev.navigationview;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class contactFragment extends Fragment implements View.OnClickListener {
    private static final int PICK_CONTACT = 1234;
    Button myButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.addcontact, container, false);
        myButton = (Button) v.findViewById(R.id.textView2);
        myButton.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        // implements your things
        Log.wtf("OK","YA BOI");
    }



}
