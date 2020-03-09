package com.androidjunior.stylesthemes.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidjunior.stylesthemes.R
import com.androidjunior.stylesthemes.theme_switcher.ThemeSwitcher

open class ThemedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        if (themeSwitcher == null)
            themeSwitcher = ThemeSwitcher(this)

        if (themeSwitcher!!.isLight)
            setTheme(R.style.Light)
        else
            setTheme(R.style.Dark)

        super.onCreate(savedInstanceState)
    }

    companion object {
        var themeSwitcher: ThemeSwitcher? = null
    }
}