package com.kuramu.splitbill.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.kuramu.splitbill.R
import kotlinx.android.synthetic.main.activity_pin.*

class PinActivity : AppCompatActivity(), TextWatcher {
    var pin:String = ""

    override fun afterTextChanged(s: Editable?) {

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        if (s!!.length == 4) {
            Toast.makeText(applicationContext, txt_pin.text.toString(), Toast.LENGTH_LONG).show()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin)

//        setPinListeners()
//        txt_pin1.requestFocus()
        txt_pin.addTextChangedListener(this)
    }
    
//    private fun setPinListeners() {
//        txt_pin1.addTextChangedListener(this)
//        txt_pin2.addTextChangedListener(this)
//        txt_pin3.addTextChangedListener(this)
//        txt_pin4.addTextChangedListener(this)
//    }
//
}
