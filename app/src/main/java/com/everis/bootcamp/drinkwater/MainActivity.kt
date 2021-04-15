package com.everis.bootcamp.drinkwater

import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import androidx.appcompat.app.AppCompatActivity
import com.everis.bootcamp.utils.PreferencesUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
    SharedPreferences.OnSharedPreferenceChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: 008 - Realize a chamada da função updateWaterCount

        imageview_cup_icon.setOnClickListener {
            //TODO: 009 - Chame a função incrementWaterHandler
        }

        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        prefs.registerOnSharedPreferenceChangeListener(this)
    }

    fun updateWaterCount(){
        val count = PreferencesUtils.getWaterCount(this)
        textview_quantity.text = "$count"
    }

    /*TODO: 008 - crie uma função chamada incrementWaterHandler
        - Crie uma intent explicita para acionar o DrinkWaterReminderIntentService
        - Defina a action da Intent com a constant ACTION_INCREMENT_WATER_COUNT
        - Chame startService e passe a intent como parametro
     */


    override fun onDestroy() {
        super.onDestroy()
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        prefs.unregisterOnSharedPreferenceChangeListener(this)
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {
        //TODO: 010 - Chame o método updateWaterCount se o parametro key for igual a constante PrefencesUtils.KEY_WATER_COUNT
    }
}
