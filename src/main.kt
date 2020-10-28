fun main() {
    val koord= Point()
    koord.abscissa = 3F
    koord.ordinate = 6F
    println(koord.toString())
    println(koord.abscissa == koord.ordinate)

    val about  = Triangle(height = koord.abscissa,base = koord.ordinate)
    println(about.getArea())
}

interface IFigure {

    fun getArea():Float
}

class Point {
    var abscissa: Float = 3F
    var ordinate: Float = 6F

    override fun equals(other: Any?): Boolean {
        if (other is Point)
            if (abscissa > ordinate) {
                return true
            }
        return false
    }

    override fun toString(): String {
        return "x=${abscissa}, y=${ordinate} "
    }
}
class Triangle(private val height: Float, private val base: Float):IFigure{
    override fun getArea(): Float {
        return height*base/2
    }
}

