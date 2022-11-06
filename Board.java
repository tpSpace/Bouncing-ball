public class Board {
    private int width;
    private int height;
    private String[][] board;
    public static Board instance = null;
    private Board(int width, int height) {
        
        this.width = width;
        this.height = height;
        //run();
        
    }
    public static Board getObject(int width, int height) {
        if (instance == null) {
            instance = new Board(width, height);
        }
        return instance;
    }
    public void run(Ball[] ball,int BallNumber,int BallCounter){
        //initlize the board
        board = new String[100][100];
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(i==0 || i==height-1 || j==0 || j==width-1){
                    board[i][j] = "-";
                }else{
                    board[i][j] = " ";
                }
                if(i==0 && j==0){
                    board[i][j] = "+";
                }
                if(i==0 && j==width-1){
                    board[i][j] = "+";
                }
                if(i==height-1 && j==0){
                    board[i][j] = "+";
                }
                if(i==height-1 && j==width-1){
                    board[i][j] = "+";
                }
            }
        }
        // print the ball
        for(int i=0;i<BallCounter;i++){
            if(ball[i].getActive()==true){
                //ball[i].collision(); int width,int heightBal
                BallCounter = newBall.getCount();
                ball[i].collision(ball,BallNumber,i,BallCounter);
                ball[i].move();
                
                BallCounter = newBall.getCount();
                


                board[Math.abs(ball[i].getX())][Math.abs(ball[i].getY())] = "o";
               
                //System.out.println(ball[i].getX()+" "+ball[i].getY()+" "+ball[i].getXDirection()+" "+ball[i].getYDirection()+" "+newBall.getCount());
            }
        }
        //print the board
        Print print = new Print(board,width,height);
        print.printBoard(board,width,height);
        

    }
}
