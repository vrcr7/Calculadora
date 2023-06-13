package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var bSumar: Button? = null
    var bRestar: Button? = null
    var bMulti: Button? = null
    var bDivi: Button? = null
    var num1: EditText? = null
    var num2: EditText? = null
    var total: TextView? = null
    fun sumar(a: Int, b: Int): Int {
        var suma = 0
        suma = a + b
        return suma
    }

    fun restar(a: Int, b: Int): Int {
        var resta = 0
        resta = a - b
        return resta
    }

    fun multi(a: Int, b: Int): Int {
        var res = 0
        res = a * b
        return res
    }

    fun divid(a: Int, b: Int): String {
        var res = "0"
        return if (b != 0) {
            res = "" + a / b
            res
        } else {
            "Error"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //objetos para cada uno de los del xml
        total = findViewById<View>(R.id.etiResultado) as TextView
        num1 = findViewById<View>(R.id.primerNum) as EditText
        num2 = findViewById<View>(R.id.segundoNum) as EditText
        bSumar = findViewById<View>(R.id.botonSumar) as Button
        bRestar = findViewById<View>(R.id.botonRestar) as Button
        bMulti = findViewById<View>(R.id.botonMulti) as Button
        bDivi = findViewById<View>(R.id.botonDivi) as Button
        //variables para el mensaje toast a utilizar
        val context = applicationContext
        val text: CharSequence = "Falta un número"
        val duracion = Toast.LENGTH_SHORT
        val toast = Toast.makeText(context, text, duracion)

        //listeners para los botones
        bSumar!!.setOnClickListener {
            //comprobacion
            if (num1!!.text.toString() == "" || num2!!.text.toString() == "") {
                //mensaje al ser vacio algun numero
                toast.show()
            } else {
                //edicion del resultado segun los valores dados
                total!!.text = "" + sumar(num1!!.text.toString().toInt(), num2!!.text.toString().toInt())
            }
        }
        bRestar!!.setOnClickListener {
            //comprobacion
            if (num1!!.text.toString() == "" || num2!!.text.toString() == "") {
                //mensaje al ser vacio algun numero
                toast.show()
            } else {
                //edicion del resultado segun los valores dados
                total!!.text = "" + restar(num1!!.text.toString().toInt(), num2!!.text.toString().toInt())
            }
        }
        bMulti!!.setOnClickListener {
            //comprobacion
            if (num1!!.text.toString() == "" || num2!!.text.toString() == "") {
                //mensaje al ser vacio algun numero
                toast.show()
            } else {
                //edicion del resultado segun los valores dados
                total!!.text = "" + multi(num1!!.text.toString().toInt(), num2!!.text.toString().toInt())
            }
        }
        bDivi!!.setOnClickListener {
            //comprobacion
            if (num1!!.text.toString() == "" || num2!!.text.toString() == "") {
                //mensaje al ser vacio algun numero
                toast.show()
            } else {
                //edicion del resultado segun los valores dados
                total!!.text = "" + divid(num1!!.text.toString().toInt(), num2!!.text.toString().toInt())
            }
        }
    }
}