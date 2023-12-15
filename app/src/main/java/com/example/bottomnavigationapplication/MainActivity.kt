package com.example.bottomnavigationapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomNavigation)
       /* if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<Fragment1>(R.id.fragment_container_view)
                add<Fragment2>(R.id.fragment_container_view)
            }
        }*/
        val homeFragment= HomeFragment()
        val personFragment=PersonFragment()
        val settingFragment= SettingFragment()
         setCurrentFragment(homeFragment)






        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home_nav->setCurrentFragment(homeFragment)
                R.id.person_nav->setCurrentFragment(personFragment)
                R.id.setting_nav->setCurrentFragment(settingFragment)

            }
            true
        }





    }
    private fun setCurrentFragment(fragment: Fragment)=supportFragmentManager.beginTransaction().
    apply{
        replace(R.id.flFragment,fragment)
        commit()

    }

}