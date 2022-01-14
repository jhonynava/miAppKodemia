package mx.kodemia.miappkodemia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class FragmentKoders : Fragment() {

    private var parent_view: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_koders, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val texto: TextView = view.findViewById(R.id.textoFragment)
        texto.setText("Koders")
        parent_view = requireActivity().findViewById(android.R.id.content)
        Snackbar.make(parent_view!!, "", Snackbar.LENGTH_SHORT).show()
    }
}