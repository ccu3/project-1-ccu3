package com.example.thousandaire1

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Correct_answer : Fragment() {
    lateinit var binding:MainActivity
    companion object {
        fun newInstance() = Correct_answer()
    }

    private lateinit var viewModel: CorrectAnswerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.correct_answer_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CorrectAnswerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
