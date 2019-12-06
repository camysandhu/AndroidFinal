package com.camy.androidfinal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class AddEmployeesFragment extends Fragment implements View.OnClickListener {

    TextView text_age;
    TextView text_name;
    TextView text_date_of_birth;
    RadioGroup gender;
    RadioGroup vehicle;
    RadioGroup employementtype;
    FullTimeFragment fullTimeFragment;
    PartTimeFragment partTimeFragment;
    InternFragment internFragment;

    FragmentManager fragmentManager;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.add_employee_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.vehicle = view.findViewById(R.id.radio_group_vehicle);
        this.text_age = view.findViewById(R.id.text_age);
        this.text_name = view.findViewById(R.id.text_name);
        this.fragmentManager = this.getActivity().getSupportFragmentManager();




        this.text_date_of_birth = view.findViewById(R.id.text_date_of_birth);
        this.text_date_of_birth.setText(this.text_date_of_birth.getText());
        this.text_date_of_birth.setOnClickListener(this) ;

        this.gender = view.findViewById(R.id.radio_group_gender);
//




    }

    @Override
    public void onClick(View v) {
        DatePickerFragment dtfragment = new DatePickerFragment();
        dtfragment.show(getActivity().getSupportFragmentManager(), "DatePicker");
    }



}
