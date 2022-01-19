package com.example.mvvmpractice2.game

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel:ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    fun onIncreaseScore() {
        _score.value = (score.value)?.plus(1)
    }

    init {
        _score.value=0
    }
}