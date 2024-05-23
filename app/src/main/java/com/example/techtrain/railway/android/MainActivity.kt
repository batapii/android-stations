package com.example.techtrain.railway.android

import BookAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // DividerItemDecorationを追加
        val dividerItemDecoration = DividerItemDecoration(recyclerView.context, LinearLayoutManager.VERTICAL)
        recyclerView.addItemDecoration(dividerItemDecoration)

        val books = listOf(
            Book("Kotlin", "テストテストテストテストテストテストテストテストテスト"),
            Book("テストテストテスト", "テストテストテストテストテストテストテストテストテスト"),
            // 他の本のデータを追加
        )

        val adapter = BookAdapter(books)
        recyclerView.adapter = adapter
    }
}
