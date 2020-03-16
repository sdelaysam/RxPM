package me.dmdev.rxpm.sample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_launch.*
import me.dmdev.rxpm.sample.counter.*
import me.dmdev.rxpm.sample.main.*
import me.dmdev.rxpm.sample.permissions.*
import me.dmdev.rxpm.sample.validation.*

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        counterSample.setOnClickListener {
            launchActivity(CounterActivity::class.java)
        }

        mainSample.setOnClickListener {
            launchActivity(MainActivity::class.java)
        }

        permissionsSample.setOnClickListener {
            launchActivity(PermissionsActivity::class.java)
        }

        formValidationSample.setOnClickListener {
            launchActivity(FormValidationActivity::class.java)
        }
    }

    private fun launchActivity(clazz: Class<out Activity>) {
        startActivity(Intent(this, clazz))
    }
}