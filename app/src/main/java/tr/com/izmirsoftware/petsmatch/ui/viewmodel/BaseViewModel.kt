package tr.com.izmirsoftware.petsmatch.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {
    protected val <T> LiveData<T>.mutable: MutableLiveData<T>
        get() = this as MutableLiveData<T>
}