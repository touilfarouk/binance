package com.farouk.binance.data.local
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevKey: Int?,
    val nextKey: Int?,
    val query: String
)
