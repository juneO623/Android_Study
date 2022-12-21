package com.june0623.customadaptertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
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
    val nations: Array<String> = arrayOf("jp", "kr", "tw", "jp",
        "kr", "kr", "kr", "kr", "jp")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var members: ArrayList<Twice> = ArrayList()

        for (i in names.indices){
            val flagId = when (nations[i]){
                "jp" -> R.drawable.jp
                "kr" -> R.drawable.kr
                "tw" -> R.drawable.tw
                else -> R.drawable.kr
            }


            val member = Twice(images[i], names[i], nicks[i], flagId)
            members.add(member)
        }

        val listView:ListView = findViewById(R.id.list_view)

        val adapter = TwiceAdapter(this, members)
        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
////            val profileImg = images[i]
//            val name = names[i]
//            val nick = nicks[i]
////            val flagImg = nations[i]
//
//            Toast.makeText(this, "이름은 $name 이고 별명은 $nick 입니다", Toast.LENGTH_SHORT).show()

            val member = members[i]
            val intent = Intent(this, DetailActivity::class.java)

            intent.putExtra("image", member.imageId)
            intent.putExtra("name", member.name)
            intent.putExtra("nick", member.nick)
            intent.putExtra("member", member)
            startActivity(intent)
        }

    }
}