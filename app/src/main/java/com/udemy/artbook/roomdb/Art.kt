package com.udemy.artbook.roomdb

import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity(tableName = "arts")
data class Art(
    var name: String,
    var artistName: String,
    var year: Int,
    var imageUrl: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
) {
}