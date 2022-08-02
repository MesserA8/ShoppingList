package com.messer_amd.shoppinglist.domain

//класс для удаления элемента из списка

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem) {

        shopListRepository.deleteShopItem(shopItem)

    }
}