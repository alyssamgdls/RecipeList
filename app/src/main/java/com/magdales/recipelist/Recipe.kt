package com.magdales.recipelist

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Lai on 12/8/2017.
 */
data class Recipe(
        val name: String = " ",
        val description: String = " ",
        val image: Int = 0,
        val ingredients: String = " ",
        val procedures: String = " "
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readString())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeInt(image)
        parcel.writeString(ingredients)
        parcel.writeString(procedures)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Recipe> {
        override fun createFromParcel(parcel: Parcel): Recipe {
            return Recipe(parcel)
        }

        override fun newArray(size: Int): Array<Recipe?> {
            return arrayOfNulls(size)
        }
    }
}

