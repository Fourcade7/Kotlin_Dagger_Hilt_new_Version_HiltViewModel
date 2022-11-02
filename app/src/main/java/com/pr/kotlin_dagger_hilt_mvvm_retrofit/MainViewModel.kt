package com.pr.kotlin_dagger_hilt_mvvm_retrofit

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val youtube: Youtube
) :ViewModel() {
}