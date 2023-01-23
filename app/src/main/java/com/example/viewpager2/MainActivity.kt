package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = listOf(
            R.drawable.figure1,
            R.drawable.figure2,
            R.drawable.figure3,
            R.drawable.figure4
        )

        val adapter = ViewPagerAdapter(images)
        binding.viewPager.adapter = adapter
        // Para scroll na vertical:
        // binding.viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        // Simula um drag sem vc fazer:
//        binding.viewPager.apply {
//            beginFakeDrag()
//            fakeDragBy(-10f)
//            endFakeDrag()
//        }
    }
}
