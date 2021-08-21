package com.example.myapplication

import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.View
import android.widget.ImageView
import androidx.drawerlayout.widget.DrawerLayout
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
import com.mikepenz.materialdrawer.util.AbstractDrawerImageLoader
import com.mikepenz.materialdrawer.util.DrawerImageLoader

lateinit var APP_ACTIVITY: MainActivity
/* Обьект реализующий боковое меню Navigation Drawer */

class AppDrawer {

    private lateinit var mDrawer: Drawer
    private lateinit var mHeader: AccountHeader
    private lateinit var mDrawerLayout: DrawerLayout
    private lateinit var mCurrentProfile: ProfileDrawerItem

    fun create() {
        /* Создания бокового меню */

        createDrawer()
        mDrawerLayout = mDrawer.drawerLayout
    }




    private fun createDrawer() {
        /* Создание дравера */
        mDrawer = DrawerBuilder()
            .withActivity(APP_ACTIVITY)

            .withActionBarDrawerToggle(true)
            .withSelectedItem(-1)
            .withAccountHeader(mHeader)
            .addDrawerItems(
                PrimaryDrawerItem().withIdentifier(100)
                    .withIconTintingEnabled(true)
                    .withName("Мой профиль")
                    .withSelectable(false),

            ).withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener {
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {
                    clickToItem(position)
                    return false
                }
            }).build()

    }

    private fun clickToItem(position: Int) {
        when (position) {
            1 -> BlankFragment()
//            2 -> replaceFragment(MapsFragment())
//            3 -> replaceFragment(IntalagentBotFragment())
//            4 -> replaceFragment(ContactsFragment())
//            5 -> replaceFragment(LentaFragment())
//            //6 -> replaceFragment(TestListFragment())
//            7 -> replaceFragment(SettingsFragment())
//            9 -> replaceFragment(QRFragment())
//            10 -> replaceFragment(AnserFragment())
        }
    }

//    private fun createHeader() {
//        /* Создание хедера*/
//        mCurrentProfile = ProfileDrawerItem()
//            .withName("USER.fullname")
//            .withEmail("USER.phone")
//            .withIcon("USER.photoUrl")
//            .withIdentifier(200)
//        mHeader = AccountHeaderBuilder()
//            .withActivity(APP_ACTIVITY)
//            .withHeaderBackground(R.drawable.header)
//            .addProfiles(
//                mCurrentProfile
//            ).build()
    }

//    fun updateHeader() {
//        /* Обновления хедера */
//        mCurrentProfile
//            .withName(USER.fullname)
//            .withEmail(USER.phone)
//            .withIcon(USER.photoUrl)
//
//        mHeader.updateProfile(mCurrentProfile)

//

//    private fun initLoader() {
//        /* Инициализация лоадера для загрузки картинок в хедер */
//        DrawerImageLoader.init(object : AbstractDrawerImageLoader() {
//            override fun set(imageView: ImageView, uri: Uri, placeholder: Drawable) {
//                imageView.downloadAndSetImage(uri.toString())
//            }
//        })
