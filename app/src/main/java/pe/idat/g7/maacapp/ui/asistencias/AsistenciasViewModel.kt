package pe.idat.g7.maacapp.ui.asistencias

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AsistenciasViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is asistencias Fragment"
    }
    val text: LiveData<String> = _text
}