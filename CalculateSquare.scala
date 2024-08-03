object CalculateSquare{

    def main(args:Array[String])={
       val input=List(1,2,3,4,5)
       val output=calculateSquare(input)
       println(output)
    }

    def calculateSquare(nums:List[Int]):List[Int]={
       nums.map(num=>num*num)
    }
}