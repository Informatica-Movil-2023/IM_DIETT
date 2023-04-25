package com.example.buttonnavegation.ui.calendario



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.arch.lifecycle.ViewModelProvider
import android.support.v4.app.Fragment
import com.example.buttonnavegation.databinding.FragmentCalendarioBinding


class calendarioFragment : Fragment(){

    private var _binding: FragmentCalendarioBinding? = null //Aqui

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val calendarioViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(calendarioViewModel::class.java) //Aqui

        _binding = FragmentCalendarioBinding.inflate(inflater, container, false)//Aqui
        val root: View = binding.root

        val textView: TextView = binding.textCalendario //Aqui
        calendarioViewModel.text.observe(viewLifecycleOwner) {//Aqui
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}