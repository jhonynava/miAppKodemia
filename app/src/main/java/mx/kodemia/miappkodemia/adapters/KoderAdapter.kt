package mx.kodemia.miappkodemia.adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.google.android.material.card.MaterialCardView
import com.google.android.material.snackbar.Snackbar
import mx.kodemia.miappkodemia.R
import mx.kodemia.miappkodemia.model.DatosKoder

class KoderAdapter(val koder: MutableList<DatosKoder>) :
    RecyclerView.Adapter<KoderAdapter.KoderHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KoderAdapter.KoderHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return KoderHolder(layoutInflater.inflate(R.layout.item_cardview_koder, parent, false))
    }

    override fun onBindViewHolder(holder: KoderAdapter.KoderHolder, position: Int) {
        holder.render(koder[position])
    }

    override fun getItemCount(): Int = koder.size

    class KoderHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val cardView: MaterialCardView = view.findViewById(R.id.cardView_item_koder)
        val textViewNombre: TextView = view.findViewById(R.id.textView_name_koder)
        val textViewEstado: TextView = view.findViewById(R.id.textView_estado_koder)
        val textViewEdad: TextView = view.findViewById(R.id.textView_edad_koder)
        val imageViewKoder: ImageView = view.findViewById(R.id.imageView_koder)

        fun render(koder: DatosKoder) {
            textViewNombre.setText(koder.nombre)
            textViewEstado.setText(koder.estado)
            textViewEdad.setText(koder.edad.toString())

            // Carga de imagenes
            Glide.with(view).load(koder.image).diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(imageViewKoder)

            cardView.setOnClickListener {
                Snackbar.make(view, "Tap en ${koder.nombre}", Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    fun insertarKoder(datosKoder: DatosKoder) {
        this.koder.add(datosKoder)
        notifyItemInserted(itemCount)
    }
}