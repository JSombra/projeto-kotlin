class OrdemDeServico(
    val cliente: Cliente,
) {
    var codigoDoProduto = (0..3).random()
    var valorAPagar = 0
    var senha = "0000"
        private set

    fun produtoReferenteAoCodigo(codigoDoProduto: Int, valorEmConta: Double) {

        val produto = arrayListOf<String>("Notebook", "Tablet", "Celular", "Monitor")
        val valorProduto = arrayListOf<Int>(5000, 2000, 6000, 900)

        fun desconto(): Int {
            var valorAPagar = valorProduto[codigoDoProduto]
            when {
                valorAPagar >= 5000 -> {
                    return valorAPagar - 1270
                }
                valorAPagar >= 2000 && valorAPagar < 5000 -> {
                    return valorAPagar - 710
                }
                else -> {
                    return valorAPagar - 433
                }
            }
        }

        if (valorEmConta >= desconto()) {
            println("Produto pode ser comprado. Valor em conta e suficiente")
        } else {
            println("Nao possui valor para comprar o produto.")
        }
        


        println("--------Produto Selecionado-------")
        println("Produto: ${produto[codigoDoProduto]}")
        println("Valor: R$ ${desconto()}")
        println("----------------------------------")
    }

    fun autentica(senha: Int){

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