package br.com.isaccanedo.cronometro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myChronometer = findViewById<Chronometer>(R.id.chronometer)
        val btnStart = findViewById<Button>(R.id.start)
        val btnStop = findViewById<Button>(R.id.stop)
        val btnReset = findViewById<Button>(R.id.reset)

        btnStart.setOnClickListener(){
            myChronometer.start();
            Toast.makeText(this,
                "myChronometer.start()",
                Toast.LENGTH_LONG).show()
        }

        btnStop.setOnClickListener(){
            myChronometer.stop();
            Toast.makeText(this,
                "myChronometer.stop()",
                Toast.LENGTH_LONG).show()
        }

        btnReset.setOnClickListener(){
            myChronometer.base = SystemClock.elapsedRealtime()
            Toast.makeText(this,
                "myChronometer.base = SystemClock.elapsedRealtime()",
                Toast.LENGTH_LONG).show()
        }

        val myChronometerDn = findViewById<Chronometer>(R.id.chronometerDn)
        val btnStartDn = findViewById<Button>(R.id.startDn)
        val btnStopDn = findViewById<Button>(R.id.stopDn)
        val btnResetDn = findViewById<Button>(R.id.resetDn)

        btnStartDn.setOnClickListener(){
            myChronometerDn.base = SystemClock.elapsedRealtime() + 10000
            myChronometerDn.start()
            Toast.makeText(this,
                "myChronometerDn.base = " +
                        "SystemClock.elapsedRealtime() + 10000 \n" +
                        "myChronometerDn.start()",
                Toast.LENGTH_LONG).show()
        }

        btnStopDn.setOnClickListener(){
            myChronometerDn.stop()
            Toast.makeText(this,
                "myChronometerDn.stop()",
                Toast.LENGTH_LONG).show()
        }

        btnResetDn.setOnClickListener(){
            myChronometerDn.base = SystemClock.elapsedRealtime()
            Toast.makeText(this,
                "myChronometerDn.base = SystemClock.elapsedRealtime()",
                Toast.LENGTH_LONG).show()
        }

    }
}