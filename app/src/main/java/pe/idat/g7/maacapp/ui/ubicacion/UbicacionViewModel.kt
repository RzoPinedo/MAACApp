package pe.idat.g7.maacapp.ui.ubicacion

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UbicacionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is ubicacion Fragment"
    }
    val text: LiveData<String> = _text
}