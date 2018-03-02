package com.kuramu.splitbill

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kuramu.splitbill.Model.Customer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var user: Customer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user = Customer(id = 1, clientNumber = "PT445")

        btn_submit.setOnClickListener { Toast.makeText(applicationContext, "Submitted", Toast.LENGTH_LONG).show() }
    }


}
