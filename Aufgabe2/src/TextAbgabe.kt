class Car {
    var color: String
    var speed: Int

    constructor(color: String, speed: Int) {
        this.color = color
        this.speed = speed
    }

    fun showOff() {
        println(
            "Mein Auto ist das coolste! Es ist " + color +
                    " und " + speed + " kmh schnell!"
        )
    }

    fun drive() {
        if (speed > 180) {
            println("Du wurdest geblitzt!")
        } else {
            println("Du wurdest nicht geblitzt.")
        }
    }
}

/*
    Selbe Klasse wie vorhin diesmal mit der Funktion showOff() die das Auto auch mit der Höchstgeschwindigkeit präsentiert
*/