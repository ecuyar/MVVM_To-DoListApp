package com.example.mvvm_to_dolistapp.di

import android.app.Application
import androidx.room.Room
import com.example.mvvm_to_dolistapp.data.TaskDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //short write of return value of provide Database Room.databaseBuilder(...)
    @Provides
    @Singleton
    fun provideDatabase(
        app: Application,
        callback: TaskDatabase.Callback
    ) = Room.databaseBuilder(app, TaskDatabase::class.java, "task_database")
        .fallbackToDestructiveMigration()
        .addCallback(callback)
        .build()

    //short write
    @Provides
    fun provideTaskDao(db: TaskDatabase) = db.taskDao()
}