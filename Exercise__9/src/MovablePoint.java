public class MovablePoint implements  Movable{
    private int x ;

    private  int y ;

    private int xSpeed;
    private  int yspeed ;

    public MovablePoint(int x,int y , int xSpeed , int yspeed) {
        this.x = x;
        this.y= y;
        this.xSpeed =xSpeed ;
        this.yspeed = yspeed;
    }


    //moveUp: y-=ySpeed
    @Override
    public void moveUp() {
        y-=yspeed;
        System.out.println(y);
    }


    //moveDown: y+=ySpeed
    @Override
    public void moveDown() {

        y+=yspeed;
        System.out.println(y);
    }

    //moveLeft: x-=xSpeed
    @Override
    public void moveLeft() {
        x-=xSpeed;
        System.out.println(x);
    }
    //moveRight: x+=xSpeed
    @Override
    public void moveRight() {
        x+=xSpeed;
        System.out.println(x);
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", yspeed=" + yspeed +
                '}';
    }
}

