package com.example.clicker

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var countmoney : Int = 0
    var deltamoney : Int = 1
    var number_of_image : Int = 1;

    lateinit var new_money_button : Button
    lateinit var money_text_view : TextView
    lateinit var image_view : ImageView

    lateinit var mPlayer: MediaPlayer
    lateinit var playButton: Button
    lateinit var pauseButton: Button
    lateinit var stopButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        new_money_button = findViewById(R.id.new_money)
        money_text_view = findViewById(R.id.money)
        image_view = findViewById(R.id.imageView)

        money_text_view.text = countmoney.toString()


        mPlayer = MediaPlayer.create(this,R.raw.music)
        mPlayer.setOnCompletionListener { startPlay() }

        playButton = findViewById(R.id.playButton);
        pauseButton = findViewById(R.id.pauseButton);
        stopButton = findViewById(R.id.stopButton);

    }
    fun countMe (view: View) {
        countmoney = countmoney + deltamoney
        // Display the new value in the text view.
        money_text_view.text = countmoney.toString();
        var k : Int = 1
        if (Integer.parseInt(money_text_view.text.toString()) >= 10 + number_of_image * k){
            if (number_of_image > 66){
                number_of_image = number_of_image - 66
            }
            if (number_of_image == 1) {
                image_view.setImageResource(R.drawable.img_01);
            }
            if (number_of_image == 2) {
                image_view.setImageResource(R.drawable.img_02);
            }
            if (number_of_image == 3) {
                image_view.setImageResource(R.drawable.img_03);
            }
            if (number_of_image == 4) {
                image_view.setImageResource(R.drawable.img_04);
            }
            if (number_of_image == 5) {
                image_view.setImageResource(R.drawable.img_05);
            }
            if (number_of_image == 6) {
                image_view.setImageResource(R.drawable.img_06);
            }
            if (number_of_image == 7) {
                image_view.setImageResource(R.drawable.img_07);
            }
            if (number_of_image == 8) {
                image_view.setImageResource(R.drawable.img_08);
            }
            if (number_of_image == 9) {
                image_view.setImageResource(R.drawable.img_09);
            }
            if (number_of_image == 10) {
                image_view.setImageResource(R.drawable.img_10);
            }
            if (number_of_image == 11) {
                image_view.setImageResource(R.drawable.img_11);
            }
            if (number_of_image == 12) {
                image_view.setImageResource(R.drawable.img_12);
            }
            if (number_of_image == 13) {
                image_view.setImageResource(R.drawable.img_13);
            }
            if (number_of_image == 14) {
                image_view.setImageResource(R.drawable.img_14);
            }
            if (number_of_image == 15) {
                image_view.setImageResource(R.drawable.img_15);
            }
            if (number_of_image == 16) {
                image_view.setImageResource(R.drawable.img_16);
            }
            if (number_of_image == 17) {
                image_view.setImageResource(R.drawable.img_17);
            }
            if (number_of_image == 18) {
                image_view.setImageResource(R.drawable.img_18);
            }
            if (number_of_image == 19) {
                image_view.setImageResource(R.drawable.img_19);
            }
            if (number_of_image == 20) {
                image_view.setImageResource(R.drawable.img_20);
            }
            if (number_of_image == 21) {
                image_view.setImageResource(R.drawable.img_21);
            }
            if (number_of_image == 22) {
                image_view.setImageResource(R.drawable.img_22);
            }
            if (number_of_image == 23) {
                image_view.setImageResource(R.drawable.img_23);
            }
            if (number_of_image == 24) {
                image_view.setImageResource(R.drawable.img_24);
            }
            if (number_of_image == 25) {
                image_view.setImageResource(R.drawable.img_25);
            }
            if (number_of_image == 26) {
                image_view.setImageResource(R.drawable.img_26);
            }
            if (number_of_image == 27) {
                image_view.setImageResource(R.drawable.img_27);
            }
            if (number_of_image == 28) {
                image_view.setImageResource(R.drawable.img_28);
            }
            if (number_of_image == 29) {
                image_view.setImageResource(R.drawable.img_29);
            }
            if (number_of_image == 30) {
                image_view.setImageResource(R.drawable.img_30);
            }
            if (number_of_image == 31) {
                image_view.setImageResource(R.drawable.img_31);
            }
            if (number_of_image == 32) {
                image_view.setImageResource(R.drawable.img_32);
            }
            if (number_of_image == 33) {
                image_view.setImageResource(R.drawable.img_33);
            }
            if (number_of_image == 34) {
                image_view.setImageResource(R.drawable.img_34);
            }
            if (number_of_image == 35) {
                image_view.setImageResource(R.drawable.img_35);
            }
            if (number_of_image == 36) {
                image_view.setImageResource(R.drawable.img_36);
            }
            if (number_of_image == 37) {
                image_view.setImageResource(R.drawable.img_37);
            }
            if (number_of_image == 38) {
                image_view.setImageResource(R.drawable.img_38);
            }
            if (number_of_image == 39) {
                image_view.setImageResource(R.drawable.img_39);
            }
            if (number_of_image == 40) {
                image_view.setImageResource(R.drawable.img_40);
            }
            if (number_of_image == 41) {
                image_view.setImageResource(R.drawable.img_41);
            }
            if (number_of_image == 42) {
                image_view.setImageResource(R.drawable.img_42);
            }
            if (number_of_image == 43) {
                image_view.setImageResource(R.drawable.img_43);
            }
            if (number_of_image == 44) {
                image_view.setImageResource(R.drawable.img_44);
            }
            if (number_of_image == 45) {
                image_view.setImageResource(R.drawable.img_45);
            }
            if (number_of_image == 46) {
                image_view.setImageResource(R.drawable.img_46);
            }
            if (number_of_image == 47) {
                image_view.setImageResource(R.drawable.img_47);
            }
            if (number_of_image == 48) {
                image_view.setImageResource(R.drawable.img_48);
            }
            if (number_of_image == 49) {
                image_view.setImageResource(R.drawable.img_49);
            }
            if (number_of_image == 50) {
                image_view.setImageResource(R.drawable.img_50);
            }
            if (number_of_image == 51) {
                image_view.setImageResource(R.drawable.img_51);
            }
            if (number_of_image == 52) {
                image_view.setImageResource(R.drawable.img_52);
            }
            if (number_of_image == 53) {
                image_view.setImageResource(R.drawable.img_53);
            }
            if (number_of_image == 54) {
                image_view.setImageResource(R.drawable.img_54);
            }
            if (number_of_image == 55) {
                image_view.setImageResource(R.drawable.img_55);
            }
            if (number_of_image == 56) {
                image_view.setImageResource(R.drawable.img_56);
            }
            if (number_of_image == 57) {
                image_view.setImageResource(R.drawable.img_57);
            }
            if (number_of_image == 58) {
                image_view.setImageResource(R.drawable.img_58);
            }
            if (number_of_image == 59) {
                image_view.setImageResource(R.drawable.img_59);
            }
            if (number_of_image == 60) {
                image_view.setImageResource(R.drawable.img_60);
            }
            if (number_of_image == 61) {
                image_view.setImageResource(R.drawable.img_61);
            }
            if (number_of_image == 62) {
                image_view.setImageResource(R.drawable.img_62);
            }
            if (number_of_image == 63) {
                image_view.setImageResource(R.drawable.img_63);
            }
            if (number_of_image == 64) {
                image_view.setImageResource(R.drawable.img_64);
            }
            if (number_of_image == 65) {
                image_view.setImageResource(R.drawable.img_65);
            }
            if (number_of_image == 66) {
                image_view.setImageResource(R.drawable.img_66);
            }
            /*
            if (number_of_image == 67) {
                image_view.setImageResource(R.drawable.img_67);
            }
            if (number_of_image == 68) {
                image_view.setImageResource(R.drawable.img_68);
            }
            if (number_of_image == 69) {
                image_view.setImageResource(R.drawable.img_69);
            }
            if (number_of_image == 70) {
                image_view.setImageResource(R.drawable.img_70);
            }
            if (number_of_image == 71) {
                image_view.setImageResource(R.drawable.img_71);
            }
            if (number_of_image == 72) {
                image_view.setImageResource(R.drawable.img_72);
            }
            if (number_of_image == 73) {
                image_view.setImageResource(R.drawable.img_73);
            }
            if (number_of_image == 74) {
                image_view.setImageResource(R.drawable.img_74);
            }
            if (number_of_image == 75) {
                image_view.setImageResource(R.drawable.img_75);
            }
            if (number_of_image == 76) {
                image_view.setImageResource(R.drawable.img_76);
            }
            if (number_of_image == 77) {
                image_view.setImageResource(R.drawable.img_77);
            }
            if (number_of_image == 78) {
                image_view.setImageResource(R.drawable.img_78);
            }
            if (number_of_image == 79) {
                image_view.setImageResource(R.drawable.img_79);
            }

             */
            number_of_image++
            //money_text_view.text = (Integer.parseInt(money_text_view.text.toString()) - k).toString()
        }
    }

    private fun stopPlay() {
        mPlayer!!.stop()
        pauseButton.setEnabled(false)
        stopButton.setEnabled(false)
        try {
            mPlayer!!.prepare()
            mPlayer!!.seekTo(0)
            playButton!!.isEnabled = true
        } catch (t: Throwable) {
            Toast.makeText(this, t.message, Toast.LENGTH_SHORT).show()
        }
    }
    private fun startPlay() {
        mPlayer!!.start()
        playButton!!.isEnabled = false
        pauseButton.setEnabled(true)
        stopButton.setEnabled(true)
    }

    fun play(view: View?) {
        mPlayer!!.start()
        playButton!!.isEnabled = false
        pauseButton.setEnabled(true)
        stopButton.setEnabled(true)
    }

    fun pause(view: View?) {
        mPlayer!!.pause()
        playButton!!.isEnabled = true
        pauseButton.setEnabled(false)
        stopButton.setEnabled(true)
    }

    fun stop(view: View?) {
        stopPlay()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (mPlayer!!.isPlaying) {
            stopPlay()
        }
    }
}