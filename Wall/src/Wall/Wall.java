package Wall;

public class Wall {
    private double width;
    private double height;

    public Wall(){

    }
    public Wall (double width, double height){
        this.height=height;
        this.width=width;
    }
    public void getWidth(){
        return;    //it needs to return the value of width field.
    }
    public void getHeight(){
        return;           // it needs to return the value of height field.
    }
    public void setWidth(double width){   //it needs to set the value of the width field. If the parameter is
                                            // less than 0 it needs to set the width field value to 0.

    }
    public void setHeight (double height){      //it needs to set the value of the height field. If the parameter
                                                    // is less than 0 it needs to set the height field value to 0.

    }
    public void getArea (){                    //it needs to return the area of the wall.
        return;
    }
}
