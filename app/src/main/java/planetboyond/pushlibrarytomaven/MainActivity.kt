package planetboyond.pushlibrarytomaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import planetbeyond.pblib.Toasting

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toasting = Toasting()

    }
}