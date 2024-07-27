package com.jay.navdrawerwithoutbasicfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.jay.navdrawerwithoutbasicfragments.levelsfragments.LevelFiveFragment
import com.jay.navdrawerwithoutbasicfragments.levelsfragments.LevelFourFragment
import com.jay.navdrawerwithoutbasicfragments.levelsfragments.LevelOneFragment
import com.jay.navdrawerwithoutbasicfragments.levelsfragments.LevelThreeFragment
import com.jay.navdrawerwithoutbasicfragments.levelsfragments.LevelTwoFragment

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById<DrawerLayout>(R.id.myDrawerLayout)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)


        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open, R.string.nav_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,HomeFragment()).commit()
            navigationView.setCheckedItem(R.id.nav_home)
        }

    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_home -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()

            R.id.action_100level -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, LevelOneFragment()).addToBackStack(null).commit()
            R.id.action_200level -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, LevelTwoFragment()).addToBackStack(null).commit()
            R.id.action_300level -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, LevelThreeFragment()).addToBackStack(null).commit()
            R.id.action_400level -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, LevelFourFragment()).addToBackStack(null).commit()
            R.id.action_500level -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, LevelFiveFragment()).addToBackStack(null).commit()
            R.id.action_contact -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ContactFragment()).addToBackStack(null).commit()
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START)
        } else{
            onBackPressedDispatcher.onBackPressed()
        }
    }

}