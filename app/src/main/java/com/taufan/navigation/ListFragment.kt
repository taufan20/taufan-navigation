package com.taufan.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val buttonToDetail = view.findViewById<AppCompatButton>(R.id.btn_to_detail)

        buttonToDetail.setOnClickListener {
            findNavController()
                .navigate(R.id.action_listFragment_to_detailFragment)
        }

        return view

    }
}