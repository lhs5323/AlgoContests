import java.io.BufferedReader

fun main() {
  val br = System.`in`.bufferedReader()
  val t = br.readLine()
  repeat(t.toInt()){
    val n = br.readLine()
    var arr = readLine()!!.split(' ')
    println("${n.javaClass}")
    println("${arr.javaClass}")
  }
}
