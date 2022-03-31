package br.digitalhouse.navigationaula.ui.fragments


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.digitalhouse.navigationaula.R

class FragmentMain : Fragment(R.layout.fragment_main){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //pega a view do Linear Layout
        var view1 = view.findViewById<View>(R.id.view1)
        view1.setOnClickListener {
            //Pega o Navigation Controller e navega a ação criada no NAV GRAPH
            findNavController().navigate(R.id.action_fragmentMain2_to_fragmentoVerde)
        }
        //pega a view do Linear Layout
        var btn2 = view.findViewById<View>(R.id.view2)
        btn2.setOnClickListener {
            //Pega o Navigation Controller e navega a ação criada no NAV GRAPH
            findNavController().navigate(R.id.action_fragmentMain2_to_fragmentoVermelho)
        }
    }

}