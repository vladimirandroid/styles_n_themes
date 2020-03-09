package com.androidjunior.stylesthemes.theme_switcher

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ThemeSwitcher(context: Context) {

    private val sharedPreferences = context.getSharedPreferences(SP_NAME, 0)
    private val themeLiveData = MutableLiveData<Boolean>()

    val observe: LiveData<Boolean> = themeLiveData

    var isLight
        get() = sharedPreferences.getBoolean(SP_KEY, true)
        set(value) {
            sharedPreferences.edit().putBoolean(SP_KEY, value).apply()
            themeLiveData.postValue(value)
        }

    companion object {
        private const val SP_KEY = "isLight"
        private const val SP_NAME = "themeSwitcher"
    }
}