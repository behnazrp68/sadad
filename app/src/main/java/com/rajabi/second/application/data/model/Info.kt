package com.rajabi.second.application.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "info_table")
data class Info(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id")
    val id: Int?=null,
    @SerializedName("title")
    val title: String?=null,
    @SerializedName("bool")
    val bool: Boolean?=null
)
