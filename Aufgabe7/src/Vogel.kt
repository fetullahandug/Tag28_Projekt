open class Vogel{
    var weight: Double
    var canFly: Boolean

    constructor(weight: Double, canFly: Boolean){
        this.weight = weight
        this.canFly = canFly
    }

    fun makeNoise(){
        println("wuick wuick")
    }
}