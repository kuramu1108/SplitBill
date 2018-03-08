package com.kuramu.splitbill.Model

data class User(
        val id:String,
        var firstName:String,
        var lastName:String,
        var contactNumber:String? = null,
        var email:String,
        var account: Account? = null
) {

}