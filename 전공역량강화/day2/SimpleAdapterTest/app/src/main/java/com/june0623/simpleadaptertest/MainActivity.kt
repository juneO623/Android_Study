package com.june0623.simpleadaptertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    val names:Array<String> = arrayOf("사나", "나연", "쯔위", "미나",
        "지효", "채영", "다현", "정연", "모모")
    val nicks:Array<String> = arrayOf("샤", "임나연", "주희", "미나리",
        "퀸", "챙", "독다", "또겸", "모구리")
    val images = intArrayOf(R.drawable.twice1,R.drawable.twice2,
        R.drawable.twice3,R.drawable.twice4,
        R.drawable.twice5,R.drawable.twice6,
        R.drawable.twice7,R.drawable.twice8,R.drawable.twice9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list:ArrayList<HashMap<String, String>> = ArrayList()
        for (i in 0..names.size-1){
            val map:HashMap<String, String> = HashMap()
            map.put("name", names[i])
            map.put("nick", nicks[i])
            list.add(map)
        }

        val listView:ListView = findViewById(R.id.listView)
        val datas:Array<String> = arrayOf("name", "nick")
        val ids = intArrayOf(android.R.id.text1, android.R.id.text2)    // text1 -> name, text2 -> nick         순서에 따라 매칭됨
        val adapter = SimpleAdapter(this, list, android.R.layout.simple_list_item_2, datas, ids)

        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            val name = names[i]
            val nick = nicks[i]

            Toast.makeText(this, "이름은 ${name}이고 별명은 ${nick}이다", Toast.LENGTH_SHORT).show()
        }


    }
}