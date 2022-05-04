fun testaClientes() {
    val cliente = NovoCliente(
        nome = "Jefferson Cliente",
        cpf = "111.222.444.22",
        idade = 22,
        codigoDoCliente = 1,
        valorEmConta = 3000.0,
        email = "sombra@sombra.com",
        senha = 1456
    )

    val fidelidade = ClienteFidelidade(
        nome = "Raquel Fidelidade",
        cpf = "111.333.444.22",
        idade = 24,
        codigoDoCliente = 2,
        valorEmConta = 2000.0,
        email = "raquel@sombra.com",
        senha = 1223
    )
    val ordem = OrdemDeServico(cliente)
    val ordemF = OrdemDeServicoFidelidade(fidelidade)


    cliente.codigoDoProduto = (0..3).random()
    println(cliente.nome)
    println(cliente.cpf)
    println(cliente.email)
    cliente.alteraSenha(5512)
    println(cliente.autentica(5512))
    println(ordem.produtoReferenteAoCodigo(cliente.codigoDoProduto, cliente.valorEmConta))

    fidelidade.codigoDoProduto = (0..3).random()
    println(fidelidade.nome)
    println(fidelidade.cpf)
    println(fidelidade.email)
    fidelidade.alteraSenha(1111)
    println(fidelidade.autentica(2222))
    println(ordemF.produtoReferenteAoCodigoFidelidade(fidelidade.codigoDoProduto, fidelidade.valorEmConta))






}