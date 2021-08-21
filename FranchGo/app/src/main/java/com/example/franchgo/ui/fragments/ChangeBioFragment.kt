package com.example.franchgo.ui.fragments

import android.widget.TextView
import com.example.franchgo.R
import com.example.franchgo.database.USER
import com.example.franchgo.database.setBioToDatabase
import kotlinx.android.synthetic.main.fragment_cnage_bio.*


/* Фрагмент для изменения информации о пользователе */

class ChangeBioFragment : BaseChangeFragment(R.layout.fragment_cnage_bio) {

    override fun onResume() {
        super.onResume()

        settings_input_bio.setText(USER.bio)
    }

    override fun change() {
        super.change()
        val newBio = settings_input_bio.text.toString()
        setBioToDatabase(newBio)
    }
}
