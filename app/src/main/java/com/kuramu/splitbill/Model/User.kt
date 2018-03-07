package com.kuramu.splitbill.Model

data class User(
        val id:Int,
        val clientNumber:String,
        var firstName:String? = null,
        var lastName:String? = null,
        var contactNumber:String? = null,
        var pin:String? = null,
        var email:String? = null,
        var account: Account? = null
) {

    fun pinLogin(pin:String):Boolean {
        return pin == this.pin
    }


}