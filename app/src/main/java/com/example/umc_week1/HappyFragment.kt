package com.example.umc_week1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.umc_week1.databinding.FragmentHappyBinding
import com.example.umc_week1.databinding.FragmentPostBinding

class HappyFragment: Fragment() {
    lateinit var binding: FragmentHappyBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHappyBinding.inflate(inflater, container, false)

        return binding.root
    }
}