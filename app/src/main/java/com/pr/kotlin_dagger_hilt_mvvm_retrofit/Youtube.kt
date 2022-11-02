package com.pr.kotlin_dagger_hilt_mvvm_retrofit

import android.util.Log
import javax.inject.Inject

class Youtube @Inject constructor() {
    @Inject
    fun printinfo(){
        Log.d(TAG, "printinfo: video is playing...")
    }
}