package com.messer_amd.shoppinglist.domain

// класс для редактирования элементов списка

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun editShopItem(shopItem: ShopItem) {

        shopListRepository.editShopItem(shopItem)
    }
}