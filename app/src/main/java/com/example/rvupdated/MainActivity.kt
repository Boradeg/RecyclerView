package com.example.rvupdated

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rvupdated.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //var listcat= arrayListOf<Modal>()
    private lateinit var arrayList: ArrayList<Modal>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        arrayList= ArrayList()
        arrayList.add(Modal("gokul","459894849943",))
        arrayList.add(Modal("rama","59585859443"))
        arrayList.add(Modal("harsh","202939332"))
        arrayList.add(Modal("jeevan","44048449432"))
        arrayList.add(Modal("shrikant","969589495954"))
        arrayList.add(Modal("gokul","459894849943"))
        arrayList.add(Modal("rama","59585859443"))
        arrayList.add(Modal("harsh","202939332"))
        arrayList.add(Modal("jeevan","44048449432"))
        arrayList.add(Modal("shrikant","969589495954"))

        binding.rv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
var rcvAdapter=rcvAdapter(this,arrayList)
        binding.rv.adapter=rcvAdapter(this,arrayList)


    }
}