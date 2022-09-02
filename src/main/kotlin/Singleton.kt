
object PlayerPicher {
    var speed = 150
        private set
    var controll = "C"
        private set

    fun MuscleTraining(name: String) {
        speed = speed + 10
        println("${name}の球速が10キロアップして、最速${speed}キロになった。")
    }

    fun ControllTraining(name: String) {
        controll = "A"
        println("${name}のコントロールが${controll}評価になった。")
    }
}

class Otani {
    val name = "大谷"
    fun Training() {
        PlayerPicher.MuscleTraining(name)
        PlayerPicher.ControllTraining("大谷翔平")
    }


}

fun main() {
    val otani = Otani()

    otani.Training()

    println("3回目のコミット")
}

