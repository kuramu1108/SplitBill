package com.kuramu.splitbill.Model

data class Customer(
        val id:Int,
        val clientNumber:String,
        var firstName:String? = null,
        var lastName:String? = null,
        var dateOfBirth:String? = null,
        var contactNumber:String? = null,
        var password:String? = null,
        var pin:String? = null,
        var transactionHistory:TransactionHistory? = null
) {

    fun passwordLogin(password:String):Boolean {
        return password.equals(this.password)
    }

    fun pinLogin(pin:String):Boolean {
        return pin == this.pin
    }


}