fun main(args: Array<String>) {

    val nathan = Player("Nathan")
    val louise = Player("Louise", 5)
    val donkeyman = Player("Donkey Man", 4, 8)
    val pringle = Player("Pringle", 2, 5, 1000)

    val axe = Weapon("Axe", 17)
    val spear = Weapon("Spear", 15)
    val maul = Weapon("Maul",20)
    val bow = Weapon("Bow", 12)

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    nathan.inventory.add(redPotion)
    nathan.showInventory()

    nathan.weapon = axe
    nathan.show()
    //println("His ${nathan.weapon.name} does ${nathan.weapon.damageInflicted} damage.")
    println(nathan)

    louise.weapon = spear
    louise.show()
    //println("Weapon: ${louise.weapon.name}")
    //println("Weapon damage: ${louise.weapon.damageInflicted}.")
    println()

    donkeyman.weapon = maul
    donkeyman.show()
    //println("Weapon: ${donkeyman.weapon.name}.")
    //println("Weapon")
    println()

    pringle.weapon = bow
    pringle.show()
   // println("Weapon: ${pringle.weapon.name.toUpperCase()}")
   // println("Weapon damage: ${pringle.weapon.damageInflicted}")
    println()






    println()


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