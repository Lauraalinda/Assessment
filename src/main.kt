fun main (){
    text("codeHive")
    var x=modulus(13 ,2)
    println(x)
    var p=par("laura" , 21)
    println(p)
    var k=len("kengaaju")
    println(k)

}

fun text(word:String) {
    var h = word[4].toString() + word[5] + word[6] + word[7]
    println(h)
}

fun modulus(num1:Int ,num2:Int):Int{
    var m=num1%num2
    return(m)
}

fun par(p:String ,z:Int):String {
    var o = "Hi, my name is $p and I am $z years old."
    return o

}

fun len(j:String):Int{
    var l=j.length
    return l
}