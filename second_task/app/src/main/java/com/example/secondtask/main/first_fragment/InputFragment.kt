package com.example.secondtask.main.first_fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.secondtask.R
import com.example.secondtask.databinding.InputFragmentBinding
import com.example.secondtask.main.model.TetaMenza
import com.example.secondtask.main.view_model.CustomViewModel

class InputFragment : Fragment() {

    private val viewModel : CustomViewModel by activityViewModels()
    private var _binding : InputFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = InputFragmentBinding.inflate(inflater,container,false)
        val view = binding.root

        setListeners()

        return view
    }

    fun setListeners(){
        binding.btnSave.setOnClickListener(){
            if(binding.firstName.text.toString().equals("") || binding.lastName.text.toString().equals("") || binding.OIB.text.toString().equals("") ||
                binding.age.text.toString().equals("") || binding.workplace.text.toString().equals("")){

                Toast.makeText(getContext(),"Please fill all the fields before saving",Toast.LENGTH_LONG).show();
            }
            else{
                viewModel.addTeta(TetaMenza(binding.firstName.text.toString(),binding.lastName.text.toString(),binding.workplace.text.toString(),
                                    binding.age.text.toString().toInt(),binding.OIB.text.toString().toInt() ))
                clearEditTextFields()
            }
        }
    }

    fun clearEditTextFields(){
        binding.firstName.text.clear()
        binding.lastName.text.clear()
        binding.OIB.text.clear()
        binding.workplace.text.clear()
        binding.age.text.clear()
    }
}