package com.camy.androidfinal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.camy.androidfinal.interfaces.DateFromEmployeeDetailsFragment;

import model.Car;
import model.CommissionBasedPartTime;
import model.FixedBasedPartTime;
import model.FullTime;
import model.Intern;
import model.abstracts.Employee;
import model.abstracts.PartTime;
import model.enums.Gender;

public class EmployeeDatailsFragment extends Fragment implements DateFromEmployeeDetailsFragment {

    Employee employee;
    TextView name;
    TextView age;
    TextView gender;
    TextView vehicle;
    CardView parttime_card;
    CardView fulltime_card;
    CardView intern_card;
    TextView employment_type;
    TextView total_earning;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}