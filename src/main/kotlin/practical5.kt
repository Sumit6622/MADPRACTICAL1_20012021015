fun main()
{
    print("enter month number: ")
    var x : Int = readLine()!!.toInt()

    when(x)
    {
        1 -> print("january")
        2 -> print("february")
        3 -> print("march")
        4 -> print("april")
        5 -> print("june")
        6 -> print("july")
        7 -> print("august")
        8 -> print("september")
        9 -> print("october")
        10 -> print("november")
        11 -> print("december")
        else -> print("enetr proper number")
    }
}