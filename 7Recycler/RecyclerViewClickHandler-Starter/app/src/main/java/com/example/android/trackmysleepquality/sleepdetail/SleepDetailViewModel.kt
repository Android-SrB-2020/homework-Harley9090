
package com.example.android.trackmysleepquality.sleepdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.trackmysleepquality.database.SleepDatabaseDao
import com.example.android.trackmysleepquality.database.SleepNight
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SleepDetailViewModel(
        private val sleepNightKey: Long = 0L,
        dataSource: SleepDatabaseDao) : ViewModel() {

    val database = dataSource

    private val viewModelJob = Job()

    private val night: LiveData<SleepNight>

    fun getNight() = night


    init {
        night=database.getNightWithId(sleepNightKey)
    }

    private val _navigateToSleepTracker = MutableLiveData<Boolean?>()


    val navigateToSleepTracker: LiveData<Boolean?>
        get() = _navigateToSleepTracker

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    fun doneNavigating() {
        _navigateToSleepTracker.value = null
    }

    fun onClose() {
        _navigateToSleepTracker.value = true
    }

}