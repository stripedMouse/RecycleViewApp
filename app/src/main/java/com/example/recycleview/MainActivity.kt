package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = DatchikAdapter()
    private val imageIdList = listOf(
        R.drawable.bi,
        R.drawable.or,
        R.drawable.ipd,
        R.drawable.ipr,
        R.drawable.ipt,
    )
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        init()
    }

    private fun init(){
        binding.apply {

        rcView.layoutManager = GridLayoutManager(this@MainActivity, 3)
        rcView.adapter = adapter
        bAdd.setOnClickListener {
            if(counter > 4) counter = 0
            val datchik = Datchik(imageIdList[counter], "Datchik $counter")
            adapter.addDatchik(datchik)
            counter++
        }

        }
    }
}