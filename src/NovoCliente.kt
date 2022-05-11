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

    fun autentica(senhaDigitada: Int): String {
        if (senhaDigitada == this.senha){
            return "Autenticado"
        }
        return "Senha Incorreta"
    }
}