package com.melendez.basketapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.melendez.basketapp.databinding.FragmentTeamBBinding

class TeamBFragment : Fragment() {

    var scoreValue = 0

    private lateinit var binding: FragmentTeamBBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil
            .inflate(inflater,R.layout.fragment_team_b, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.oneButton.setOnClickListener {
            scoreValue++
            viewModel.updateScores(binding.scoreTeam, scoreValue)
        }

        binding.twoButton.setOnClickListener {
            scoreValue += 2
            viewModel.updateScores(binding.scoreTeam,scoreValue)
        }

        binding.threeButton.setOnClickListener {
            scoreValue += 3
            viewModel.updateScores(binding.scoreTeam,scoreValue)
        }
    }
}