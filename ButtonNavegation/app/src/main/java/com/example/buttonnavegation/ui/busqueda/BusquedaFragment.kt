package com.example.buttonnavegation.ui.busqueda

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.arch.lifecycle.ViewModelProvider
import android.support.v4.app.Fragment
import com.example.buttonnavegation.databinding.FragmentBusquedaBinding


class BusquedaFragment : Fragment(){

    private var _binding: FragmentBusquedaBinding? = null //Aqui

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val busquedaViewModel = //Aqui
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(BusquedaViewModel::class.java)//Aqui

        _binding = FragmentBusquedaBinding.inflate(inflater, container, false) //Aqui
        val root: View = binding.root

        val textView: TextView = binding.textBusqueda //Aqui
        busquedaViewModel.text.observe(viewLifecycleOwner) {//Aqui
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}