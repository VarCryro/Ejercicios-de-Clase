public class Carro {
        //Atributos
        String color;
        String marca;
        int km;
        
        //Metodo
     public static void main(String [] args) {
         Carro carro1 = new Carro();

         carro1.color = "Blanco";
         carro1.marca = "Audi";
         carro1.km = 0;
 
        System.out.println("El color del carro1 es: "+carro1.color);
        System.out.println("La marca del carro1 es:"+carro1.marca);
        System.out.println("El kilometraje del carro1 es:"+carro1.km);

        Carro carro2 = new Carro();
        carro2.color = "Negro";
        carro2.marca = "Ferrari";
        carro2.km = 100;

        System.out.println("\n El color del carro2 es: "+carro2.color);
        System.out.println("La marca del carro2 es:"+carro2.marca);
        System.out.println("El kilometraje del carro2 es:"+carro2.km );
    }
 }    
