package com.kuramu.splitbill.Model

data class Transaction(
        var id:String,
        var date:String,
        var amount:String,
        var description:String? = null
) {


}