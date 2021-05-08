package com.teekay.listviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.teekay.listviewapp.databinding.ActivityListViewBinding

class ListView : AppCompatActivity() {
    var binding:ActivityListViewBinding? = null
    var adapter:FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact(){
        adapter = FactAdapter(this, DummyData.funFacts)
        binding?.factListView?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    override fun onBackPressed() {
         finishAffinity()
        finish()
    }
}