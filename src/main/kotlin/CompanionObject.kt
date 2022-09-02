import java.util.Random

class Taiyakiya() {
    companion object Taiyaki{
        val Tubuan = "つぶあん"
        val Koshian = "こしあん"
        val Custard = "カスタード"

        fun TubuanYaku(nakami: String = "つぶあん") {
            println("${nakami}が焼けました。")
        }
        fun KoshianYaku() {
            println("${Koshian}が焼けました。")
        }
        fun CustardYaku() {
            println("${Custard}が焼けました。")
        }

        fun RandomYaku() {
            var nakami = arrayOf(Tubuan, Koshian, Custard)
            var num = Random().nextInt(nakami.count())

            var nakamiText = nakami.get(num)
            println("${nakamiText}が焼けました")
        }
    }
}

fun main() {
    Taiyakiya.TubuanYaku()
    Taiyakiya.KoshianYaku()
    Taiyakiya.CustardYaku()
    Taiyakiya.RandomYaku()
}

