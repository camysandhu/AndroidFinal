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
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.parttime_fragment_layout, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.ratePerHour = view.findViewById(R.id.text_rateper_hour);
        this.numberOfHours = view.findViewById(R.id.text_number_of_hours);

        this.fragmentManager = getActivity().getSupportFragmentManager();

        this.parttimeType = getActivity().findViewById(R.id.radio_group_parttime_type);

        this.parttimeType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }
        });




    }
}
