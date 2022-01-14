package mx.kodemia.miappkodemia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_formulario_linear_layout.*

class FormularioLinearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_linear_layout)

        val textEmail: String = til_email.editText?.text?.trim().toString()
        val textEmail2: String = tiet_email.text?.trim().toString()

        tiet_email.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(editText: Editable?) {
                if (editText.toString().trim().isEmpty()) {
                    til_email.setError("El campo es requerido")
                } else {
                    til_email.setErrorEnabled(false)
                    til_email.setError("")
                }
            }

        })

        button_login.setOnClickListener {
            startActivity(Intent(this, Settings::class.java))
        }
    }
}