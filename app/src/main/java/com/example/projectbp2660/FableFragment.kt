package com.example.projectbp2660

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FableFragment : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fable, container, false)

        val rvBuku: RecyclerView = view.findViewById(R.id.recyclerViewBuku)
        rvBuku.layoutManager = LinearLayoutManager(context)

        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book5, "Emi's fhdhjafjhgrj", "dhgfhdsafhdbhfvsanbvvhvdhvhvffa"))
        data.add(BukuModel(R.drawable.book6, "Ryan's dhjgffdgffg", "dgjgjsadgfkdshfhgsfgyuwetaeutyfry"))

        val adapter = AdapterHome(data)
        rvBuku.adapter = adapter

        return view
    }
}
