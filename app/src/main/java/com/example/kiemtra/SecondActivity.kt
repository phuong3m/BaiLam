package com.example.kiemtra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.dong_monan.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var arraymonan : ArrayList<MonAn> = ArrayList()
        arraymonan.add(MonAn("Bánh mỳ chả", R.drawable.bmcha))
        arraymonan.add(MonAn("Bánh mỳ ốp la", R.drawable.bmopla))
        arraymonan.add(MonAn("Bánh mỳ thịt nướng", R.drawable.bmthit))
        listview.adapter = Adapter(this,arraymonan)
    }
}
