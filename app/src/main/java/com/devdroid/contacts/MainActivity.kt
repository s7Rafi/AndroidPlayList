package com.devdroid.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private lateinit var recyclerView: RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        val dataList = ArrayList<MyData>()
        dataList.add(MyData(R.drawable.contct0, "Zeeshan", "9765432101"))
        dataList.add(MyData(R.drawable.contct1, "Roshan", "9807654321"))
        dataList.add(MyData(R.drawable.contct2, "RYhan", "9807754321"))
        dataList.add(MyData(R.drawable.contct3, "Afzal", "9807654320"))
        dataList.add(MyData(R.drawable.contct4, "Zoya", "9807654421"))
        dataList.add(MyData(R.drawable.contct5, "Athika", "9807654393"))
        dataList.add(MyData(R.drawable.contct6, "RUksaar", "9807674321"))
        dataList.add(MyData(R.drawable.contct0, "Zeeshan", "9765432101"))
        dataList.add(MyData(R.drawable.contct1, "Roshan", "9807654321"))
        dataList.add(MyData(R.drawable.contct2, "RYhan", "9807754321"))
        dataList.add(MyData(R.drawable.contct3, "Afzal", "9807654320"))
        dataList.add(MyData(R.drawable.contct4, "Zoya", "9807654421"))
        dataList.add(MyData(R.drawable.contct5, "Athika", "9807654393"))
        dataList.add(MyData(R.drawable.contct6, "RUksaar", "9807674321"))
        dataList.add(MyData(R.drawable.contct0, "Zeeshan", "9765432101"))
        dataList.add(MyData(R.drawable.contct1, "Roshan", "9807654321"))
        dataList.add(MyData(R.drawable.contct2, "RYhan", "9807754321"))
        dataList.add(MyData(R.drawable.contct3, "Afzal", "9807654320"))
        dataList.add(MyData(R.drawable.contct4, "Zoya", "9807654421"))
        dataList.add(MyData(R.drawable.contct5, "Athika", "9807654393"))
        dataList.add(MyData(R.drawable.contct6, "RUksaar", "9807674321"))
        dataList.add(MyData(R.drawable.contct0, "Zeeshan", "9765432101"))
        dataList.add(MyData(R.drawable.contct1, "Roshan", "9807654321"))
        dataList.add(MyData(R.drawable.contct2, "RYhan", "9807754321"))
        dataList.add(MyData(R.drawable.contct3, "Afzal", "9807654320"))
        dataList.add(MyData(R.drawable.contct4, "Zoya", "9807654421"))
        dataList.add(MyData(R.drawable.contct5, "Athika", "9807654393"))
        dataList.add(MyData(R.drawable.contct6, "RUksaar", "9807674321"))
        dataList.add(MyData(R.drawable.contct0, "Zeeshan", "9765432101"))
        dataList.add(MyData(R.drawable.contct1, "Roshan", "9807654321"))
        dataList.add(MyData(R.drawable.contct2, "RYhan", "9807754321"))
        dataList.add(MyData(R.drawable.contct3, "Afzal", "9807654320"))
        dataList.add(MyData(R.drawable.contct4, "Zoya", "9807654421"))
        dataList.add(MyData(R.drawable.contct5, "Athika", "9807654393"))
        dataList.add(MyData(R.drawable.contct6, "RUksaar", "9807674321"))
        dataList.add(MyData(R.drawable.contct0, "Zeeshan", "9765432101"))
        dataList.add(MyData(R.drawable.contct1, "Roshan", "9807654321"))
        dataList.add(MyData(R.drawable.contct2, "RYhan", "9807754321"))
        dataList.add(MyData(R.drawable.contct3, "Afzal", "9807654320"))
        dataList.add(MyData(R.drawable.contct4, "Zoya", "9807654421"))
        dataList.add(MyData(R.drawable.contct5, "Athika", "9807654393"))
        dataList.add(MyData(R.drawable.contct6, "RUksaar", "9807674321"))



        recyclerView.adapter = MyAdaptyer(dataList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}