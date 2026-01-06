class Rectangle{
    protected double width=-1;
    protected double height=-1;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double area(){
        return width*height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height; 
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }
}

class Square extends Rectangle{
    public Square(double size){
        super(size,size);
    }
    @Override
    public void setWidth(double w){
        this.width=this.height=w;
    }
}

class LiskovSubstitution{
    public static void main(String[] args){
        Square s=new Square(5);
        System.out.println(s.area());
        System.out.println("Hello World");
    }
}