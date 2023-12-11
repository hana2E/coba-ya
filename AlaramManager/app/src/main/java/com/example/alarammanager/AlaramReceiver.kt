package com.example.alarammanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Vibrator
import android.widget.Toast

class AlaramReceiver : BroadcastReceiver()
{
    override fun onReceive(context: Context?, intent: Intent?) {
        val vibrator = context!!.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(4000)
        Toast.makeText(context,"Alaram ! Wakeup! Wake up!",Toast.LENGTH_SHORT).show()

        var alaramUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)

        if (alaramUri == null){
            alaramUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        }
        val ringtone = RingtoneManager.getRingtone(context,alaramUri)
        ringtone.play()

    }
}