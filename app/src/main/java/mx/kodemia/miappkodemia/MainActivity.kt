package mx.kodemia.miappkodemia


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonActivity:Button = findViewById(R.id.buttonActivity)
        buttonActivity.setOnClickListener {
            startActivity(Intent(this, MiActivity2::class.java))
        }

        Toast.makeText(this,R.string.onCreate,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Metodo onCreate",Toast.LENGTH_SHORT).show()

//        imageViewKotlin.setImageResource(R.drawable.kotlin)

        /*buttonIniciar.setOnClickListener {
            val fragmentManager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = fragmentManager.beginTransaction()
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            transaction.add(android.R.id.content, Test()).addToBackStack(null).commit()
        }*/
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Metodo on Start", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Metodo on Resume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Metodo on Pause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Metodo on Stop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Metodo on Destroy", Toast.LENGTH_SHORT).show()
    }
}