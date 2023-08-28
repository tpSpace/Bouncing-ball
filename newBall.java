public class newBall {
     private static int BallNumber=3;
     public newBall(){

     }
     public static void AddCount(int number){
          if(number<31){
               BallNumber = number;
          }
          //BallNumber = number;
     }
     public static int getCount(){
          return BallNumber;
     }
}
