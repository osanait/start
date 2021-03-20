class Umamusume(val name: String, var inputName : String) {

    fun judge(data: Array): String {
        var write: String
        if (name == inputName) {
            println(name)
            println("芝")
            println(data[1])
            println("ダート")
            println(data[2])
            println("短距離")
            println(data[3])
            println("マイル")
            println(data[4])
            println("中距離")
            println(data[5])
            println("長距離")
            println(data[6])
            println("逃げ")
            println(data[7])
            println("先行")
            println(data[8])
            println("差し")
            println(data[9])
            println("追込")
            println(data[10])
        }
        return write
    }
}

fun main(){
    println("ウマ娘の名前入力してください")
    val inputName= readLine()
    var a001=Umamusume("supe","inputName")
    var data = arrayOf("A","G","F","C","A","A","G","A","A","C")
    var write=a001.judge(data)
    println(write)
    }
