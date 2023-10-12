import java.util.*;


fun main(){


       /** Initialize the object Robot and give it a name */
       val robot  = Robot("buddy")

       /** Print the details of the Robot along with a greeting */
       println("Hey, there. My name is ${robot.name} and I will be your personal assistant!")
       println()

       /** Alarm time setUp */
       robot.ringAlarm("7:00 AM")
       println()

       /** Black coffee with 1 spoon */
       robot.makeCoffee(Coffee(true, 1))
       println()

      /** Input the water temperature in Celsius */
       robot.heatWater(37)
       println()

       /** Robot pack bag according to the day to the week */
       robot.packBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
       println()

       /** Random Breakfast */
       robot.cook()
       println()

       /** Color combination you want to wear */
       robot.ironClothes("Blue", "Black")
       println()

       println("Have A Good Day!!")
}