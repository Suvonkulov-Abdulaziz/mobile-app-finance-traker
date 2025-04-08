package com.example.myapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.myapp.data.model.Transaction
import com.example.myapp.data.model.CreditCard
import com.example.myapp.data.model.Converters

@Database(
    entities = [Transaction::class, CreditCard::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class FinanceDatabase : RoomDatabase() {
    abstract fun transactionDao(): TransactionDao
    abstract fun creditCardDao(): CreditCardDao
} 