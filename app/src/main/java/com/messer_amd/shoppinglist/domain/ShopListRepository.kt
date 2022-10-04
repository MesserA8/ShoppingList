package com.messer_amd.shoppinglist.domain

import androidx.lifecycle.LiveData

// репозиторий, который делает все что нужно для всех UseCase's (добавлять, удалять и т.д.)

interface ShopListRepository {

    suspend fun addShopItem(shopItem: ShopItem)

    suspend fun deleteShopItem(shopItem: ShopItem)

    suspend fun editShopItem(shopItem: ShopItem)

    suspend fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
}