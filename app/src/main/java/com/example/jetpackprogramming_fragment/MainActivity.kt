package com.example.jetpackprogramming_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jetpackprogramming_fragment.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        //savedInstanceがNullの場合とは、アクティビティが再起動したとき
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}