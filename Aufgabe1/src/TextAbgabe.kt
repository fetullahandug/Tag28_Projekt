class Car {
    var color: String
    var speed: Int

    constructor(color: String, speed: Int) {
        this.color = color
        this.speed = speed
    }

    fun paint(color: String) {
        this.color = color
    }

    fun tune() {
        speed = speed + 10
    }
}

/*
    Eine Klasse Auto (Car) mit einem Konstruktor der die Werte Farbe und Geschwindigkeit initialisiert.
    Eine Funktion in der Klasse, die die Geschwindigkeit um 10 Werte erhöht und eine Funktion die die Farbe des Fahrzeugs ändern kann.
*/

var car: Car = Car("weiss", 150)

car.paint("schwarz")
car.tune()

println(car.color)
println(car.speed)

/*
    Ein Objekt der Klasse Car wird erstellt.
    Die Farbe wird von Weiss zu Schwarz umgeändert
    Das Auto wird getunt, die Leistung also erhöht.
*/