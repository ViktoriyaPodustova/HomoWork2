package HW2;

public class MyArrayDataException extends Exception{
    private int x;
    private int y;

    public MyArrayDataException(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String getMessage(){
        return "Некорректный формат данных в массиве: x="+ x + " y="+ y ;
    }
}
