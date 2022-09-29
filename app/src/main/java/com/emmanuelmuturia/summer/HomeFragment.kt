package com.emmanuelmuturia.summer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val startButton = view.findViewById<ImageButton>(R.id.start_button)

        startButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_summerFragment)
        }
      return view
    }
}