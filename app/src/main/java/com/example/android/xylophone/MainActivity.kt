package com.example.android.xylophone

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val noteC: Button = findViewById(R.id.C_note)
        val noteD: Button = findViewById(R.id.D)
        val noteE: Button= findViewById(R.id.E)
        val noteF: Button= findViewById(R.id.F)
        val noteG: Button= findViewById(R.id.G)
        val noteA: Button= findViewById(R.id.A)
        val note_c:Button= findViewById(R.id.C2)

        noteC.setOnClickListener {
            val mediaPlayer:MediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_c)
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer) {
                    mp.release()
                }
            })
        }

        noteD.setOnClickListener {
            val mediaPlayer:MediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_d)
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer) {
                    mp.release()
                }
            })
        }
        noteE.setOnClickListener {
            var mediaPlayer:MediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_e)
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer) {
                    mp.release()
                }
            })
        }
        noteF.setOnClickListener {
            val mediaPlayer:MediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_f)
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer) {
                    mp.release()
                }
            })
        }
        noteG.setOnClickListener {
            val mediaPlayer:MediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_g)
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer) {
                    mp.release()
                }
            })
        }
        noteA.setOnClickListener {
            val mediaPlayer:MediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_a)
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer) {
                    mp.release()
                }
            })
        }
        note_c.setOnClickListener {
            val mediaPlayer:MediaPlayer = MediaPlayer.create(applicationContext, R.raw.note_c2)
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener(object : MediaPlayer.OnCompletionListener{
                override fun onCompletion(mp: MediaPlayer) {
                    mp.release()
                }
            })
        }
    }
}