class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    // Metoda obliczająca pole powierzchni kuli
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Metoda sprawdzająca, czy dana bryła mieści się w sferze
    public boolean isContainedInSphere(Body body) {
        // Oblicz odległość od środka kuli do środka bryły
        double distance = Math.sqrt(Math.pow(this.radius - body.getX(), 2) +
                Math.pow(this.radius - body.getY(), 2) +
                Math.pow(this.radius - body.getZ(), 2));

        // Sprawdź, czy odległość jest mniejsza lub równa promieniowi kuli
        return distance <= this.radius;
    }
}

class Tetrahedron {
    private double sideLength;

    public Tetrahedron(double sideLength) {
        this.sideLength = sideLength;
    }

    // Metoda obliczająca pole powierzchni czworościanu
    public double calculateSurfaceArea() {
        return Math.sqrt(3) * sideLength * sideLength;
    }

    // Metoda sprawdzająca, czy dana bryła mieści się w sferze
    public boolean isContainedInSphere(Sphere sphere) {
        // Oblicz odległość od środka czworościanu do środka sfery
        double distance = Math.sqrt(Math.pow(sphere.getX(), 2) +
                Math.pow(sphere.getY(), 2) +
                Math.pow(sphere.getZ(), 2));

        // Sprawdź, czy odległość jest mniejsza lub równa promieniowi sfery
        return distance <= sphere.getRadius();
    }
}

class Body {
    private double x, y, z;

    public Body(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}

public class Main {
    public static void main(String[] args) {
        // Tworzenie sfery i czworościanu
        Sphere sphere = new Sphere(5.0);
        Tetrahedron tetrahedron = new Tetrahedron(4.0);

        // Obliczanie pól powierzchni brył
        double sphereSurfaceArea = sphere.calculateSurfaceArea();
        double tetrahedronSurfaceArea = tetrahedron.calculateSurfaceArea();

        System.out.println("Powierzchnia sfery: " + sphereSurfaceArea);
        System.out.println("Powierzchnia czworościanu: " + tetrahedronSurfaceArea);

        // Sprawdzenie, czy czworościan mieści się w sferze
        boolean isTetrahedronInSphere = tetrahedron.isContainedInSphere(sphere);

        if (isTetrahedronInSphere) {
            System.out.println("Czworościan mieści się w sferze.");
        } else {
            System.out.println("Czworościan nie mieści się w sferze.");
        }
    }
}
