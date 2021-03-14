package com.sdwtech.sadewacoffee.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    var name: String,
    var price: String,
    var description: String,
    var photo: String
):Parcelable