package com.example.test1.ui.home.homeProgam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.test1.R;
import com.example.test1.ui.home.BUS.BUS11;
import com.example.test1.ui.home.BUS.BUS8;

public class WEIGHTLIFTING_109_KG_GROUP_A_AND_VICTORY_CEREMONY_MEN_s extends Fragment implements  View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.weightlifting_109_kg_group_a_and_victory_ceremony_men_s, container, false);
        Button b1 = (Button) view.findViewById(R.id.button000);
        b1.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.button000:
                fragment = new BUS11();
                replaceFragment(fragment);
                break;

        }
    }
    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
