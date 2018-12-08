fun main(args: Array<String>) {
    val tim = Player("Tim")
    tim.show()

    val louise = Player("Louise", 5)
    louise.show()

    val charlie = Player("Charlie", 4, 8, 0)
    charlie.show()

    val denise = Player("Denise", 2, 5, 1000)
    denise.show()

    val lives = 3

    if ( lives < 1) {
        println("Game Over!")
    } else {
        pringln("You're still alive!")
    }
}