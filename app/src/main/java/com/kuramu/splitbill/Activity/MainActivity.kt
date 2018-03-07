package com.kuramu.splitbill.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.kuramu.splitbill.Model.Customer
import com.kuramu.splitbill.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var user: Customer? = null
    var mAuth:FirebaseAuth? = null
    var mUser:FirebaseUser? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAuth = FirebaseAuth.getInstance()

        //user = Customer(id = 1, clientNumber = "PT445")

        btn_login.setOnClickListener {
            mAuth!!.signInWithEmailAndPassword(txt_email.text.toString(), txt_password.text.toString())
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(applicationContext, "Signed in", Toast.LENGTH_LONG).show()
                            mUser = mAuth!!.currentUser
                            updateUI(mUser!!)
                        } else {
                            Toast.makeText(applicationContext, "Logged in failed", Toast.LENGTH_LONG).show()
                        }

                    }

            //Toast.makeText(applicationContext, "Submitted", Toast.LENGTH_LONG).show()
        }
    }

    fun updateUI(mUser:FirebaseUser) {
        var intent = Intent(applicationContext, PinActivity::class.java)
        startActivity(intent)
    }

}
