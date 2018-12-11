val weight = 120
val message = if(weight <= 100){
  "ok"
} else {
  "オーバー"
}
println(message)



val n = 5
n match {
  case 1 => println("Gold")
  case 2 => println("Silver")
  case 3 => println("Bronze")
  case other => println("You didn't get a prize")
}

val maybeNum: Option[Int] = Some(123)
println(maybeNum)

val maybeNum2: Option[Int] = None
println(maybeNum2)

val number = maybeNum match{
  case Some(num) => num // numとして取り出す
  case None => 0
}
println(number)



val filtered = Seq(1, 2, 3).filter(i => i > 1)
println(filtered)
val doubled = Seq(1, 2, 3).map(_ *2) // _ はi => i の省略記法
println(doubled)

val results: Seq[Int] = for{
  i <- (1 to 3)
  j <- (2 to 4)
  result = (i*j)
}yield result
println(results)
