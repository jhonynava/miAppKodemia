package mx.kodemia.miappkodemia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {

    private var parent_view: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        parent_view = findViewById(android.R.id.content)

        initCheckBox()
        initRadioButton()
        initSwitch()
        initSpinner()
        initListView()

        fab_extended.setOnClickListener {
            startActivity(Intent(this,MyRecyclerView::class.java))
        }
    }

    private fun initListView(){
        val koders = resources.getStringArray(R.array.koders)
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, koders.sortedArray())
        listView_koders.adapter = arrayAdapter

        listView_koders.setOnItemClickListener { adapterView, view, position, id ->
            val textoSelected = adapterView?.getItemAtPosition(position).toString()
            Snackbar.make(parent_view!!, "Tap en $textoSelected con la posición $position", Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun initSpinner() {
        val koders = resources.getStringArray(R.array.koders)
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, koders.sortedArray())
        spinner_koders.adapter = arrayAdapter

        spinner_koders.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val textoSelected = adapterView?.getItemAtPosition(position).toString()
                Snackbar.make(parent_view!!, "Tap en $textoSelected con la posición $position", Snackbar.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
    }

    private fun initSwitch() {
        switch_wifi.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked) {
                Snackbar.make(parent_view!!, "WiFi activado", Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(parent_view!!, "WiFi desactivado", Snackbar.LENGTH_SHORT).show()
            }
        }

        switch_bluetooth.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked) {
                Snackbar.make(parent_view!!, "Bluetooth activado", Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(parent_view!!, "Bluetooth desactivado", Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    private fun initRadioButton() {
        radioGroup.setOnCheckedChangeListener { radioGroup, checkedId ->
            when (checkedId) {
                R.id.radio_button_1 -> Snackbar.make(
                    parent_view!!,
                    "Seleccionaste ${radio_button_1.text}",
                    Snackbar.LENGTH_SHORT
                ).show()

                R.id.radio_button_2 -> Snackbar.make(
                    parent_view!!,
                    "Seleccionaste ${radio_button_2.text}",
                    Snackbar.LENGTH_SHORT
                ).show()

                R.id.radio_button_3 -> Snackbar.make(
                    parent_view!!,
                    "Seleccionaste ${radio_button_3.text}",
                    Snackbar.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun initCheckBox() {
        //val checkBox_unchecked: CheckBox = findViewById(R.id.checkBox_unchecked)
        checkBox_unchecked.setOnCheckedChangeListener { checkBox, isChecked ->
            if (isChecked) {
                Snackbar.make(parent_view!!, "Se selecciono el checkbox 1", Snackbar.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(this, "Se deselecciono el checkbox 1", Toast.LENGTH_SHORT).show()
            }
        }
    }
}