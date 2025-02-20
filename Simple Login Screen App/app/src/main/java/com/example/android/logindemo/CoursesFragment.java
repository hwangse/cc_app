package com.example.android.logindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CoursesFragment extends Fragment {

    private Button Sports;
    private Button Cooking;
    private Button Beauty;
    private Button Arts;
    private Button Music;
    private TextView Course;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        view = inflater.inflate(R.layout.fragment_courses, container, false);

        Sports=(Button)view.findViewById(R.id.sports);
        Cooking=(Button)view.findViewById(R.id.cook);
        Beauty=(Button)view.findViewById(R.id.beauty);
        Arts=(Button)view.findViewById(R.id.arts);
        Music=(Button)view.findViewById(R.id.music);
        Course=(TextView)view.findViewById(R.id.Courses);

        Sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent coursesIntent = new Intent( CoursesFragment.this.getContext(), SportAndFitness.class);
//                CoursesFragment.this.startActivity(coursesIntent);
                 Fragment fragment=new SportAndFitnessFragment();
                 FragmentManager fragmentManager=getFragmentManager();
                 FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                 fragmentTransaction
                         .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in,R.anim.fade_out)
                         .replace(R.id.fragment_container,fragment);
                 fragmentTransaction.commit();
            }
        });

        return view;
    }


}
