package com.bogo.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bogo.recyclerview.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityDetailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var name =intent.getStringExtra("name")
        var longdetails =intent.getStringExtra("longdetails")
        var image =intent.getIntExtra("image",R.drawable.rose)
        binding.flowername.text=name.toString()
        binding.flowerlongdetails.text=longdetails.toString()
        binding.flowerimage.setImageResource(image)
    }
}