package com.example.lab5_603021714_0

import android.app.backup.BackupAgent
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
    data class Student (val id:String, val name: String, val age: Int) : Parcelable {

}