fun main() {
    val i:String=("ウマ娘")
    val e:String=("ノットウマ娘")
    val umalist = arrayOf("spe", "suzuka", "toukai")
    print("入力してください:")

    val UmaName = readLine()
    if (umalist[0]==UmaName){
        println(i)

    }
    else if(umalist[1]==UmaName){
        print(i)
    }
    else if(umalist[2]==UmaName){
        print(i)
    }
    else{
        print(e)
    }

}
