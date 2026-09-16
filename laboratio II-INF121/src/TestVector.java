public class TestVector {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);
        System.out.println("Vectores:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
        System.out.println("a) Suma de vectores:");
        System.out.println("a + b = " + a.sumar(b));
        System.out.println();
        System.out.println("b) Multiplicación por escalar:");
        System.out.println("a * 2 = " + a.multiplicarEscalar(2));
        System.out.println();
        System.out.println("c) Longitud del vector:");
        System.out.println("|a| = " + a.longitud());
        System.out.println();
        System.out.println("d) Normal del vector:");
        System.out.println("normal(a) = " + a.normalizar());
        System.out.println();
        System.out.println("e) Producto escalar:");
        System.out.println("a · b = " + a.productoEscalar(b));
        System.out.println();
        System.out.println("f) Producto vectorial:");
        System.out.println("a × b = " + a.productoVectorial(b));
        System.out.println();
        Vector3D n = a.normalizar();
        System.out.println("Comprobación: |normal(a)| = " + n.longitud());
    }
}
