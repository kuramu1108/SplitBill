package com.kuramu.splitbill.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.kuramu.splitbill.R
import kotlinx.android.synthetic.main.activity_pin.*

class PinActivity : AppCompatActivity(), TextWatcher {
    var db:FirebaseFirestore? = null
    var mAuth:FirebaseAuth? = null
    var email:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin)

        db = FirebaseFirestore.getInstance()
        mAuth = FirebaseAuth.getInstance()
//        setPinListeners()
//        txt_pin1.requestFocus()
        txt_pin.addTextChangedListener(this)
    }

    override fun onStart() {
        super.onStart()
        email = mAuth?.currentUser?.email ?: throw Exception("Not Logged in")
    }

//    private fun setPinListeners() {
//        txt_pin1.addTextChangedListener(this)
//        txt_pin2.addTextChangedListener(this)
//        txt_pin3.addTextChangedListener(this)
//        txt_pin4.addTextChangedListener(this)
//    }


    override fun afterTextChanged(s: Editable?) {
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        if (s!!.length == 4) {
            txt_pin.clearFocus()
            pinLogin(txt_pin.text.toString())
        }
    }

    private fun pinLogin(inputPin:String): Boolean {
        db!!.collection("users")
                .whereEqualTo("email", email)
                .get()
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
//                        if (inputPin.equals(task.result.documents.get(0).data.get("email")))
                        Toast.makeText(applicationContext, task.result.documents[0].get("email").toString(), Toast.LENGTH_LONG).show()
                    }
                }
        return true
    }
}
