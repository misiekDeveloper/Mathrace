package com.smartapps.mathrace.engine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.smartapps.mathrace.R;

/**
 * Created by user on 2015-05-05.
 */
public class SimpleFragment extends Fragment {
    private TextView tvQuestion;
    private EditText edAnswer;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        edAnswer = (EditText) rootView.findViewById(R.id.edAnswer);
        tvQuestion = rootView.findViewById(R.id.tvQuestion);
        return rootView;
    }
}
