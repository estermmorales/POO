public class Swapper {
    int x, y;

    Swapper(int x, int y){
        setX(x);
        setY(y);
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    void swap(){
        int aux = x;
        x = y;
        y = aux;
    }
}
