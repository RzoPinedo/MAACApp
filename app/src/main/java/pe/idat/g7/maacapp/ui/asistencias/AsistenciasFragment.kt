package pe.idat.g7.maacapp.ui.asistencias

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import pe.idat.g7.maacapp.databinding.FragmentAsistenciasBinding


class AsistenciasFragment : Fragment() {

    private var _binding: FragmentAsistenciasBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val asistenciasViewModel =
            ViewModelProvider(this).get(AsistenciasViewModel::class.java)

        _binding = FragmentAsistenciasBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAsistencias
        asistenciasViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}