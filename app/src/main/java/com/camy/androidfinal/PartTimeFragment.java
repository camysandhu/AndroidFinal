package com.camy.androidfinal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.camy.androidfinal.interfaces.DataFromAddEmployeeFragment;

public class PartTimeFragment extends Fragment implements DataFromAddEmployeeFragment {



    TextView name;
    TextView age;
    RadioGroup gender;
    TextView dateOfBirth;
    RadioGroup vehicle;

    TextView ratePerHour;
    TextView numberOfHours;


    RadioGroup parttimeType;
    FragmentManager fragmentManager;
    CommissionBasedFragment commissionBasedFragment;
    FixBasedFragment fixBasedFragment;




    public void viewsFromAddEmployeeFragment(TextView name, TextView age, RadioGroup gender , TextView dateOfBirth , RadioGroup vehicle)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.vehicle = vehicle;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);






    }
}
