package com.garnirka.myapplicationlifecycle

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Думы печальные, думы глубокие,\n" +
                "Горькие думы, думы тяжелые," )
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Думы, от счастия вечно далекие,\n" +
                "Спутники жизни моей невеселые!" )
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Думы — родители звуков мучения,\n" +
                "Думы несчастные, думы холодные," )
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Думы — источники слез огорчения,\n" +
                "Вольные думы, думы свободные!" )
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Что вы терзаете грудь истомлённую,\n" +
                "Что заграждаете путь вы мне мой?.." )
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"Что возбуждаете силу сломлённую\n" +
                "Вновь на борьбу с непроглядною тьмой?" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Не поддержать вам костра догоревшего,\n" +
                "Искры потухшие… Поздно, бесплодные.\n" +
                "Не исцелить сердца вам наболевшего,\n" +
                "Думы больные, без жизни, холодные!?" )
    }

}
