class Student(name: String){

    var name=name

    fun calAvg(data: IntArray): Int{
        var sum=0
        for(score in data){       //foｒ文で変数in配列にすると配列の中の要素を一つずつ足してくれる
            sum += score
        }
        var avg=sum/ data.count();  //.countで配列の中の要素の数を数えてくれる
        return avg
    }

    fun judge(avg:Int):String{
        var result:String
        if(avg>=60) {
            result = "passed"
        }else{
            result ="faild"
        }
        return result
    }

}

fun main(){
    var a001=Student("sato")
    var data = intArrayOf(70,65,50,10,30)
    var avg=a001.calAvg(data)
    var result=a001.judge(avg)
    println(data.count())
    println(a001.name)
    println(avg)
    println(result)
}
