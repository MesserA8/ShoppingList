package com.messer_amd.shoppinglist.domain

// класс для редактирования элементов списка

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {

        shopListRepository.editShopItem(shopItem)
    }
}