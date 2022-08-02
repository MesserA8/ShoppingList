package com.messer_amd.shoppinglist.domain

// класс для получения объекта по его id

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {

        return shopListRepository.getShopItem(shopItemId)
    }
}