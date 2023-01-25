class Airplane{
    var amountTurbines: Int
    var flyingSpeed: Int
    var isAirborne: Boolean = false

    constructor(at: Int, fs: Int) {
        this.amountTurbines = at
        this.flyingSpeed = fs
    }

    fun takeOff(){
        if(this.flyingSpeed >= 250){
            println("Das Flugzeug ist bereits am fliegen!")
        }else{
            this.isAirborne = true
            this.flyingSpeed = (250..1050).random()
            println("Das Flugzeug fliegt jetzt!")
        }
    }

    fun land(){
        if(this.flyingSpeed >= 250){
            this.isAirborne = false
            this.flyingSpeed = 0
            println("Das Flugzeug wurde nun gelandet!")
        }else{
            println("Das Flugzeug ist bereits auf dem Boden!")
        }
    }
}