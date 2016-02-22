def fib(n: Int): Int = {
  @annotation.tailrec
  def loop(depth: Int, cur: Int, next: Int): Int = {
    if (depth == n)
      cur
    else 
      loop(depth + 1, next, cur + next)
  }

  loop(0, 0, 1)
}

println(fib(7));
