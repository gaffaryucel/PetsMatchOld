package tr.com.izmirsoftware.petsmatch

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import tr.com.izmirsoftware.petsmatch.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //host navigation fragmente erişiyoruz
        val navHostFragment = supportFragmentManager
            .findFragmentById(binding.navView.id) as NavHostFragment?
        val navControl = navHostFragment?.navController

        navControl?.let {
            //bottom navigatiton ile host navigation fragment bağlantısı yapıldı
            //çalışması için bottom menü item idleri ile fragment idleri aynı olması lazım
            NavigationUI.setupWithNavController(binding.navView, navControl)

            //Bottom Navigation item'leri tekrar seçildiğinde sayfayı yenilemesi için eklendi
            binding.navView.setOnItemReselectedListener {
                when (it.itemId) {
                    R.id.navigation_home -> navControl.navigate(R.id.action_global_navigation_home)
                    R.id.navigation_dashboard -> navControl.navigate(R.id.action_global_navigation_dashboard)
                    R.id.navigation_notifications -> navControl.navigate(R.id.action_global_navigation_notifications)
                }
            }
        }
    }
}