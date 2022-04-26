package com.example.kotlinparapricipiantes

class programmer(val name: String,
                 var age: Int,
                 val languages: Array<language>,
                 val friends: Array<programmer>? = null) {

    enum class language{
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT

    }

    fun code(){
        for(language: language in languages){
            println("Estoy programando en $language")
        }
    }
}