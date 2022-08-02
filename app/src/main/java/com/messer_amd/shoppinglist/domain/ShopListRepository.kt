package com.messer_amd.shoppinglist.domain

// репозиторий, который делает все что нужно для всех UseCase's (добавлять, удалять и т.д.)

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}