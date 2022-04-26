package com.example.kotlinparapricipiantes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // leccion 1
        //variablesYConstantes()

        // leccion 2
        //tiposDeDatos()

        // leccion 3
        //sentenciaIf()

        // leccion 4
        //sentenciaWhen()

        // leccion 5
         //arrays()

        // leccion 6
           // maps()

        // leccion 7
        //loops()

        //leccion 8
        //nullSafety()

        //leccion 9
        //funciones()

        // leccion 10
        classes()
    }
    /*
    aqui vamos hablamos de variables y comentarios
     */
    private fun variablesYConstantes(){
        // variable

        var myFirstVariable = "hello jeison"
        println(myFirstVariable)

        myFirstVariable = "bienvenidos"
        println(myFirstVariable)

        // no podemos asignarle un tipo int a una variable de cadena de texto
        //myFirstVariable = 1
        var mySecondVariable = "suscribete"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable
        println(mySecondVariable)

        myFirstVariable = "¿ya te has suscrito?"
        println(myFirstVariable)

        // constante

        val myFirstConstante = "¿te ha gustado el tutorial?"
        println(myFirstConstante)

        // una constante no puede modificar su valor
        //myFirstConstante  = "si te ha gustado, dale like "
        //pintln(myFirstConstante)

        val mySecondConstante = myFirstConstante
        println(mySecondConstante)

    }
    /*
    aqui veremos tipos de datos
     */
    private fun tiposDeDatos(){
        //String
        val myString: String = "hola jeison"
        val myString2 = " bienvenido a este curso"
        val myString3: String = myString + myString2
        println(myString3)

        // tipo de datos entero (Byte, Start, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        val myInt3: Int = myInt + myInt2
        println(myInt3)

        // tipo de dato decimal (Float, Double)
        val myFloat:  Float = 1.5f
        val myDouble: Double =1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4: Double = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // tipo de dato (boolean)
        val myBool:  Boolean = true
        val myBool2 = false
        // el tipo de dato boolean no se puede sumar, y se utiliza de manera logica
        // val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)












    }
    // aqui vamos hablar de if
    private fun sentenciaIf() {
        val myNumber= 70
        // operadptres condicionales
        //> mayor que
        //< menor que
        //> = mayor o igual que
        //< = menor o igual que
        //== igualdad
        // != desigual

        // operadores logicos
        // && operador "y"
        // || operador "o"
        // ! operador "no"
        if (!(myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            // sentencia if
            println("$myNumber es menor o igual a 10 y mayor que 5 o es igual a 53")
        } else if (myNumber == 60) {
            // sentencia else if
            println("$myNumber es igual a 60")

        } else if (myNumber != 70) {
            // sentencia if
            println("$myNumber es igual a 70")

        } else {
            //sentencia else
            println("$myNumber es mayor que 10 o igual 5 y no es igual a 53")
        }
        /* aqui vamos hablar de la sintasis whe
         */
    }
    fun  sentenciaWhen() {
        val country = "España"
        // when con String
        when (country) {
            "España" -> {
                println("el idioma es Espñol")
            }
            "Mexico" -> {
                println("el idioma es Español")
            }
            "Peru" -> {
                println("el idioma es Español")
            }
            "Colombia" -> {
                println("el idioma es Español")
            }
            "Argentina" -> {
                println("el idioma es Español")
            }
            "EEUU" -> {
                println("el idioma es Ingles")
            }
            "Francia" -> {
                println("el idioma de este pais es Frances")
            }
            else -> {
                println("no conocemos el idioma")
            }

        }
        // when int
        val age: Int = -10
        when (age) {
            0, 1, 2 -> {
                println("Eres un bebe")
            }
            in 3..10 -> {
                println("Eres un niño")
            }
            in 11..17 -> {
                println("Eres un adolecente")
            }
            in 18..69 -> {
                println("Eres un adulto")
            }
            in 70..99 -> {
                println("Eres un anciano")
            }
            else -> {
                println(":)")
            }
        }
    }
    /*aqui vamos hablar arrays o arreglos
        */
    fun arrays() {
        val name = "jeison"
        val surname = "Zapata"
        val company = "Omnitempus"
        val age = "29"
        // creacion de array
        val myArray: ArrayList<String> = arrayListOf<String>()
        // añadir datos deuno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)
        println(myArray)

        // Añadir un conjunto de datos

        myArray.addAll(listOf("hola", "bienvenido al tutorial"))

        println(myArray)

        // acceso a datos
        val myCompany: String = myArray[2]
        println(myCompany)

        // modificacion de datos
        myArray[5] = "suscribete y activa la campana"
        println(myArray)

        // eliminar datos
        myArray.removeAt(4)
        println(myArray)

        // recorrer datos
        myArray.forEach {
            println(it)
        }
        // otras
        println(myArray.count())
        //myArray.clear()
        println(myArray.count())

        println(myArray.first())
        println(myArray.last())
        println(myArray.sort())
    }
    // aqui vamos hablar de mapas tambien llamados dicionarios
    fun maps() {
        var myMap: Map<String, Int> = mapOf()
        println(myMap)
        //añadir elementos
        myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)
        println(myMap)

        // añadiendo un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria", 8)
        println(myMap)

        // Actualizacion de dato
        myMap.put("Brais", 3)
        myMap["Brais"] = 4
        println(myMap)
        myMap.put("Marcos", 3)
        println(myMap)

        // Acceso a un dato
        println(myMap["Brais"])

        // Eliminaciion de datos
        myMap.remove("Brais")
        println(myMap)

    }
    //Aqui vamos hablar de loops, tambien lamados bucles
    private fun loops(){

        //bucles

        val myArray: List<String> = listOf("hola", "bienvenido al tutorial", "bienbenido")
        val myMap: MutableMap<String,Int> = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)

        //For
        for(myString in myArray){
            println(myString)
        }
        //for(myString in myMap){
         //   println(myString)
       //
        //
        // }
        for(myElement: MutableMap.MutableEntry<String,Int> in myMap){
            println ("${myElement.key}-${myElement.value}")
        }
        for(x: Int in 0..10){
            println(x)
        }
        for(x: Int in 0 until 10){
            println(x)
        }
        for(x:Int in 0..10 step 2){
            println(x)
        }
        for(x:Int in 10 downTo 0){
            println(x)
        }
        for(x:Int in 10 downTo 0 step 3){
            println(x)
        }
        val myNumericArray: IntRange = (0..20)
        for(myNum:Int in myNumericArray){
            println(myNum)
        }
     //while
        var x = 0
        while(x < 10){
            println(x)
            x++
        }

    }
    // aqui vamos hablar de seguridad contra nulos (null safety)
    fun nullSafety() {
        val myString = "MoureDev"
        //myString = null Esto daria un error de compilacion
        println(myString)

        // variable null safety
        var mySafetyString: String? = "MoureDev null safety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "suscribete"
        //println(mySafetyString)

        /*if (mySafetyString != null){
         println(mySafetyString!!)
         } else {

         println(mySafetyString)
         }*/

        // safe call

        println(mySafetyString?.length)

        mySafetyString.let {
            println(it)
        } ?: run {
            println(mySafetyString)
        }
    }

    //aqui vamos hablar de funciones
    fun funciones(){
        sayhello()
        sayhello()
        sayhello()

        sayMyName("Brais")
        sayMyNameAndAge("jeison",32)

        val sumResult: Int = sumTwoNumbers(5,10)
         println(sumResult)

        println(sumTwoNumbers(15,9))
        println(sumTwoNumbers(10,sumTwoNumbers(5,5)))
    }

    //funcion simple
    fun sayhello(){
        println("hola")
    }
    // funciones con un parametro de entrada
    fun sayMyName(name: String){
        println("hola, mi nombre es $name")
    }

    // funciones con mas  un parametro de entrada
    fun sayMyNameAndAge(name:String,age:Int){
    println("hola, mi nombre es $name y mi edad es $age")
    }

    // funciones con un valor de retorno
    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) : Int{
        val sum: Int = firstNumber + secondNumber
        return sum
    }

    /*aqui hablaremos de clases*/
    fun classes(){
        val brais = programmer("brais",32, arrayOf(programmer.language.KOTLIN,programmer.language.SWIFT),null)
        println(brais.name)
        brais.age= 40
        brais.code()

        val sara = programmer("sara",35, arrayOf(programmer.language.JAVA), arrayOf(brais))
        sara.code()
        println("${sara.friends?.first()?.name} es amigo de $sara.name")
    }
}   //hacer ensayo


