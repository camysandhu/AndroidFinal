package com.camy.androidfinal;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class HomeFragment extends Fragment {
    private TextView txtDate;
    private TextView txtTime;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.txtDate = view.findViewById(R.id.text_date);
        this.txtTime = view.findViewById(R.id.txt_Time);

        Date currentDate = new Date();
        DateFormat formatter = DateFormat.getDateInstance();
        String date = formatter.format(currentDate);
        txtDate.setText(date);
        Date currentTime = Calendar.getInstance().getTime();
        String time = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        txtTime.setText(time);

    }
}
