package com.emmanuelmuturia.summer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class SummerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_summer, container, false)
        val encryptButton = view.findViewById<Button>(R.id.summer)

        encryptButton.setOnClickListener {
            //getSum()
            val num1 = view?.findViewById<EditText>(R.id.num1_input)
            val num2 = view?.findViewById<EditText>(R.id.num2_input)
            val firstNumber = Integer.parseInt( num1?.text.toString() )
            val secondNUmber = Integer.parseInt( num2?.text.toString() )
            val action = SummerFragmentDirections.actionSummerFragmentToEncryptorFragment(firstNumber, secondNUmber)
            view.findNavController().navigate(action)
        }
        return view
    }
}