package edu.sliit.edulink.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import edu.sliit.edulink.R;
import edu.sliit.edulink.SubjectActivity;

/**
 * Created by drox2014 on 7/23/2017.
 */

public class LessonMenuFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.content_lessons, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Lessons");

        getActivity().findViewById(R.id.grade_1_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubjectActivity.class);
                intent.putExtra("Grade", 1);
                getActivity().startActivity(intent);
            }
        });

        getActivity().findViewById(R.id.grade_2_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubjectActivity.class);
                intent.putExtra("Grade", 2);
                getActivity().startActivity(intent);
            }
        });

        getActivity().findViewById(R.id.grade_3_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubjectActivity.class);
                intent.putExtra("Grade", 3);
                getActivity().startActivity(intent);
            }
        });

        getActivity().findViewById(R.id.grade_4_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubjectActivity.class);
                intent.putExtra("Grade", 4);
                getActivity().startActivity(intent);
            }
        });

    }
}
