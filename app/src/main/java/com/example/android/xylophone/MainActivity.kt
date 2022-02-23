package com.example.android.xylophone

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mediaPlayer: MediaPlayer? = null
        val noteC: Button = findViewById(R.id.C_note)
        val noteD: Button = findViewById(R.id.D)
        val noteE: Button= findViewById(R.id.E)
        val noteF: Button= findViewById(R.id.F)
        val noteG: Button= findViewById(R.id.G)
        val note_c:Button= findViewById(R.id.C2)

        noteC.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_c)
            mediaPlayer!!.start()
            mediaPlayer!!.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer?) {
                    mediaPlayer!!.release()
                    mediaPlayer= null
                }
            })
        }

        noteD.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_d)
            mediaPlayer!!.start()
            mediaPlayer!!.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer?) {
                    mediaPlayer!!.release()
                    mediaPlayer= null
                }
            })
        }
        noteE.setOnClickListener {
            mediaPlayer= MediaPlayer.create(applicationContext, R.raw.note_e)
            mediaPlayer!!.start()
            mediaPlayer!!.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer?) {
                    mediaPlayer!!.release()
                    mediaPlayer= null
                }
            })
        }
        noteF.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_f)
            mediaPlayer!!.start()
            mediaPlayer!!.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer?) {
                    mediaPlayer!!.release()
                    mediaPlayer= null
                }
            })
        }
        noteG.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_g)
            mediaPlayer!!.start()
            mediaPlayer!!.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer?) {
                    mediaPlayer!!.release()
                    mediaPlayer = null
                }
            })
        }
        note_c.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_c2)
            mediaPlayer!!.start()
            mediaPlayer!!.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer?) {
                    mediaPlayer!!.release()
                    mediaPlayer= null
                }
            })
        }
    }
}