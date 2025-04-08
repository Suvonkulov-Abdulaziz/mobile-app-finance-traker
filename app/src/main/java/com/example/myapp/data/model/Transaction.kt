package com.example.myapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val amount: Double,
    val type: TransactionType,
    val category: TransactionCategory,
    val description: String,
    val date: Date,
    val cardId: Long? = null
)

enum class TransactionType {
    INCOME, EXPENSE
}

enum class TransactionCategory {
    FOOD, GROCERIES, MEDICINE, TRANSPORTATION, ENTERTAINMENT, UTILITIES, 
    SHOPPING, EDUCATION, HEALTH, OTHER
} 