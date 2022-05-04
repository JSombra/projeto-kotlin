class OrdemDeServicoFidelidade(
    clienteFidelidade: ClienteFidelidade
): OrdemDeServico(cliente = clienteFidelidade){

    fun produtoReferenteAoCodigoFidelidade(codigoDoProduto: Int, valorEmConta: Double) {

        val produto = arrayListOf<String>("Notebook", "Tablet", "Celular", "Monitor")
        val valorProduto = arrayListOf<Int>(5000, 2000, 6000, 900)

        fun desconto(): Int {
            var valorAPagar = valorProduto[codigoDoProduto]
            when {
                valorAPagar >= 5000 -> {
                    return valorAPagar - 1270
                }
                valorAPagar >= 2000 && valorAPagar < 4000 -> {
                    return valorAPagar - 710
                }
                else -> {
                    return valorAPagar - 433
                }
            }
        }
        if (valorEmConta >= desconto()) {
            println("Produto pode ser comprado. Valor em conta e suficiente. ")
        } else {
            println("Nao possui valor para comprar o produto.")
            println("Valor em conta R$ $valorEmConta")
        }
        println("--------------------------------")
        println("Produto: ${produto[codigoDoProduto]}")
        println("Valor: R$ ${desconto()}")
        println("--------------------------------")
    }
}