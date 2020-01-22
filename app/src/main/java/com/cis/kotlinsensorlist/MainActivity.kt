package com.cis.kotlinsensorlist

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        val list = manager.getSensorList(Sensor.TYPE_ALL)

        tv.text = ""

        for (sensor in list) {
            tv.append("센서 이름 : ${sensor.name}\n")
            tv.append("센서 종류 : ${sensor.type}\n\n")
        }
    }
}
