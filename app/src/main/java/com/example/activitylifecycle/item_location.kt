package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.activitylifecycle.adapters.LocationAdapter
import com.example.activitylifecycle.data.createRealJejuLocationData

class item_location : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recylce_exam)


        val recyclerView: RecyclerView = findViewById(R.id.RecyclerView2)

        //layout manager 설정
        recyclerView.layoutManager = LinearLayoutManager(this)

        //adapter를 설정
        val locationAdapter = LocationAdapter(sampleLocations)
        recyclerView.adapter = locationAdapter

    }
}
//예제 데이터 사용
val sampleLocations = createRealJejuLocationData()