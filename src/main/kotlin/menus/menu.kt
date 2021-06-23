

fun menu(username: String) {
    println("Welcome, " + username)

    println("Start game")

    if (saves != 0) {
        println("Load game")
    } else { }

    println("Options" + "\n" + "Exit game")
    if (readLine() == "Options") {
        showOptions(username)
    } else {

    }
    if (readLine() == "Start") {
        loadScreenToGame(username)
        println("Starting..")
    } else {
        println("DEBUG")
    }
}
