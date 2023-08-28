public class Main{
    
    public static void main(String[] args) {
        
        int width = 70;
        int height = 30;
        int BallNumber = 30;
        int BallCounter = 3;
        Board board = Board.getObject(width, height);
        Ball[] ball = new Ball[100];
        // 29 balls only
        for(int i=0;i<BallCounter;i++){
            ball[i] = new Ball(1,1,width,height,false);
        }
        //ball initlize
        ball[0] = new Ball(1,1,width,height,true);
        ball[1] = new Ball(1,1,width,height,true);
        ball[2] = new Ball(1,1,width,height,true);
        
        // run the loop
        while (true){
            // clear screen and delay
            ClearScreen.Clear();
            board.run(ball,BallNumber,BallCounter-1);
            BallCounter = newBall.getCount();
            
            
            
        }
        //
      
    }
}