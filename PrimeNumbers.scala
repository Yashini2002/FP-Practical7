object PrimeNumbers {

    def main(args: Array[String])= {
      val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
      val output = filterPrime(input)
      println(output)  
    }
    
    def isPrime(num: Int): Boolean = {
      if (num <= 1) false
      else if (num == 2) true
      else !(2 until num).exists(n => num % n == 0)
    }

    def filterPrime(nums: List[Int]): List[Int] = {
      nums.filter(num => isPrime(num))
    }

}
