package android.example.com.androidlectures

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.example.com.androidlectures.SmsReceiver.Companion
import android.telephony.TelephonyManager
import android.util.Log
import android.widget.Toast


class CallReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        try {
            val state = intent.getStringExtra(TelephonyManager.EXTRA_STATE)
            val incomingNumber = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER)
            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                Log.i(SmsReceiver.TAG, "Receiving Call from: " + incomingNumber)
                Toast.makeText(context,"Incoming Call State: "+incomingNumber,Toast.LENGTH_SHORT).show();
            }
            if ((state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))){
                Toast.makeText(context,"Call Received State",Toast.LENGTH_SHORT).show();
            }
            if (state.equals(TelephonyManager.EXTRA_STATE_IDLE)){
                Toast.makeText(context,"Call Idle State",Toast.LENGTH_SHORT).show();
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    companion object{
        var TAG = CallReceiver::class.java.simpleName
    }
}