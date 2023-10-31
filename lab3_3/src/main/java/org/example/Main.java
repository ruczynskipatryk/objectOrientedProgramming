public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5.0);
        Tetrahedron tetrahedron = new Tetrahedron(4.0);

        double sphereSurfaceArea = sphere.calculateSurfaceArea();
        double tetrahedronSurfaceArea = tetrahedron.calculateSurfaceArea();

        System.out.println("Powierzchnia sfery: " + sphereSurfaceArea);
        System.out.println("Powierzchnia czworościanu: " + tetrahedronSurfaceArea);

        boolean isTetrahedronInSphere = tetrahedron.isContainedInSphere(sphere);

        if (isTetrahedronInSphere) {
            System.out.println("Czworościan mieści się w sferze.");
        } else {
            System.out.println("Czworościan nie mieści się w sferze.");
        }

        runTests(); // Wywołanie testów
    }

    // Metody testujące

    public static void runTests() {
        testSphereSurfaceAreaCalculation();
        testTetrahedronSurfaceAreaCalculation();
        testTetrahedronInSphere();
    }

    public static void testSphereSurfaceAreaCalculation() {
        Sphere sphere = new Sphere(3.0);
        double expectedSurfaceArea = 4 * Math.PI * 3 * 3;
        double calculatedSurfaceArea = sphere.calculateSurfaceArea();
        assert expectedSurfaceArea == calculatedSurfaceArea : "Test nie przeszedł: Obliczone pole powierzchni sfery jest niepoprawne.";
    }

    public static void testTetrahedronSurfaceAreaCalculation() {
        Tetrahedron tetrahedron = new Tetrahedron(2.0);
        double expectedSurfaceArea = Math.sqrt(3) * 2 * 2;
        double calculatedSurfaceArea = tetrahedron.calculateSurfaceArea();
        assert expectedSurfaceArea == calculatedSurfaceArea : "Test nie przeszedł: Obliczone pole powierzchni czworościanu jest niepoprawne.";
    }

    public static void testTetrahedronInSphere() {
        Sphere sphere = new Sphere(10.0);
        Tetrahedron tetrahedron = new Tetrahedron(6.0);
        boolean expected = true;
        boolean calculated = tetrahedron.isContainedInSphere(sphere);
        assert expected == calculated : "Test nie przeszedł: Oczekiwano, że czworościan będzie zawarty w sferze.";
    }
}
