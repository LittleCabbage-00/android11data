package com.example.android11upperdata

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            val packageName = "com.google.android.documentsui"

            val activityName = "com.android.documentsui.files.FilesActivity"

            val oldPackageName = "com.android.documentsui"

            try {

                //新版
                val intent = Intent()
                intent.setClassName(packageName, activityName)
                startActivity(intent)

            } catch (e: Exception) {

                //打开旧版
                val oldIntent = Intent()
                oldIntent.setClassName(oldPackageName, activityName)
                startActivity(oldIntent)
            }
    }


}