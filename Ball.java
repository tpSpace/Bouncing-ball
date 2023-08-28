import java.util.Random;
public class Ball {
    private int x;
    private int y;
    private int xDirection;
    private int yDirection;
    private int width;
    private int height;
    private boolean active = false;
    public Ball(int xDirection, int yDirection,int width,int height,boolean active) {
        this.width = width;
        this.height=height;
        Random rand = new Random();
        this.active = active;
        this.x = rand.nextInt(height-3)+3;
        this.y =rand.nextInt(width-3)+3; 
        if(rand.nextInt(1)==1){
            this.xDirection = 1;
        }else {
                this.xDirection = -1;
            }
        if(rand.nextInt(1)==1){
            this.yDirection = 1;
        }else {
                this.yDirection = -1;
            }
    }
    public boolean getActive(){
        return active;
    }
    public void move(){
        if(this.x+this.xDirection<height-1 && this.y+this.yDirection<width-1){
            this.x += xDirection;
            this.y += yDirection;
        }
        
        
    }
    public int getXDirection(){
        return xDirection;
    }
    public int getYDirection(){
        return yDirection;
    }
    public void setXDirection(int xDirection){
        this.xDirection = xDirection;
    }
    public void setYDirection(int yDirection){
        this.yDirection = yDirection;
    }
    public void collision(Ball[] ball,int BallNumber,int numberTH,int BallCounter){
        //check ball collision with others
        BallCounter = newBall.getCount();
        for(int i=0;i<BallCounter;i++){
            if(i!=numberTH && ball[i].getX()<height-1 && ball[i].getY()<width-1 && ball[i].getX()>0 && ball[i].getY()>0){
                if((ball[i].getX()+ball[i].getXDirection()==this.x+this.xDirection && ball[i].getY()+ball[i].getYDirection()==this.y+this.yDirection) || (ball[i].getX()+ball[i].getXDirection()==this.x && ball[i].getY()+ball[i].getYDirection()==this.y)){
                    
                    
                    
                    
                    newBall.AddCount(BallCounter+1);
                    ball[newBall.getCount()-1] = new Ball(1,1,width,height,true);
                    this.xDirection = -this.xDirection;
                    this.yDirection = -this.yDirection;
                    ball[i].setXDirection(-ball[i].getXDirection());
                    ball[i].setYDirection(-ball[i].getYDirection());
                    
                  //  board[Math.abs(ball[newBall.getCount()].getX())][Math.abs(ball[newBall.getCount()].getY())] = "o";
                    
                }
            }
            if(x==height-2 || x==height-1){
                        this.x=height-2;
                        xDirection = -1;
                       // xDirection = -1;
                    }else{
                        if(x==1){
                            xDirection = 1;
                            
                        }
                    }
                    if(y==width-2 || y==width-1){
                        yDirection = -1;
                        this.y = width-2;
                      //  yDirection = -1;
                    }else{
                        if(y==1){
                            yDirection = 1;
                        }
                    }
        }
        

        
        
        
        

    }
    // get some stuff
    public int getX(){
        return Math.abs(x);
    }
    public int getY(){
        return Math.abs(y);
    }
    public void setX(int x){
        if(x<width-1){
            this.x = x;
        }
       
    }
    public void setY(int y){
        if(y<height-1){
            this.y = y;
        }
    }
    
}
