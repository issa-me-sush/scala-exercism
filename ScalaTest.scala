object ScalaTest{  
    def main(args: Array[String]) : Unit ={  
        println ("Hello Scala"  )
        println(args.mkString("\n"))
        println(args.mkString(
            start="Array(",
            sep  = ",",
            end = ")"

        ))                       //Scala ScalaTest.scala arg1 arg2 arg3..


    }  
}  