fun main() {
    testaCopiasEReferencias()
}

class OrdemDeServico() {
    var nome = ""
    var codigoCliente = 1
    var idade = (18..80).random()
    var codigoDoProduto = (0..3).random()
    var valorEmConta = 0.0
    var valorAPagar = 0
    var senha = "0000"


    fun produtoReferenteAoCodigo(codigoDoProduto: Int, valorEmConta: Double) {

        val produto = arrayListOf<String>("Notebook", "Tablet", "Celular", "Monitor")
        val valorProduto = arrayListOf<Int>(5000, 2000, 6000, 900)

        var produtoSelecionado = produto[codigoDoProduto]
        var valorProdutoSelecionado = valorProduto[codigoDoProduto]
        if (valorEmConta >= valorProduto[codigoDoProduto]){
            println("Produto pode ser comprado. Valor em conta e suficiente")
        } else {
            println("Nao possui valor para comprar o produto.")
        }

        println("--------Produto Selecionado-------")
        println("Produto: $produtoSelecionado")
        println("Valor: R$ $valorProdutoSelecionado")
        println("----------------------------------")
    }

    fun alteraSenha(novaSenha: String) {
        if (novaSenha == this.senha) {
            println("A nova senha cadastrada, e igual a senha padrao. Favor inserir uma senha diferente")
        } else {
            this.senha = novaSenha
            println("Senha alterada com sucesso, sua nova senha e $novaSenha")
        }
    }
}

fun testaCopiasEReferencias() {
    val ordem = OrdemDeServico()
    ordem.nome = "Jefferson"
    ordem.idade = 22
    ordem.codigoCliente = 1
    ordem.valorEmConta = 900.0


    val ordem2 = OrdemDeServico()
    ordem2.nome = "Raquel"
    ordem2.idade = 24
    ordem2.codigoCliente = 2
    ordem2.valorEmConta = 3000.0


    println(ordem.nome)
    println(ordem.idade)
    println(ordem.codigoCliente)
    ordem.produtoReferenteAoCodigo(ordem.codigoDoProduto, ordem.valorEmConta)
    println("-----------")
    ordem.alteraSenha("0001")
    println("-----------")

    println(ordem2.nome)
    println(ordem2.idade)
    println(ordem2.codigoCliente)
    ordem2.produtoReferenteAoCodigo(ordem2.codigoDoProduto, ordem2.valorEmConta)
    println("-----------")
    ordem2.alteraSenha("0002")
    println("-----------")
}

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