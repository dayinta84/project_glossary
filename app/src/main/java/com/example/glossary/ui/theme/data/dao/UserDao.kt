package com.example.glossary.ui.theme.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.glossary.ui.theme.data.entity.User

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM users WHERE username = :username AND password = :password")
    suspend fun getUser(username: String, password: String): User?
}

