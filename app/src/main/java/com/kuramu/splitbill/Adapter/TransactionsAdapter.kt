package com.kuramu.splitbill.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kuramu.splitbill.*
import com.kuramu.splitbill.Model.Transaction
import com.kuramu.splitbill.Model.TransactionHistory
import kotlinx.android.synthetic.main.recyclerview_transaction.view.*

class TransactionsAdapter (private val transactionHistory: TransactionHistory) : RecyclerView.Adapter<TransactionsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_transaction, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun getItemCount(): Int = transactionHistory.transactions.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val transactionItem = transactionHistory.getTransaction(position)
        holder.bind(transactionItem)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(transaction: Transaction) {
            itemView.txt_amount.text = transaction.amount
            itemView.txt_date.text = transaction.date
            itemView.txt_description.text = transaction.description
        }
    }
}