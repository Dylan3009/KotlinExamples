package com.melendez.basketapp

import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val scoreTeamA = MutableLiveData("0")
    val scoreTeamB = MutableLiveData("0")
    val wdl = MutableLiveData("")
    var winnerTeamA = MutableLiveData("")
    var winnerTeamB = MutableLiveData("")

    fun updateScores(view: TextView, score: Int){
        view.text = score.toString()
    }
}