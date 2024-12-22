fun main() {
    val amount = 1000000
    val commissionProcent = 0.0075
    val calculationCommis = amount * commissionProcent
    val minCommis = 35.0
    if (calculationCommis < minCommis) {
        println(minCommis)
    } else
        println(calculationCommis)
}