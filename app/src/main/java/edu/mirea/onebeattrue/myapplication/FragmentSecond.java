package edu.mirea.onebeattrue.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import edu.mirea.onebeattrue.myapplication.databinding.FirstFragmentBinding;
import edu.mirea.onebeattrue.myapplication.databinding.SecondFragmentBinding;

public class FragmentSecond extends Fragment {

    SecondFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = SecondFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
