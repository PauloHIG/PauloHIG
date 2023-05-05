fun main() {
	val caruso = Pessoa("Caruso")
	val zeh = Pessoa("Zé")
    val jerome = Pessoa("Jerome")
	val chris = Pessoa("Chris")
    val todoMundo = mutableListOf<Pessoa>(caruso,zeh,jerome)
    
    infix fun List<Pessoa>.odeia(pessoa:Pessoa){
        for(odiador in todoMundo){
            odiador odeia pessoa
        }
    }
    todoMundo odeia chris
    println(chris.odiadoPor[2].nome)
}


class Pessoa(val nome:String){
    val odiadoPor = mutableListOf<Pessoa>()
    infix fun odeia(outro: Pessoa){outro.odiadoPor.add(this)}
}
