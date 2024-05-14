class Pessoa(var nome: String, var idade: Int, var altura: Double){
            fun imprimir(){
                println("Nome: $nome\nIdade: $idade anos\nAltura: $altura m")
            }
    }
   
   fun main(){
       var Gabriel = Pessoa("Gabriel Chiarelli", 17, 1.80)
       Gabriel.imprimir()
   }
