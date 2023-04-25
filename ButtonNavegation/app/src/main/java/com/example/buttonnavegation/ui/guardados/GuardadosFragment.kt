package com.example.buttonnavegation.ui.guardados

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.ViewModelProvider
import com.example.buttonnavegation.databinding.FragmentGuardadosBinding

class GuardadosFragment : Fragment() {

    private var _binding: FragmentGuardadosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val guardadosViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(GuardadosViewModel::class.java)

        _binding = FragmentGuardadosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGuardados
        guardadosViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}