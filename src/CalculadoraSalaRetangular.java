public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public double calcularArea(double base, double altura) {
        double areaSala = base * altura;
        System.out.println("A àrea da sua sala é de: " + areaSala);
        return areaSala;
    }

    @Override
    public double calcularPerimetro(double base, double altura) {
        double perimetroSala = base + altura + base + altura;
        System.out.println("O perimetro da sua sala é de: " + perimetroSala);
        return perimetroSala;
    }
}
