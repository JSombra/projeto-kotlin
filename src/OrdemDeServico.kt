import java.io.Serializable
open class OrdemDeServico(
    val cliente: NovoCliente,
) {
    fun produtoReferenteAoCodigo(codigoDoProduto: Int, valorEmConta: Double): Unit{

        val produto = arrayListOf<String>("Notebook", "Tablet", "Celular", "Monitor")
        val valorProduto = arrayListOf<Int>(5000, 2000, 6000, 900)
        val valorRetornado = arrayListOf<Any>(produto[codigoDoProduto], valorProduto[codigoDoProduto])


        if (valorEmConta >= valorProduto[codigoDoProduto]) {
            println("Produto pode ser comprado. Valor em conta e suficiente")
        } else {
            println("Nao possui valor para comprar o produto.")
        }

        println("------------------")
        println("Produto: ${produto[codigoDoProduto]}")
        println("Valor: R$ ${valorProduto[codigoDoProduto]}")
        println("------------------")
    }
}