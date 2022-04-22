fun main (){
    val nome = "Jefferson"
    val codigoCliente = 1592
    var saldo = 0.0
    saldo += 1
    println("Bem vindo $nome")
    println("O seu codigo de cliente e $codigoCliente")
    println("Seu saldo e $saldo")

    when {
        saldo > 0.0 -> println("A Conta e positiva")
        saldo == 0.0 -> println("A conta esta zerada")
        else -> println("A conta esta negativa")
    }
}