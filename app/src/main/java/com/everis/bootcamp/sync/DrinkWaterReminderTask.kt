package com.everis.bootcamp.sync

import android.content.Context
import com.everis.bootcamp.utils.PreferencesUtils


class DrinkWaterReminderTask {
    companion object {
        const val ACTION_INCREMENT_WATER_COUNT = "action-increment-water-count"

        private fun incrementWaterCount(context: Context){
            PreferencesUtils.incrementWaterCount(context)
        }
    }





    /*TODO: 003
       - Crie um método publico e estatico para executar a tarefa
       - Coloque um Context como parametro e uma string chamada action
       - Quando a action for igual a constante ACTION_INCREMENT_WATER_COUNT chame o método incrementWaterCount desta classe
     */
}


