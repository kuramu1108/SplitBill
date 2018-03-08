package com.kuramu.splitbill.Activity

import com.kuramu.splitbill.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.kuramu.splitbill.Adapter.TransactionsAdapter
import com.kuramu.splitbill.Model.Transaction
import com.kuramu.splitbill.Model.TransactionHistory
import kotlinx.android.synthetic.main.activity_transactions.*

class TransactionsActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    var mAuth: FirebaseAuth? = null
    var db: FirebaseFirestore? = null
    var email:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transactions)

        mAuth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()

        email = mAuth?.currentUser?.email ?: throw Exception("Not Logged in")

//        db!!.collection("users").document("").get().addOnCompleteListener { task ->
//            if (task.isSuccessful) {
//
//            }
//
//        }
        var transactionHistory:TransactionHistory = TransactionHistory()
        var transaction1: Transaction = Transaction("111", "03.07.2018", "55.6", "nothing")
        var transaction2: Transaction = Transaction("222", "03.05.2018", "155.6", "asdf")
        var transaction3: Transaction = Transaction("333", "03.06.2018", "5.6", "dda")

        transactionHistory.addTransaction(transaction1)
        transactionHistory.addTransaction(transaction2)
        transactionHistory.addTransaction(transaction3)

        linearLayoutManager = LinearLayoutManager(this)
        recyclerView_transactions.layoutManager = linearLayoutManager
        recyclerView_transactions.adapter = TransactionsAdapter(transactionHistory)
    }
}
