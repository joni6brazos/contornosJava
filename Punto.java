
public class Punto {
    public int x = 0;
    public int y = 0;

    public Punto(int a, int b) {
        x = a;
        y = b;
    }

    public void setX(int a) {
        x = a;
    }       
    public void setY(int b) {
        y = b;
    }
    
    public int getX() {
        return x;
    }       
    public int getY() {
        return y;
    }


    public static void main(String[] args) {

        Punto puntito = new Punto(3,4);
        Punto orixe = new Punto(0, 0);

        System.out.println( puntito.getX() ); 
        System.out.println( orixe.getY() );
    }
}

// https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html


