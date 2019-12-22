package com.shelley


fun main() {

//    Human().hello();  //在Kotlin呼叫建構子不需要再寫new，直接寫Human()就可以產生一個物件，然後也可以直接呼叫他的方法。
    val h = Human();
    h.hello();

}



class Human{

    //Kotlin的function 回傳值不需要寫在方法的名稱(hello)前面，當你不回傳任何資料，void不用寫。
    fun hello(){

        println("hello Kotlin")

    }
}