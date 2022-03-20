fun main (){
    val amount = 12500_00
    val commission = 75
    val minCommission = 3500

    val sumCommission = (amount * commission) / 10000

    if (sumCommission > minCommission) print("Commission: $sumCommission pennies") else print("Comission: $minCommission pennies")
        //93_75
}
