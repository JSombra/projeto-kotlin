fun testaExemplo() {
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 10) break@loop
        }
    }
}

fun loopsDeRepeticao() {
    for (i in 10 downTo 1 step 2) {
        val nome = "Jefferson $i"
        val codigoCliente = 120 + i
        var idade = (18..80).random()
        var codigoDoProduto = (1..4).random()
        var valorAPagar = 0

        println("O seu codigo de cliente e $codigoCliente")
        println("Bem vindo $nome")
        println("Sua idade e $idade")
        when (codigoDoProduto) {
            1 -> {
                println("Produto Selecionado: Celular")
                valorAPagar = 4500
                println("Valor a ser pago: R$$valorAPagar")
            }
            2 -> {
                println("Produto Selecionado: Tablet")
                valorAPagar = 2200
                println("Valor a ser pago: R$$valorAPagar")
            }
            3 -> {
                println("Produto Selecionado: Notebook")
                valorAPagar = 8000
                println("Valor a ser pago: R$$valorAPagar")
            }
            4 -> {
                println("Produto Selecionado: Monitor")
                valorAPagar = 1000
                println("Valor a ser pago: R$$valorAPagar")
            }
        }
        println("")
    }
}