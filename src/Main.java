public class Main {
    public static void main(String[] args) {

        System.out.println(suma(1,4,9));

        coche miCoche = new coche();
        miCoche.sumarPuerta();
        miCoche.sumarPuerta();
        System.out.println(miCoche.sumarPuerta());

    }
    public static int suma(int a,int b,int c){

        return (a+b+c);

    }
}
class coche{
    public int puertas = 0;
    public int sumarPuerta() {
        return   this.puertas ++;
    }
}
