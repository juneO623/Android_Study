package com.june0623.arrayadaptertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val names:Array<String> = arrayOf("사나", "나연", "쯔위", "미나",
        "지효", "채영", "다현", "정연", "모모")
    val images = intArrayOf(R.drawable.twice1,R.drawable.twice2,
        R.drawable.twice3,R.drawable.twice4,
        R.drawable.twice5,R.drawable.twice6,
        R.drawable.twice7,R.drawable.twice8,R.drawable.twice9)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView:ListView = findViewById(R.id.listView)

        val adapter:ArrayAdapter<String> = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, names)

        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->    // parent, view, position, id
//            val toast = Toast.makeText(this, names[i],
//                Toast.LENGTH_SHORT)
//            toast.show()

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("image", images[i])
            intent.putExtra("name", names[i])
            startActivity(intent)
        }



    }
}