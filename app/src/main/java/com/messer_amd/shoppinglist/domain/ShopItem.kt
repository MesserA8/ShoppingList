package com.messer_amd.shoppinglist.domain

data class ShopItem(

    val name: String,
    val count: Int,
    val enabled: Boolean,
    var id: Int = -1
)
