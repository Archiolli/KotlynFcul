package br.unisanta.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtValor1 = findViewById<EditText>(R.id.edt_valor1)
        val edtValor2 = findViewById<EditText>(R.id.edt_valor2)
        val btn = findViewById<Button>(R.id.button)
//        val test = findViewById<EditText>(R.id.edt_valor2) + findViewById<EditText>(R.id.edt_valor1)
        btn.setOnClickListener{
            val val1 = edtValor1.text.toString().toInt()
            val val2 = edtValor2.text.toString().toInt()
            val sum =  val1 + val2

            Toast.makeText(this, "The sum is: $sum", Toast.LENGTH_SHORT).show()

        }
    }
}