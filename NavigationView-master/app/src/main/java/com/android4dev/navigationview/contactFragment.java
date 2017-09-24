package com.android4dev.navigationview;

import android.app.Activity;
import android.content.ContentProvider;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;

public class contactFragment extends Fragment implements View.OnClickListener {
    Button myButton;
    EditText edit;
    List<String> phoneNumberArray = new ArrayList<String>();
    ListView mobList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.addcontact, container, false);
        myButton = (Button) v.findViewById(R.id.textView2);
        edit = (EditText) v.findViewById(R.id.editman);
        mobList = (ListView) v.findViewById(R.id.mobile_list);
        edit.setEnabled(false);

       // edit.bac
        myButton.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        // implements your things
        Log.wtf("OK", "YA BOI");
        edit.setEnabled(true);
        edit.bringToFront();
        phoneNumberArray.add(edit.getText().toString());
        mobList.Add( )
    }


}

