val l1 = List("Hei", "Verden")

val lowerCased = l1.map(_.toLowerCase)
println(lowerCased)

val l2 = List("Scala", "er", "gøy")

l2.map { ord =>
  if (ord == "Scala") l1
  else List(ord)
}//.flatten

l2.flatMap { ord =>
  if (ord == "Scala") l1
  else List(ord)
}

println(
  l2.flatMap { ord =>
    if (ord == "Scala") l1
    else List(ord)
  }
)
