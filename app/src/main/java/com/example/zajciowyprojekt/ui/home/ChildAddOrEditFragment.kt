package com.example.zajciowyprojekt.ui.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zajciowyprojekt.R

class ChildAddOrEditFragment : Fragment() {

    companion object {
        fun newInstance() = ChildAddOrEditFragment()
    }

    private lateinit var viewModel: ChildAddOrEditViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_child_add_or_edit, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChildAddOrEditViewModel::class.java)
        // TODO: Use the ViewModel
    }

}