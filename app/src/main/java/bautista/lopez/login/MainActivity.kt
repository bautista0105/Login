package bautista.lopez.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val USUARIO_REGISTRADO = "Eduardo"
    val PASS_USUARIO  = "hola123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIngresar.setOnClickListener {
            //Obetenemos los datos de la vista

            val usuario = editTextUsuario.text.toString()
            val pass = editTextPassword.text.toString()


            if (!cadenaVacia(usuario) and !cadenaVacia(pass)){
                //Verificar los datos
                if (verificarDatos(usuario,pass)){
                    mensaje("BIENVENIDO")
                }else{
                    mensaje("Datos Incorrectos")
                }
            }else{
                //Mensaje datos vacios
                mensaje("Datos Vacios")
            }
        }
    }

    fun verificarDatos(usuario:String,pass:String):Boolean{
        return usuario.equals(USUARIO_REGISTRADO) and pass.equals(PASS_USUARIO)
    }

    /*Metodo que nos ayuda a mostrar un Toast*/
    fun mensaje(mensaje:String){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()

    }
    /* Metodo que sirve para verificar que una cadena este vacia*/
    fun cadenaVacia(cadenaVerificar:String):Boolean{
        return cadenaVerificar.isEmpty()
    }



    /*
    1.- Leer usuario
    2.- Leer contraseña
    3.- Verificar que no esten vacios
    4.- Comparar el usuario con un usuario permitido
    5.- Comparar la contraseña con la contraseña del usuario
    6.- Si los datos son correctos damos un mensaje de Bienvenida
      - De lo contrario pedimos otra ves los datos
     */
}
