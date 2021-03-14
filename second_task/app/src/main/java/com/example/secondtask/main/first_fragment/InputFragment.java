package com.example.secondtask.main.first_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.secondtask.R;
import com.example.secondtask.main.model.TetaMenza;
import com.example.secondtask.main.view_model.CustomViewModel;

public class InputFragment extends Fragment {

    private EditText first_name, last_name, age, OIB, workplace;
    private Button btn_save;
    private CustomViewModel viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = new ViewModelProvider(this.requireActivity()).get(CustomViewModel.class);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.input_fragment, container, false);

        first_name = rootView.findViewById(R.id.first_name);
        last_name = rootView.findViewById(R.id.last_name);
        age = rootView.findViewById(R.id.age);
        OIB = rootView.findViewById(R.id.OIB);
        workplace = rootView.findViewById(R.id.workplace);
        btn_save = rootView.findViewById(R.id.btn_save);

        setListeners();

        return rootView;
    }

    private void setListeners(){
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_name.getText().toString().equals("") || last_name.getText().toString().equals("") || age.getText().toString().equals("") ||
                        OIB.getText().toString().equals("") || workplace.getText().toString().equals("")){
                    Toast.makeText(getContext(),"Please fill all the fields before saving",Toast.LENGTH_LONG).show();
                    return;
                }
                viewModel.updateTete(new TetaMenza(first_name.getText().toString(),last_name.getText().toString(),
                                    workplace.getText().toString(),
                                    Integer.parseInt(age.getText().toString()),
                                    Integer.parseInt(OIB.getText().toString())));
                clearEditTextFields();
            }
        });
    }

    private void clearEditTextFields(){
        first_name.setText("");
        last_name.setText("");
        age.setText("");
        OIB.setText("");
        workplace.setText("");
    }
}
