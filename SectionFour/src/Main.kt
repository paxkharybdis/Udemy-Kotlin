fun main(args: Array<String>) {

    val nathan = Player("Nathan")
    val louise = Player("Louise", 5)
    val donkeyman = Player("Donkey Man", 4, 8)
    val pringle = Player("Pringle", 2, 5, 1000)

    nathan.show()
    println()
    louise.show()
    println()
    donkeyman.show()
    println()
    pringle.show()
    println("Weapon: ${pringle.weapon.name.toUpperCase()}")
    println("Weapon damage: ${pringle.weapon.damageInflicted}")




/* <Description: Extra>
    println("How many lives are left?")
    val lives = readLine()!!.toInt()
    println("You have $lives left?")

    var isGameOver = (lives < 1)
    println(isGameOver)  // Treats as boolean type and prints TRUE or FALSE

    if (isGameOver) {
        println("Game over!")
    } else {
        println("You're still alive!")
    }

    println("How old are you: ")
    val age = readLine()!!.toInt()
    println("Your age is $age.")

    val message: String
    message = if (age < 18) {
        "You're too young to vote"
    } else if (age == 100) {
        "Congratulations"
    } else {
        "You can vote."
    }
    println(message)

    val message2: String
    message2 = when {
        age < 18 -> "You're too young to vote!"
        age == 100 -> "Congratulations!"
        else -> "You are old enough to vote."
    }
    println(message)
    */
}