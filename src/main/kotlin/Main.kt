fun main() {

    val likes: Int = 55

    val man = "человек"
    val people = "человека"

    if ((likes % 10) in 2..4 && !(likes % 100 in 12..14)) {
        println("$likes $people поставили лайк")
    } else {
        println("$likes $man поставили лайк")
    }

}