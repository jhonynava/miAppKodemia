package mx.kodemia.miappkodemia

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_my_recycler_view.*
import mx.kodemia.miappkodemia.adapters.KoderAdapter
import mx.kodemia.miappkodemia.model.DatosKoder

class MyRecyclerView : AppCompatActivity() {

    val listKoder: MutableList<DatosKoder> = mutableListOf()
    var adapterKoder = KoderAdapter(listKoder)
    var parent_view: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_recycler_view)
        parent_view = findViewById(android.R.id.content)
        initRecyclerKoders()
        title = "RecyclerView Koders"
        initAgregarkoder()
    }

    private fun initRecyclerKoders() {
        listKoder.add(
            DatosKoder(
                "https://www.lifeder.com/wp-content/uploads/2017/09/Guadalajara-Jalisco-min-696x464.jpg",
                "Sael Aceves",
                "Jalisco",
                21
            )
        )
        listKoder.add(
            DatosKoder(
                "https://cdn.forbes.com.mx/2020/07/nuevo-leon-640x360.jpg",
                "Alejandra de la Torre",
                "Nuevo León",
                27
            )
        )
        listKoder.add(
            DatosKoder(
                "https://www.lifeder.com/wp-content/uploads/2017/09/Guadalajara-Jalisco-min-696x464.jpg",
                "Sora",
                "Jalisco",
                31
            )
        )
        listKoder.add(
            DatosKoder(
                "https://www.lifeder.com/wp-content/uploads/2017/09/Guadalajara-Jalisco-min-696x464.jpg",
                "Robe Herrera",
                "Jalisco",
                31
            )
        )
        listKoder.add(
            DatosKoder(
                "https://www.lifeder.com/wp-content/uploads/2017/09/Guadalajara-Jalisco-min-696x464.jpg",
                "Fabian",
                "Jalisco",
                22
            )
        )
        listKoder.add(
            DatosKoder(
                "https://mandara.mx/wp-content/uploads/2021/05/veracruz_puerto1_2-1024x613.jpg",
                "Manu",
                "Veracruz",
                30
            )
        )
        listKoder.add(
            DatosKoder(
                "https://megalopolismx.com/images/noticias/201812/se-declara-listo-morelos-para-recibir-a-turistas-en-vacaciones-de-invierno.jpg",
                "Diego",
                "Morelos",
                26
            )
        )


        // LinearLayoutManager es diseño lineal y GridLayoutManager es una cuadricula
        // Ambos se pueden configurar
        // GridLayoutManager(this, partes_en_que_dividira)
        // LinearLayoutManager(this, orientación_del_linear, false)
//        recyclerView_koders.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false) // Modo horizontal
//        recyclerView_koders.layoutManager = LinearLayoutManager(this) Modo vertical
        recyclerView_koders.layoutManager = LinearLayoutManager(this)
        recyclerView_koders.setHasFixedSize(true)
        adapterKoder = KoderAdapter(listKoder)
        recyclerView_koders.adapter = adapterKoder
    }

    private fun initAgregarkoder() {

        button_add_koder.setOnClickListener {
            hideKeyboard(this)
            val nombre = til_nombre.editText?.text.toString().trim()
            val estado = til_estado.editText?.text.toString().trim()
            val edad = til_edad.editText?.text.toString().trim()

            if (nombre.isNotEmpty() && estado.isNotEmpty() && estado.isNotEmpty()) {
                adapterKoder.insertarKoder(
                    DatosKoder(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Capilla_Campanario.jpg/800px-Capilla_Campanario.jpg",
                        nombre,
                        estado,
                        edad.toInt()
                    )
                )
                recyclerView_koders.scrollToPosition(adapterKoder.itemCount - 1)
            } else {
                Snackbar.make(
                    parent_view!!,
                    "Los datos no pueden estar vacios",
                    Snackbar.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun hideKeyboard(activity: Activity) {
        val inputMethodManager =
            activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        // Check if no view has focus
        val currentFocusedView = activity.currentFocus
        currentFocusedView?.let {
            inputMethodManager.hideSoftInputFromWindow(
                currentFocusedView.windowToken, InputMethodManager.HIDE_NOT_ALWAYS
            )
        }
    }
}