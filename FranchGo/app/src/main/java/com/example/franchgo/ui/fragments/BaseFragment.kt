package com.example.franchgo.ui.fragments
import androidx.fragment.app.Fragment
import com.example.franchgo.utilits.APP_ACTIVITY

/* Базовый фрагмент, от него наследуются все фрагменты приложения, кроме главного */

open class BaseFragment( layout:Int) : Fragment(layout) {

    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.mAppDrawer.disableDrawer()
    }
}
