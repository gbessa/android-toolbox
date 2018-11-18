package br.com.hoptech.androidtoolbox

open class Citizen {

    fun haveToPayTaxes() {
        println("Every citizen has to pay taxes")
    }

}

interface President {

    fun winElection()

}

class Gustavo : Citizen(), President, BeFather {

    override fun winElection() {
        println("Win an election in Brazil")
    }

    override fun haveChildren(numberOfChildren: Int) {
        println("Have $numberOfChildren children")
    }

}

class Trump : Citizen(), President {

    override fun winElection() {
        println("Win an election in the USA")
    }

}

interface BeFather {

    fun haveChildren(numberOfChildren: Int)

}

fun main(args: Array<String>) {

    val gustavo = Gustavo()
    gustavo.haveToPayTaxes()
    gustavo.winElection()
    gustavo.haveChildren(1)

    val trump = Trump()
    trump.winElection()

}