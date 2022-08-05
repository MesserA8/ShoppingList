package com.messer_amd.shoppinglist.domain

import androidx.lifecycle.LiveData

// репозиторий, который делает все что нужно для всех UseCase's (добавлять, удалять и т.д.)

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
}