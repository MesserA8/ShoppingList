package com.messer_amd.shoppinglist.domain

import androidx.lifecycle.LiveData

// класс, который отображает весь список покупок

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {

        return shopListRepository.getShopList()
    }
}