fun testaOrdemDeServico() {
    val cliente = Cliente(
        nome = "Jefferson",
        cpf = "111.222.444-99",
        idade = 22,
        codigoDoCliente = 1,
        valorEmConta = 1000.0,
        email = "jefferson@jefferson.com"
    )
    val cliente2 = Cliente(
        nome = "Raquel",
        cpf = "222.555.111-22",
        idade = 24,
        codigoDoCliente = 1,
        valorEmConta = 1000.0,
        email = "raquel@raquel.com"
    )

    val ordem1 = OrdemDeServico(cliente)
    val ordem2 = OrdemDeServico(cliente2)

    println(ordem1.cliente.nome)
    println(ordem1.cliente.idade)
    println(ordem1.cliente.codigoDoCliente)
    ordem1.produtoReferenteAoCodigo(ordem1.codigoDoProduto, ordem1.cliente.valorEmConta)
    ordem1.alteraSenha(novaSenha = "0001")

    println(ordem2.cliente.nome)
    println(ordem2.cliente.idade)
    println(ordem2.cliente.codigoDoCliente)
    ordem2.produtoReferenteAoCodigo(ordem2.codigoDoProduto, ordem2.cliente.valorEmConta)
    ordem2.alteraSenha("0002")
}