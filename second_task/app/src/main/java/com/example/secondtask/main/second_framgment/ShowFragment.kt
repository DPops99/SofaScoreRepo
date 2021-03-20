package com.example.secondtask.main.second_framgment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.secondtask.databinding.InputFragmentBinding
import com.example.secondtask.databinding.ShowFragmentBinding
import com.example.secondtask.main.model.TetaMenza
import com.example.secondtask.main.view_model.CustomViewModel

class ShowFragment : Fragment() {

    private val viewModel : CustomViewModel by activityViewModels()
    private var _binding : ShowFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter : ArrayAdapter<TetaMenza>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ShowFragmentBinding.inflate(inflater,container,false)
        val view = binding.root
        adapter= ArrayAdapter(context!!, android.R.layout.simple_list_item_1)
        binding.listView.adapter = adapter
        viewModel.tete.observe(viewLifecycleOwner, Observer {
            adapter.addAll(it)
            adapter.notifyDataSetChanged()
        })
        return view
    }
}