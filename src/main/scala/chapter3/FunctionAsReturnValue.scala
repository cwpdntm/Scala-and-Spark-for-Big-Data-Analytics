package chapter3
object FunctionAsReturnValue {
  def TransferMoney(money: Double) = {
    if (money > 1000)
      (money: Double) => "Dear customer we are going to add the following amount as Fee: " + money * 0.05
    else
      (money: Double) => "Dear customer we are going to add the following amount as Fee: " + money * 0.1
  }  
  def main(args: Array[String]) {
    val returnedFunction = TransferMoney(1500.0)
    println(returnedFunction(1500)) // "Dear customer, we are going to add the following amount as Fee: 75.0"을 출력한다
  }
}