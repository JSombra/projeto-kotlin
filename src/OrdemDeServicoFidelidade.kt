class OrdemDeServicoFidelidade(
    clienteFidelidade: ClienteFidelidade
): OrdemDeServico(cliente = clienteFidelidade){

    fun produtoReferenteAoCodigoFidelidade(codigoDoProduto: Int, valorEmConta: Double, fidelidade: Int){

        val produto = arrayListOf<String>("Notebook", "Tablet", "Celular", "Monitor")
        val valorProduto = arrayListOf<Int>(5000, 2000, 6000, 900)

        fun desconto(): Int {
            var valorAPagar = valorProduto[codigoDoProduto]
            if (fidelidade < 5){
                if (valorAPagar > 5000){
                    return valorAPagar - 2120
                } else if (valorAPagar >= 2000 || valorAPagar < 5000){
                    return valorAPagar - 690
                } else {
                    return valorAPagar - 230
                }
            }
            if (fidelidade >= 5){
                if (valorAPagar > 5000){
                    return valorAPagar - 3120
                } else if (valorAPagar >= 2000 || valorAPagar < 5000){
                    return valorAPagar - 1500
                } else {
                    return valorAPagar - 520
                }
            }
            return 0
        }

        if (valorEmConta >= desconto()) {
            println("Produto pode ser comprado. Valor em conta e suficiente. ")
        } else {
            println("Nao possui valor para comprar o produto.")
            println("Valor em conta R$ $valorEmConta")
        }
        println("------------------")
        println("Produto: ${produto[codigoDoProduto]}")
        println("Valor: R$ ${desconto()}")
        println("------------------")
    }
}
