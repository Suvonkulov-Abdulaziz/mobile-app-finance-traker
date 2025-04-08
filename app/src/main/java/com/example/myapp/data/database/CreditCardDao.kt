package com.example.myapp.data.database

import androidx.room.*
import com.example.myapp.data.model.CreditCard
import kotlinx.coroutines.flow.Flow

@Dao
interface CreditCardDao {
    @Query("SELECT * FROM credit_cards")
    fun getAllCreditCards(): Flow<List<CreditCard>>

    @Insert
    suspend fun insertCreditCard(creditCard: CreditCard)

    @Delete
    suspend fun deleteCreditCard(creditCard: CreditCard)

    @Update
    suspend fun updateCreditCard(creditCard: CreditCard)

    @Query("SELECT * FROM credit_cards WHERE id = :cardId")
    suspend fun getCreditCardById(cardId: Long): CreditCard?
} 