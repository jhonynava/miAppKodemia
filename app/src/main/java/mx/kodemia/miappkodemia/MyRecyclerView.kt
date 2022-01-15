package mx.kodemia.miappkodemia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
    }

    private fun initRecyclerKoders() {
        listKoder.add(DatosKoder("Sael Aceves", "Jalisco", 21))
        listKoder.add(DatosKoder("Alejandra de la Torre", "Nuevo León", 27))
        listKoder.add(DatosKoder("Sora", "Jalisco", 31))
        listKoder.add(DatosKoder("Robe Herrera", "Jalisco", 31))
        listKoder.add(DatosKoder("Fabian", "Jalisco", 22))
        listKoder.add(DatosKoder("Manu", "Veracruz", 30))
        listKoder.add(DatosKoder("Diego", "Morelos", 26))


        // LinearLayoutManager es diseño lineal y GridLayoutManager es una cuadricula
        // Ambos se pueden configurar
        // GridLayoutManager(this, partes_en_que_dividira)
        // LinearLayoutManager(this, orientación_del_linear, false)
//        recyclerView_koders.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false) // Modo horizontal
//        recyclerView_koders.layoutManager = LinearLayoutManager(this) Modo vertical
        recyclerView_koders.layoutManager = GridLayoutManager(this, 2)
        recyclerView_koders.setHasFixedSize(true)
        adapterKoder = KoderAdapter(listKoder)
        recyclerView_koders.adapter = adapterKoder
    }
}