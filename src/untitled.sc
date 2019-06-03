import Main.calculateNumber

val varUnica = 123

val var1: Int = (varUnica / 10000)
val var2: Int = (varUnica / 1000) - (var1 * 10)
val var3: Int = (varUnica / 100) - (var1 * 100 + var2 * 10)
val var4 = (varUnica / 10) - (var1 * 1000 + var2 * 100 + var3 * 10)
val var5 = varUnica - (var1 * 10000 + var2 * 1000 + var3 * 100 + var4 * 10)


var varUnica2 = 12356

val var55 = varUnica2 % 10
varUnica2 = varUnica2/10
val var56 = varUnica2 % 10
varUnica2 = varUnica2/10
val var57 = varUnica2 % 10


calculateNumber((0.toString ++ 0.toString).toInt)
