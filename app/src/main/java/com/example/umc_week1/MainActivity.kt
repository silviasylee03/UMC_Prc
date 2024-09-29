package com.example.umc_week1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.umc_week1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        modalBottomSheet()
        initBottomNavigation() // 각 프래그먼트로 이동하는 함수 호출
    }

    // 바텀 시트
    private fun modalBottomSheet() {
        val modal = BottomSheet()
        modal.show(supportFragmentManager, BottomSheet.TAG)
    }

    // 바텀네비게이션 아이콘 선택 시 각 프래그먼트로 이동하는 함수
    private fun initBottomNavigation(){

        // 기본은 홈프래그먼트
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, HomeFragment())
            .commitAllowingStateLoss()

        binding.mainBnv.setOnItemSelectedListener{ item ->
            when (item.itemId) {

                R.id.homeFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, HomeFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.postFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, PostFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.mypageFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, MypageFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}