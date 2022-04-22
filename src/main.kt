fun main() {
    testaExemplo()
    testaCondicoes(1.0)
    loopsDeRepeticao()
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("A Conta e positiva")
        saldo == 0.0 -> println("A conta esta zerada")
        else -> println("A conta esta negativa")
    }
}

fun testaExemplo(){
    loop@for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 10) break@loop
        }
    }
}

fun loopsDeRepeticao(){
    for (i in 1..5) {
        val nome = "Jefferson $i"
        val codigoCliente = 120 + i
        var saldo = 0.0 + i

        println("Bem vindo $nome")
        println("O seu codigo de cliente e $codigoCliente")
        println("Seu saldo e $saldo")
        println("Titular da conta $nome")
        println("")
    }

    for (i in 10 downTo 1) { // com o downTo, ele faz a mesma coisa que o for comentado acima, porém no sentido oposto, do 10 até o 1
        val nome = "Jefferson $i"
        val codigoCliente = 120 + i
        var saldo = 0.0 + i

        println("Bem vindo $nome")
        println("O seu codigo de cliente e $codigoCliente")
        println("Seu saldo e $saldo")
        println("Titular da conta $nome")
        println("")
    }
    var i = 0
    while (i <= 10){
        val nome = "Jefferson $i"
        val codigoCliente = 120 + i
        var saldo = 0.0 + i

        println("Bem vindo $nome")
        println("O seu codigo de cliente e $codigoCliente")
        println("Seu saldo e $saldo")
        println("Titular da conta $nome")
        println("")
        i++ //no while, precisa incrementar o i no final do bloco
    }
}