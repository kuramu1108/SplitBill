package com.kuramu.splitbill.Model

data class Account(
        var id:Int,
        var bsb:String,
        var accountNumber:String,
        var transactionHistory:TransactionHistory? = null
) {

}