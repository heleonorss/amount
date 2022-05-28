fun main (){
    val amount = 1_000_000
    val percentageCommission = 0.0075
    val minAmountCommission = 3500
    val amountCommission = if (amount * percentageCommission > minAmountCommission) amount * percentageCommission else minAmountCommission
    println("Комиссия за перевод составит: $amountCommission копеек")
}
