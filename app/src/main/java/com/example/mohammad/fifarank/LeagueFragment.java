package com.example.mohammad.fifarank;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import nl.dionsegijn.steppertouch.StepperTouch;


public class LeagueFragment extends Fragment {






    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_league, container, false);

        StepperTouch stepperTouch= (StepperTouch) view.findViewById(R.id.stepperTouch1);
        stepperTouch.stepper.setMin(0);
        int n=stepperTouch.stepper.getValue();
        Toast.makeText(getContext(),Integer.toString(n), Toast.LENGTH_SHORT).show();

        return view;
    }




}
