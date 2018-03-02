package com.kuramu.splitbill.Model

class TransactionHistory() {
    var transactions:MutableList<Transaction> = mutableListOf<Transaction>()

    fun getTransaction(id:Int):Transaction? {
        var found:Transaction? = null
        for (transaction in transactions) {
            if (transaction.id == id)
                found = transaction
        }
        return found
    }

    fun addTransaction(transaction:Transaction) {
        transactions.add(transaction)
    }

    fun isEmpty():Boolean {
        return transactions.size == 0
    }
}