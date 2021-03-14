package com.example.secondtask.main.second_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.secondtask.R;
import com.example.secondtask.main.model.TetaMenza;
import com.example.secondtask.main.view_model.CustomViewModel;

import java.util.List;

public class ShowFragment extends Fragment {

    private ListView listView;
    private CustomViewModel viewModel;
    private ArrayAdapter<TetaMenza> adapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this.requireActivity()).get(CustomViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.show_fragment,container,false);

        listView = rootView.findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        viewModel.getTete().observe(this.getActivity(), new Observer<List<TetaMenza>>() {
            @Override
            public void onChanged(List<TetaMenza> strings) {
                adapter.addAll(strings);
                adapter.notifyDataSetChanged();

            }
        });

        return rootView;
    }
}
