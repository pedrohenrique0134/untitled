
fun cadastrar(email:String, password:String):String{
     return when{
             email.isBlank() && password.isBlank() -> "Preencha todos los campos"
             email.isBlank() -> "digite um email"
             password.isBlank() -> "digite uma senha"

            else -> "email cadastrado com sucesso"
     }
}

fun main(){
    var email = ""
    var password = "123456"

    var resu = cadastrar(email,password)
    println(resu)
}
