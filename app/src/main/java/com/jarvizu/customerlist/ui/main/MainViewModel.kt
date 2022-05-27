package com.jarvizu.customerlist.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.github.serpro69.kfaker.Faker
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    // List holding customers
    val customerList: MutableList<Customer> = mutableListOf()

    // Mock Data generator
    private val faker: Faker = Faker()

    init {
        viewModelScope.launch {
            loadUsers().collect {
                Log.d(this.javaClass.simpleName, "Collected:$it")
                customerList.add(it)
            }
        }
    }

    /**
     * Loads the users with mock data in a suspendable coroutine and emits the customers to an
     * asynchronous flow
     * @return
     */
    private suspend fun loadUsers(): Flow<Customer> = flow {
        for (i in 1..500) {
            emit(
                Customer(
                    faker.name.firstName(),
                    faker.name.lastName(),
                    faker.phoneNumber.cellPhone(),
                    faker.address.streetAddress(),
                    faker.address.city(),
                    faker.address.state()
                )
            )
        }
    }

}