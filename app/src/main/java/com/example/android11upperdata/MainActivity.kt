package info.itloser.utils.android11data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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