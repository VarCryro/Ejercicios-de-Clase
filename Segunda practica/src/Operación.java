import javax.swing.JOptionPane;

public class Operación {
    //Atributo

    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicación;
    int división;

    //Método

    //Método para pedirle al usuario que nos digite dos números
    public void leerNumeros () {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
    }

    //Método para sumar ambos números
    public void sumar() {
        suma = numero1+numero2;
    }

    //Método para restar ambos números
    public void restar() {
        resta = numero1-numero2;
    }

    //Método para multiplicar ambos números
    public void multiplicar() {
        multiplicación = numero1*numero2;
    }
    
    //Método para dividir ambos números
    public void dividir() {
        división = numero1/numero2;
    }

    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicación);
        System.out.println("La división es: "+división);
    }
}

