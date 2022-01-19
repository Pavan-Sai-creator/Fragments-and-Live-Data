package com.example.mvvmpractice2.Score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.mvvmpractice2.R
import com.example.mvvmpractice2.databinding.FragmentScoreBinding

class ScoreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentScoreBinding>(inflater,R.layout.fragment_score,container,false)
        val scoreFragmentArgs by navArgs<ScoreFragmentArgs>()
        binding.textView2.text = scoreFragmentArgs.score.toString()
        /* You have set the final score from navArgs. But, pass the data to viewModel's constructor using
        ViewModelFactory and get the final score from scoreViewModel
        */


        return binding.root
    }


}