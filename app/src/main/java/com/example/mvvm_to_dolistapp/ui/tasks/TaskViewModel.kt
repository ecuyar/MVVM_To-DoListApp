package com.example.mvvm_to_dolistapp.ui.tasks

import androidx.lifecycle.ViewModel
import com.example.mvvm_to_dolistapp.data.TaskDao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(
    private val taskDao: TaskDao
) : ViewModel() {
}