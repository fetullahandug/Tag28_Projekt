fun main(){
    var adler = Eagle(12.5)
    var pinguin = Penguin(5.75)

    println("Kann der Adler fliegen ? -> ${adler.canFly}")
    println("Kann der Pinguin fliegen ? -> ${pinguin.canFly}")
    println()

    adler.fly()
    pinguin.waddle()
}