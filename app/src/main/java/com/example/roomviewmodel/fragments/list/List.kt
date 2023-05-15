package com.example.roomviewmodel.fragments.list

import android.app.Fragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.roomviewmodel.R
import com.example.roomviewmodel.data.UserViewModel
import com.example.roomviewmodel.databinding.FragmentListBinding

class List : Fragment() {

    private lateinit var bind: FragmentListBinding
    private val arc: by navArc

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bind = FragmentListBinding.inflate(inflater, container, false)

        bind.floatingActionButton.setOnClickListener{
            findNavController().navigate(R.id.action_list_to_addfragment)
        }

        return bind.root //inflate(R.layout.fragment_list, container, false)
    }


}