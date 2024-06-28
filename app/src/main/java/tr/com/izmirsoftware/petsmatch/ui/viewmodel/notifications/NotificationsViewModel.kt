package tr.com.izmirsoftware.petsmatch.ui.viewmodel.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import tr.com.izmirsoftware.petsmatch.ui.viewmodel.BaseViewModel

@HiltViewModel
class NotificationsViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text
}