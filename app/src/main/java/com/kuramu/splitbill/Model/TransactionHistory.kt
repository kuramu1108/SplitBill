package com.kuramu.splitbill.Model

class TransactionHistory() {
    var transactions:MutableList<Transaction> = mutableListOf<Transaction>()

    fun getTransaction(position:Int):Transaction = transactions[position]

    fun addTransaction(transaction:Transaction) {
        transactions.add(transaction)
    }

    fun isEmpty():Boolean {
        return transactions.size == 0
    }
}