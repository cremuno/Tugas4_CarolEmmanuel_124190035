package com.example.tugas4_carolemmanuel_124190035;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment {
    private RecyclerView recyclerView;
    private final ArrayList<SayuranFragment> list= new ArrayList<>();
    private final Object FragmentAdapter;

    public ListFragment(Object fragmentAdapter) {
        FragmentAdapter = fragmentAdapter;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
    recyclerView = view.findViewById(R.id.recyclerView);
    recyclerView.setHasFixedSize(true);
        boolean b = list.addAll(MakananFragmetn.getHeroList());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    FragmentAdapter fragmentAdapter = new FragmentAdapter(MakananFragmetn.getHeroList(), getActivity());
    recyclerView.setAdapter((RecyclerView.Adapter) FragmentAdapter);
    }
}