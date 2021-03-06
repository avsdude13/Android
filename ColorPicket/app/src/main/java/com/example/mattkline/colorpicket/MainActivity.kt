package com.example.mattkline.colorpicket

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBarRed.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                redValue.setText(seekBarRed.progress.toString())
                surface.setBackgroundColor(Color.rgb(seekBarRed.progress, seekBarGreen.progress, seekBarBlue.progress))
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        seekBarGreen.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                greenValue.setText(seekBarGreen.progress.toString())
                surface.setBackgroundColor(Color.rgb(seekBarRed.progress, seekBarGreen.progress, seekBarBlue.progress))
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        seekBarBlue.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                blueValue.setText(seekBarBlue.progress.toString())
                surface.setBackgroundColor(Color.rgb(seekBarRed.progress, seekBarGreen.progress, seekBarBlue.progress))
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        redValue.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                seekBarRed.setProgress(redValue.text.toString().toInt())
                surface.setBackgroundColor(Color.rgb(seekBarRed.progress, seekBarGreen.progress, seekBarBlue.progress))
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        greenValue.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                seekBarGreen.setProgress(greenValue.text.toString().toInt())
                surface.setBackgroundColor(Color.rgb(seekBarRed.progress, seekBarGreen.progress, seekBarBlue.progress))
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        blueValue.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                seekBarBlue.setProgress(blueValue.text.toString().toInt())
                surface.setBackgroundColor(Color.rgb(seekBarRed.progress, seekBarGreen.progress, seekBarBlue.progress))
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }
}
