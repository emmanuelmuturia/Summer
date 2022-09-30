package com.emmanuelmuturia.summer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import java.math.BigInteger
import java.security.MessageDigest

class EncryptorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_encryptor, container, false)
        val num1 = EncryptorFragmentArgs.fromBundle(requireArguments()).num1.toInt()
        val num2 = EncryptorFragmentArgs.fromBundle(requireArguments()).num2.toInt()
        val finalSum = view.findViewById<TextView>(R.id.sumResult)
        val finalEncrypt = view.findViewById<TextView>(R.id.encryptResult)
        finalSum.text = ((num1 + num2).toString())
        finalEncrypt.text = md5Hash(num1.toString())
        return view
    }

    //We write the Kotlin implementation of the MD5 Algorithm for encryption...
    private fun md5Hash(str: String): String {
        val md = MessageDigest.getInstance("MD5")
        val bigInt = BigInteger(1, md.digest(str.toByteArray(Charsets.UTF_8)))
        return String.format("%032x", bigInt)
    }
}