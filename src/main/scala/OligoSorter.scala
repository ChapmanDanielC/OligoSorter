
object OligoSorter {

  def main(args: Array[String]): Unit = {
    println("This is an oligonucleotide sorting program. As a note, only oligos containing G, C, A, or are valid.")

    val input = args.toVector
    val oligos = input.map(Oligo)
    println(oligos)
  }
}

