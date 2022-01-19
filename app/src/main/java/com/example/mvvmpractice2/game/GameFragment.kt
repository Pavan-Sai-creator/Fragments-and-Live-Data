package com.example.mvvmpractice2.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.mvvmpractice2.R
import com.example.mvvmpractice2.databinding.FragmentGameBinding


class GameFragment : Fragment() {

    private lateinit var viewModel:GameViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(inflater,R.layout.fragment_game,container,false)
        viewModel = ViewModelProviders.of(this).get(GameViewModel::class.java)
        binding.gameViewModel = viewModel
        binding.lifecycleOwner = this

        binding.submitBtn.setOnClickListener {
            findNavController().navigate(GameFragmentDirections.actionGameFragmentToScoreFragment(viewModel.score.value?:0))
        }

        return binding.root
    }

}