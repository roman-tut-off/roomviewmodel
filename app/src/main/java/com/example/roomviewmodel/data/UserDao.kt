package com.example.roomviewmodel.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface Userdao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun adduser(user: User)


    @Query("SELECT* FROM USER_TABLE ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>

}