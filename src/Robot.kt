import  java.util.*;

class Robot(val name : String){

      fun ringAlarm(time : String) = println("Good Morning! Its $name, The time is already $time, please wake up!!")

      fun makeCoffee(coffee: Coffee) = if (coffee.black){

               println("Your black coffee with ${coffee.spoonsOfSugar} spoons of sugar is ready!")

      } else {
               println("Your coffee with ${coffee.spoonsOfSugar} spoons of sugar is ready!")
      }

      fun heatWater(temperature : Int) = println("Bath water with $temperature is ready, take a bath now!")

      fun packBag(day : Int) {

          val msgTemplate = "Books kept for today are : "
          val subjects = arrayOf(
              "Maths",
              "Networking",
              "Micro Processor",
              "Operating System",
              "Java Language",
              "Kotlin Language",
              "DBMS"
          )

          when (day) {
              Calendar.MONDAY -> println("$msgTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}")
              Calendar.TUESDAY -> println("${msgTemplate}, ${subjects[0]}, ${subjects[1]}, ${subjects[3]}")
              Calendar.WEDNESDAY -> println("${msgTemplate}, ${subjects[1]}, ${subjects[4]}, ${subjects[5]}")
              Calendar.THURSDAY -> println("${msgTemplate}, ${subjects[4]}, ${subjects[6]}")
              Calendar.FRIDAY -> println("${msgTemplate}, ${subjects[5]}, ${subjects[6]}")
              Calendar.SATURDAY -> println("${msgTemplate}, ${subjects[1]}, ${subjects[2]}, ${subjects[3]}")
              else -> println("Invalid day or maybe its holiday today!")
          }
      }

     fun cook(){

              val breakFast = mutableListOf("Poha", "Masala Dosa", "Aloo Paratha", "Oats", "Sandwiches", "Eggs")
              val lunch = mutableListOf("Salad", "Chicken", "Shahi Paneer", "Masala Bhindi", "Dal Chawal")

              println("Today's breakfast is ${breakFast.random()} and lunch is ${lunch.random()}")
      }

     fun ironClothes(shirtColor : String, trouserColor : String){

             val shirtColors = mutableListOf("Blue", "Green", "Orange", "Red", "Yellow", "Black")
             val trouserColors = mutableListOf("Blue", "Black", "Gray")

            if(shirtColors.contains(shirtColor)){

                if(trouserColors.contains(trouserColor)){

                    println("Your Clothes are ready!!")
                }else{

                      println("You do not hava trouser of this color. May be its time to go for a trouser shopping")
                }

                   println("You do not have shirt of this color. May be its time to go for a trouser shopping.")
            }
     }


}