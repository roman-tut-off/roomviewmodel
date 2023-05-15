package com.example.roomviewmodel.repository

import androidx.lifecycle.LiveData
import com.example.roomviewmodel.data.User
import com.example.roomviewmodel.data.Userdao

class UserRepository(private val userDao: Userdao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.adduser(user)
    }

}