package com.messer_amd.shoppinglist.domain

// класс, который отображает весь список покупок

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {

        return shopListRepository.getShopList()
    }
}