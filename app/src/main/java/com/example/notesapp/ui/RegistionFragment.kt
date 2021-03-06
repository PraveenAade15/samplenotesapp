package com.example.notesapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.notesapp.R
import com.example.notesapp.databinding.FragmentRegistionBinding
import com.example.notesapp.models.UserRequest
import com.example.notesapp.viewmodel.AuthUserViewMode
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegistionFragment : Fragment() {
    private var _binding: FragmentRegistionBinding? = null
    private val binding get() = _binding!!
    private val authUserViewModel by viewModels<AuthUserViewMode>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRegistionBinding.inflate(layoutInflater, container, false)
//        return inflater.inflate(R.layout.fragment_registion, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSignUp.setOnClickListener {
            //       findNavController().navigate(R.id.action_registionFragment_to_mainFragment)
            authUserViewModel.registerUser(
                UserRequest(
                    "praveenaade15@gmail.com",
                    "12345",
                    "praveen15"
                )
            )


        }
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_registionFragment_to_loginFragment)

        }


    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}