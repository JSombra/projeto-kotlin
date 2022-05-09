open class NovoCliente(
    val nome: String,
    val cpf: String,
    var idade: Int,
    val codigoDoCliente: Int,
    var valorEmConta: Double,
    val email: String,
    var senha: Int
) {
    var codigoDoProduto = (0..3).random()

    fun alteraSenha(novaSenha: Int): Unit {
        if (novaSenha == this.senha) {
            println("A nova senha cadastrada, e igual a senha padrao. Favor inserir uma senha diferente")
        } else {
            this.senha = novaSenha
            println("Senha alterada com sucesso, sua nova senha e $novaSenha")
        }
    }

    fun autentica(senhaDigitada: Int): Unit {
        if (senhaDigitada == this.senha){
            println("-------------------")
            println("Cliente Autenticado")
            println("-------------------")
        } else {
            println("-------------------------")
            println("Senha digitada incorreta.")
            println("-------------------------")
        }
    }
}