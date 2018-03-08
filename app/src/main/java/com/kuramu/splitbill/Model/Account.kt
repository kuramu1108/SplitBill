package com.kuramu.splitbill.Model

data class Account(
        var id:String,
        var bsb:String,
        var accountNumber:String,
        var name:String,
        var transactionHistory:TransactionHistory
) {

}