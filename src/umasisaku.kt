class Umamusume( name: String) {
    var name=name
    fun avg(siba: String,dato:String){
        println("芝")
        println(siba)
        println("ダート")
        println(dato)
    }



    }
fun main(){
    println("名前を入力してください")
    var inputName = readLine()
    var a001=Umamusume("supe")
    var a002=Umamusume("gorusi")
if(inputName==a001.name){
    a001.avg("A","C")
}
    else if(inputName==a002.name){
        a002.avg("A","G")
    }
    else{
        println("ノットウマ娘")
    }
}
