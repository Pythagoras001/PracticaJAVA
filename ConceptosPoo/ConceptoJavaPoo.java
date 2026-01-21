////////////////////////////////////////////////////////////
// PROGRAMACIÓN ORIENTADA A OBJETOS (POO) EN JAVA
// Apuntes completos y comentados
////////////////////////////////////////////////////////////


////////////////////CLASE Y OBJETO////////////////////

class Persona {

    // ATRIBUTOS (estado del objeto)
    private String nombre;
    private int edad;

    // CONSTRUCTOR
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // MÉTODO
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    // GETTER
    public String getNombre() {
        return nombre;
    }

    // SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


////////////////////ENCAPSULAMIENTO////////////////////

class CuentaBancaria {

    // private → protege el atributo
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método público para modificar el estado
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    // Método público para consultar el estado
    public double getSaldo() {
        return saldo;
    }
}


////////////////////HERENCIA////////////////////

// CLASE PADRE
class Animal {

    // protected → accesible desde clases hijas
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

// CLASE HIJA
class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre); // llama al constructor del padre
    }

    public void moverCola() {
        System.out.println(nombre + " mueve la cola");
    }
}


////////////////////POLIMORFISMO Y OVERRIDE////////////////////

class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    // @Override → sobrescribe método del padre
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}


////////////////////CLASE ABSTRACTA////////////////////

// No se puede crear objetos de esta clase
abstract class Vehiculo {

    protected int velocidad;

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    // Método abstracto (sin implementación)
    public abstract void mover();

    public int getVelocidad() {
        return velocidad;
    }
}

class Carro extends Vehiculo {

    public Carro(int velocidad) {
        super(velocidad);
    }

    @Override
    public void mover() {
        System.out.println("El carro se mueve a " + velocidad + " km/h");
    }
}


////////////////////INTERFACES////////////////////

// Define QUÉ debe hacer una clase
interface Volador {

    // implícitamente public y abstract
    void volar();
}

// Implementación de la interfaz
class Pajaro implements Volador {

    @Override
    public void volar() {
        System.out.println("El pájaro está volando");
    }
}

class Avion implements Volador {

    @Override
    public void volar() {
        System.out.println("El avión está despegando");
    }
}


////////////////////MULTIPLE IMPLEMENTACIÓN////////////////////

// Java NO permite herencia múltiple
// PERO sí múltiples interfaces
class Dron implements Volador {

    @Override
    public void volar() {
        System.out.println("El dron vuela");
    }
}


////////////////////FINAL////////////////////

class Constantes {

    // final → no se puede modificar
    public static final int EDAD_MAXIMA = 120;

    // final → no se puede sobrescribir
    public final void mostrar() {
        System.out.println("Método final");
    }
}

// final → no se puede heredar
final class Utilidad {
}


////////////////////CLASE MAIN (USO GENERAL)////////////////////

public class Main {
    public static void main(String[] args) {

        // OBJETOS
        Persona p = new Persona("Carlos", 25);
        p.saludar();

        // ENCAPSULAMIENTO
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        System.out.println("Saldo: " + cuenta.getSaldo());

        // POLIMORFISMO
        Animal a1 = new Perro("Max");
        Animal a2 = new Gato("Michi");

        a1.hacerSonido();
        a2.hacerSonido();

        // CLASE ABSTRACTA
        Vehiculo carro = new Carro(120);
        carro.mover();

        // INTERFAZ
        Volador v1 = new Pajaro();
        Volador v2 = new Avion();

        v1.volar();
        v2.volar();
    }
}
