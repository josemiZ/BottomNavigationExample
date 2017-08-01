package com.cerezaconsulting.kotlincoreproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by miguel on 29/07/17.
 */

public class FragmentThree extends Fragment {

    @BindView(R.id.textView)
    TextView textView;
    Unbinder unbinder;

    public static FragmentThree newInstance() {
        return new FragmentThree();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_one, container, false);
        unbinder = ButterKnife.bind(this, root);
        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("OnResumeThree","Resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("OnPauseThree","Resume");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
