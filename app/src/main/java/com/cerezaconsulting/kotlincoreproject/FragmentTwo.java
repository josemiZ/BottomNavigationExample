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

public class FragmentTwo extends Fragment {

    @BindView(R.id.textView2)
    TextView textView2;
    Unbinder unbinder;

    public static FragmentTwo newInstance() {
        return new FragmentTwo();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_two, container, false);
        unbinder = ButterKnife.bind(this, root);
        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("OnResumeTwo","Resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("OnPauseTwo","Resume");
    }

    @Override
    public void onDestroy() {
        Log.d("OnDestroyTwo","OnDestroy");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
