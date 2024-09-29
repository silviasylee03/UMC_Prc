package com.example.umc_week1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.umc_week1.databinding.FragmentPostBinding

class PostFragment: Fragment() {
    lateinit var binding: FragmentPostBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPostBinding.inflate(inflater, container, false)

        binding.happyIV.setOnClickListener {
            // FragmentTransaction을 통해 프래그먼트 전환
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, HappyFragment()) // fragment_container는 새로운 프래그먼트가 들어갈 컨테이너의 ID
                .addToBackStack(null) // 뒤로 가기 버튼을 눌렀을 때 현재 프래그먼트 상태를 백스택에 저장
                .commit()
        }

        binding.excitedIV.setOnClickListener {
            // FragmentTransaction을 통해 프래그먼트 전환
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, HappyFragment()) // fragment_container는 새로운 프래그먼트가 들어갈 컨테이너의 ID
                .addToBackStack(null) // 뒤로 가기 버튼을 눌렀을 때 현재 프래그먼트 상태를 백스택에 저장
                .commit()
        }

        binding.normalIV.setOnClickListener {
            // FragmentTransaction을 통해 프래그먼트 전환
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, HappyFragment()) // fragment_container는 새로운 프래그먼트가 들어갈 컨테이너의 ID
                .addToBackStack(null) // 뒤로 가기 버튼을 눌렀을 때 현재 프래그먼트 상태를 백스택에 저장
                .commit()
        }

        binding.nervousIV.setOnClickListener {
            // FragmentTransaction을 통해 프래그먼트 전환
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, HappyFragment()) // fragment_container는 새로운 프래그먼트가 들어갈 컨테이너의 ID
                .addToBackStack(null) // 뒤로 가기 버튼을 눌렀을 때 현재 프래그먼트 상태를 백스택에 저장
                .commit()
        }

        binding.madIV.setOnClickListener {
            // FragmentTransaction을 통해 프래그먼트 전환
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, HappyFragment()) // fragment_container는 새로운 프래그먼트가 들어갈 컨테이너의 ID
                .addToBackStack(null) // 뒤로 가기 버튼을 눌렀을 때 현재 프래그먼트 상태를 백스택에 저장
                .commit()
        }

        return binding.root
    }
}