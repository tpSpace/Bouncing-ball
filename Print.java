// Symply print the whole array

public class Print {
    
    public Print(String[][] board,int width, int height){
        
    }
    public void printBoard(String[][] board,int width,int height){
        System.out.println("There are "+newBall.getCount()+" balls in the board");
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(board[i][j]=="o"){

                    System.out.print((board[i][j]));
                }else{
                System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
        
    }
}
