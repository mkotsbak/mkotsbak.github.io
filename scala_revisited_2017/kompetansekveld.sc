case class Person(firstName:String, lastName:String)
val marius = Person(firstName = "Marius", lastName = "Kotsbak")
println(s"Person: $marius")

// Funksjon og match
def erMarius(p: Person) = p match {
  case aPerson: Person if aPerson.firstName == "Marius" => true
  case _ => false
}

erMarius(marius)

val ikkeMarius = marius.copy(firstName = "Tor")

erMarius(ikkeMarius)

def erKotsbak(p: Person) = p.lastName == "Kotsbak"
def erMariusKotsbak(p: Person) = erMarius(p) && erKotsbak(p)
def erMariusKotsbakImplisitt(implicit p: Person) = erMarius(p) && erKotsbak(p)

implicit val m = marius
erMariusKotsbakImplisitt
erMariusKotsbakImplisitt(ikkeMarius)
