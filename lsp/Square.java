public class Square extends Rectangle {
    //ประกาศตัวแปร side
    int side;
    
    Square(int side) {
        this.side = side;
        this.setSide(this.side);
    }

    public int getSide() {
        return side;
    }
    
    @Override
    public void setWidth(int width) {
        if(this.side > 0){
         width = this.side;   
        }
        this.setSide(width);
    }

    @Override
    public void setHeight(int height) {
        if(this.side > 0){
         height = this.side;   
        }
        this.setSide(height);
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
}