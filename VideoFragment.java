package com.example.dronschool;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VideoFragment extends Fragment {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<ListItem> listItems;
    private int[] image={R.drawable.sharp_play_circle_filled_white_24};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_videos,container,false);

        recyclerView=rootView.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager=new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
       // recyclerView.setHasFixedSize(true);
        //recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));
       listItems = new ArrayList<>();


          for (int i = 0; i < 100; i++) {
         ListItem listItem = new ListItem("chapter "+(i+1),"desc "+(i+1),R.drawable.sharp_play_circle_filled_white_24);
         listItems.add(listItem);

        }



        adapter = new MyAdapter(listItems,rootView.getContext());
         recyclerView.setAdapter(adapter);
        return rootView;
    }
}
