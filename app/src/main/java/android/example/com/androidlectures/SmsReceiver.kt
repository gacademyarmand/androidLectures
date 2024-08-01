package android.example.com.androidlectures

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class SmsReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.i(TAG, "academy you have received an sms -- cognizant")
    }

    companion object{
        var TAG = SmsReceiver::class.java.simpleName
    }
}