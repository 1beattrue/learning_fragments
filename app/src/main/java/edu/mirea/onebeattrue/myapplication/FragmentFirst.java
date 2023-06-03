package edu.mirea.onebeattrue.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import edu.mirea.onebeattrue.myapplication.databinding.FirstFragmentBinding;

public class FragmentFirst extends Fragment {

    FirstFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FirstFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
