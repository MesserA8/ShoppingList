package com.messer_amd.shoppinglist.presentation

import androidx.lifecycle.ViewModel
import com.messer_amd.shoppinglist.data.ShopListRepositoryImpl
import com.messer_amd.shoppinglist.domain.AddShopItemUseCase
import com.messer_amd.shoppinglist.domain.EditShopItemUseCase
import com.messer_amd.shoppinglist.domain.GetShopItemUseCase
import com.messer_amd.shoppinglist.domain.ShopItem

class ShopItemViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopItemUseCase = GetShopItemUseCase(repository)
    private val addShopItemUseCase = AddShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    fun getShopItem(shopItemId: Int) {
        val item = getShopItemUseCase.getShopItem(shopItemId)
    }

    fun addShopItem(shopItem: ShopItem) {
        addShopItemUseCase.addShopItem(shopItem)
    }

    fun editShopItem(shopItem: ShopItem) {
        editShopItemUseCase.editShopItem(shopItem)
    }
}