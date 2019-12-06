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

import com.camy.androidfinal.interfaces.DataFromPartTimeFragment;

import model.Car;
import model.FixedBasedPartTime;
import model.MotorCycle;
import model.SingleToneExample;
import model.abstracts.Vehicle;
import model.enums.Gender;

public class FixBasedFragment extends Fragment implements DataFromPartTimeFragment {


    TextView name;
    TextView age;
    RadioGroup gender;
    TextView ratePerHour;
    TextView numberOfHours;
    TextView dateOfBirth;
    RadioGroup vehicle;

    TextView fixedamount;
    Button addFixedBasedEmployee;

}