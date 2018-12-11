package edu.rosehulman.kime2.hellobutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var numPresses = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateView()

        button.setOnClickListener {
            numPresses++
            if (numPresses >= 10) {
                //text_view.visibility = View.INVISIBLE
                var color = ContextCompat.getColor(this, R.color.colorPrimary)
                text_view.setTextColor(color)
            }
            updateView()
        }
    }

    private fun updateView() {
        var message = getString(R.string.message_format, numPresses)
        text_view.text = message
    }
}
