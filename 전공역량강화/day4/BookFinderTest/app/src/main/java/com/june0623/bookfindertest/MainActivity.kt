package com.june0623.bookfindertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.json.JSONException
import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.nio.charset.StandardCharsets

class MainActivity : AppCompatActivity() {

    val ENDPoint:String = "dapi.kakao.com/v3/search/book?query=%s&page%d"
    val API_KEY:String = "2c8d8c69edc1fd60f06d3515a0b0b79f"
    var page = 1
    val books:ArrayList<Book> = ArrayList()
    var adapter:BookAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val task = BookThreadTask()
        task.execute("눈")
//        search("눈")

        adapter = BookAdapter(this)
    }

    private fun search(query:String?): String{
        var str:String
        var result = ""
        val strURL = String.format(ENDPoint, query, page)

//        println(strURL)
        //Log.d("testcase", strURL.toString())

        try {


            val url = URL(strURL)
            val conn = url.openConnection() as HttpURLConnection
            conn.requestMethod = "GET"
            conn.setRequestProperty("Authorization", "KakaoAK ${API_KEY}")
            conn.connect()

            if (conn.responseCode == HttpURLConnection.HTTP_OK) {
                val tmp = InputStreamReader(conn.inputStream, StandardCharsets.UTF_8)
                var reader = BufferedReader(tmp)
                var buffer = StringBuffer()

                while (reader.readLine().also { str = it } != null) {
                    buffer.append(str)
                }
                result = buffer.toString()
            }
        } catch (e:IOException){
            println("예외발생")
            println(e.message)
            e.printStackTrace()
        }
        return result
    }

    fun parsing(json:String?){
        try{
            this.adapter?.clear()
            val root = JSONObject(json)
            val meta = root.getJSONObject("meta")
            val books = root.getJSONArray("documents")
            for(i in 0 until books.length()){
                val book = books.getJSONObject(i)
                val title = book.getString("title")
                val publisher = book.getString("publisher")
                val authors = book.getJSONArray("authors").join(",")
                val thumbnail = book.getString("thumbnail")
                val price = book.getInt("price")
                val url = book.getString("url")

                val item = Book(title, publisher, authors, thumbnail, price, url)
                this.adapter?.add(item)
            }
//            adapter?.
        } catch (e:JSONException){
            e.printStackTrace()
        }
        Log.d("BookFinder", "${this.books.size}")
    }

    inner class BookThreadTask:ThreadTask<String?, String?>(){
        override fun onPreExecute() { }

        override fun doInBackground(arg: String?): String {
            val str = search(arg)
            println(str)
            return str
        }

        override fun onPostExecute(result: String?) {
            parsing(result)
        }

    }

}