package com.example.kjbrouss_emotilog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavOptions;
import androidx.navigation.fragment.NavHostFragment;

import java.text.DateFormat;


// this class runs the first fragment.
//this fragment implments the main page following the firtfragment.xml file
// the buttons and textviews corresponding to the design requirements are enabled and are given methods
// within this fragment class to allow us to see total count and frequency for each emotion clicked.
// the count me function takes a textview in(iur happy_count textview for example) and increments it when called with
// it used as an arguement.
// oncreateview intiailizes the textviews with their respective views
// on view created implements the countme function such that when you click a button
// the frequency and total count increases on each respective button press
// Code advice for timestamps given by oracle.com citation in README file
public class FirstFragment extends Fragment {
    String button_timestamp = "";
    TextView happy_count;
    TextView sad_count;
    TextView joyous_count;
    TextView excited_count;
    TextView angry_count;
    TextView upset_count;
    TextView total_count;

    private void countMe(TextView view) {
        String countString = view.getText().toString();
        Integer count = Integer.parseInt(countString);
        count++;
        view.setText(count.toString());
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View fragmentFirstLayout = inflater.inflate(R.layout.firstfragment, container, false);
        happy_count = fragmentFirstLayout.findViewById(R.id.happyView);
        sad_count = fragmentFirstLayout.findViewById(R.id.sadView);
        joyous_count = fragmentFirstLayout.findViewById(R.id.joyousView);
        excited_count = fragmentFirstLayout.findViewById(R.id.excitedView);
        angry_count = fragmentFirstLayout.findViewById(R.id.angryView);
        upset_count = fragmentFirstLayout.findViewById(R.id.upsetView);
        total_count = fragmentFirstLayout.findViewById(R.id.total_count);
        button_timestamp = "";
        return fragmentFirstLayout;
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_logs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button_timestamp == null) {
                    button_timestamp += "";
                }
                FirstFragmentDirections.ActionFirstFragmentToSecondFragment action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("");
                action.setButtonTimestamp(button_timestamp);
                NavHostFragment.findNavController(FirstFragment.this).navigate(action);
            }
        });
        view.findViewById(R.id.button_happy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countMe(happy_count);
                countMe(total_count);
                if(button_timestamp == null) {
                    button_timestamp += "";
                }
                else{button_timestamp += "Happy: " +DateFormat.getDateTimeInstance().format(new java.util.Date()) + "\n";}
            }
        });
        view.findViewById(R.id.button_sad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countMe(sad_count);
                countMe(total_count);
                if(button_timestamp == null) {
                    button_timestamp += "";
                }
                else{button_timestamp += "Sad: " +DateFormat.getDateTimeInstance().format(new java.util.Date()) + "\n";}
            }
        });
        view.findViewById(R.id.button_joyous).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countMe(joyous_count);
                countMe(total_count);
                if(button_timestamp == null) {
                    button_timestamp += "";
                }
                else{button_timestamp += "Joyous: " +DateFormat.getDateTimeInstance().format(new java.util.Date()) + "\n";}
            }
        });
        view.findViewById(R.id.button_excited).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countMe(excited_count);
                countMe(total_count);
                if(button_timestamp == null) {
                    button_timestamp += "";
                }
                else{button_timestamp += "Excited: " +DateFormat.getDateTimeInstance().format(new java.util.Date()) + "\n";}
            }
        });
        view.findViewById(R.id.button_angry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countMe(angry_count);
                countMe(total_count);
                if(button_timestamp == null) {
                    button_timestamp += "";
                }
                else{button_timestamp += "Angry: " + DateFormat.getDateTimeInstance().format(new java.util.Date()) + "\n";}
            }
        });
        view.findViewById(R.id.button_upset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countMe(upset_count);
                countMe(total_count);
                if(button_timestamp == null) {
                    button_timestamp += "";
                }
                else{button_timestamp += "Upset: " + DateFormat.getDateTimeInstance().format(new java.util.Date()) + "\n";}
            }
        });


    }



}
