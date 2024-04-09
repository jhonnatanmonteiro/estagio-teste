package com.example.estagiocode

class main {

    fun questao1() {
        var INDICE = 13
        var SOMA = 0
        var K = 0

        while (K < INDICE) {
            K++
            SOMA += K
        }

        println(SOMA)
    }

    fun questao2() {
        val numero = 21

        var anterior = 0
        var atual = 1

        while (atual < numero) {
            val proximo = anterior + atual

            anterior = atual
            atual = proximo
        }

        if (atual == numero) {
            println("$numero pertence à sequência de Fibonacci.")
        } else {
            println("$numero não pertence à sequência de Fibonacci.")
        }
    }


    fun questao5() {
        val str = readLine() ?: "queroavaga"

        var strInvertida = ""

        for (i in str.length - 1 downTo 0) {
            strInvertida += str[i]
        }

        println(strInvertida)
    }





}