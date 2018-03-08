package com.kuramu.splitbill.Model

import java.util.*

data class Transaction(
        var id:String = "",
        var date:Date = Date(),
        var amount:Long = 0,
        var description:String? = null
) {


}