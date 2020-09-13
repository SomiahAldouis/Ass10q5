interface Virus {
    fun mutate()
    fun spread() {
        println("Spreading the virus is danger and must be to stay home *___*")
    }
}
class CoronaVirus: Virus {
    override fun mutate() {

        println("Mutating the corona virus (today virus)")
    }
}

class InfluenzaVirus: Virus {
    override fun mutate() {
        println("Mutating the flu virus")
    }
}

class HIVVirus: Virus {
    override fun mutate() {
        println("Mutating the HIV virus")
    }
}
enum class VirusType {
    CORONA_VIRUS, INFLUENZA, HIV
}
class VirusFactory {
    fun makeVirus(type: VirusType): Virus? {
        return when(type) {
            VirusType.CORONA_VIRUS -> CoronaVirus()
            VirusType.INFLUENZA -> InfluenzaVirus()
            VirusType.HIV -> HIVVirus()
            else -> null
        }
    }
}
fun main() {
    val factory = VirusFactory()
    val virus1 = factory.makeVirus(VirusType.CORONA_VIRUS)
    virus1?.run {
        spread()
        mutate()

    }
    val virus2 = factory.makeVirus(VirusType.HIV)
    virus2?.run {
        spread()
        mutate()
    }
    val virus3 = factory.makeVirus(VirusType.INFLUENZA)
    virus3?.run {
        spread()
        mutate()
    }

}