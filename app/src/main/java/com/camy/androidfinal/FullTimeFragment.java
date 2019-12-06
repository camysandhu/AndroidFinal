package com.camy.androidfinal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.camy.androidfinal.interfaces.DataFromAddEmployeeFragment;

import model.Car;
import model.FullTime;
import model.MotorCycle;
import model.SingleToneExample;
import model.abstracts.Vehicle;
import model.enums.Gender;

public class FullTimeFragment extends Fragment implements DataFromAddEmployeeFragment {


    TextView name;
    TextView age;
    RadioGroup gender;
    TextView dateOfBirth;
    RadioGroup vehicle;

    TextView salary;
    TextView bonus;
    Button addIntern;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fulltime_fragment_layout, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        this.salary = view.findViewById(R.id.text_salary);

        this.bonus = view.findViewById(R.id.text_bonus);


        this.addIntern = view.findViewById(R.id.btn_fulltime_employee);

        this.addIntern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (!bonus.getText().toString().isEmpty() && !salary.getText().toString().isEmpty() && !name.getText().toString().isEmpty() && !age.getText().toString().isEmpty() && !(gender.getCheckedRadioButtonId() == -1)) {


                    String name_string = name.getText().toString();
                    int age_int = Integer.parseInt(age.getText().toString().substring(6));
                    Gender gender_enum = null;
                    int salary_int = Integer.parseInt(salary.getText().toString());
                    int bonus_int = Integer.parseInt(bonus.getText().toString());
                }
            });
            }