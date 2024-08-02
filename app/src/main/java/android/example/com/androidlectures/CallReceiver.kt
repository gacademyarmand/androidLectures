package android.example.com.androidlectures

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast


class CallReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.i(CallReceiver.TAG, "academy you have received a call -- cognizant")
        try {
            Toast.makeText(context, " Receiver start: phone call ", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    companion object{
        var TAG = CallReceiver::class.java.simpleName
    }
}