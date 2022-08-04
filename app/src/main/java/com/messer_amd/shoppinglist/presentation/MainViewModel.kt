package com.messer_amd.shoppinglist.presentation

import androidx.lifecycle.ViewModel
import com.messer_amd.shoppinglist.data.ShopListRepositoryImpl
import com.messer_amd.shoppinglist.domain.DeleteShopItemUseCase
import com.messer_amd.shoppinglist.domain.EditShopItemUseCase
import com.messer_amd.shoppinglist.domain.GetShopItemUseCase

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopItemUseCase = GetShopItemUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)
}