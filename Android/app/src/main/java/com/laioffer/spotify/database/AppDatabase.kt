package com.laioffer.spotify.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.laioffer.spotify.datamodel.Album

@Database(entities = [Album::class], version = 1)
//Album::class] 加入新的表格，对应albuma文件中的列表，在Album 中，再把表格栏目的内容加进去
// 三个annotation, Entry, Database   Dao


abstract class AppDatabase: RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao
}
