package mx.kodemia.miappkodemia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MiActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mi2)

        val buttonFragment: Button = findViewById(R.id.buttonFragment)

        buttonFragment.setOnClickListener {
            val fragmentKoders = FragmentKoders()
            val fragmentManager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = fragmentManager.beginTransaction()
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            transaction.add(android.R.id.content, fragmentKoders)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}