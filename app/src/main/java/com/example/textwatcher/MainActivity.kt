package com.example.edittexttextwatcher

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.textwatcher.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TextWatcher {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edName.addTextChangedListener(this)
    }

    override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

    }

    override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
        Toast.makeText(this@MainActivity, "Text: $charSequence", Toast.LENGTH_SHORT).show()
    }

    override fun afterTextChanged(editable: Editable) {

    }
}