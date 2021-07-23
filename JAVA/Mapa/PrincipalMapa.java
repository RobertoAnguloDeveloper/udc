package JAVA.Mapa;

public class PrincipalMapa {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();

        System.out.println("******************************************************");
        System.out.println("*******DICCIONARIO DE LENGUAJES DE PROGRAMACIÓN*******");
        System.out.println("******************************************************");
        mapa.agregar("Java", "Lenguaje de programación especializado en Programación Orientada a Objetos");
        mapa.agregar("JavaScript", "Lenguaje de programación orientado a objetos y orientado a páginas Web");
        mapa.agregar("PHP", "Lenguaje de programación orientado a objetos y de comunicación con el servidor");
        mapa.agregar("C#", "Lenguaje de programación orientado a objetos, evolución de C++");
        mapa.agregar("C++", "Lenguaje de programación orientado a objetos");
        mapa.agregar("C", "Lenguaje de programación orientado a objetos");
        mapa.agregar("Python", "Lenguaje de programación orientado a objetos");
        mapa.agregar("Ruby", "Lenguaje de programación orientado a objetos");
        mapa.imprimir();
        System.out.println("******************************************************");
        System.out.println("*******DICCIONARIO DE LENGUAJES DE PROGRAMACIÓN*******");
        System.out.println("******************************************************");

        System.out.println("************************************************");
        System.out.println("*Buscar una palabra en el mapa*");
        System.out.println("----Palabra a buscar = 'Java'----");
        System.out.println("************************************************");
        String buscar = new String("Java");
        String busqueda = mapa.buscar(buscar);
        if(busqueda != null){
            System.out.println("La palabra " + buscar + " se encuentra en el mapa");
            System.out.println(buscar+": "+busqueda);
        }else{
            System.out.println("La palabra " + buscar + " no se encuentra en el mapa");
        }

        System.out.println("************************************************");
        System.out.println("*ORDENANDO EL MAPA EN ORDEN ALFABETICO*");
        System.out.println("************************************************");
        mapa.ordenar();
        mapa.imprimir();
        

        
        System.out.println("************************************************");
        System.out.println("*ELIMINAR UNA PALABRA DEL MAPA*");
        System.out.println("----Palabra a eliminar = 'PHP'----");
        System.out.println("************************************************");
        String eliminar = new String("PHP");
        mapa.eliminar(eliminar);
        System.out.println("******************************************************");
        System.out.println("*******DICCIONARIO DE LENGUAJES DE PROGRAMACIÓN*******");
        System.out.println("******************************************************");
        mapa.imprimir();
        
    }
}
