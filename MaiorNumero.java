public class MaiorNumero {

    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b;
        String entrada;

        System.out.print("Digite o valor de A: ");
        entrada = in.next();
        a = Integer.parseInt(entrada);

        System.out.print("Digite o valor de B: ");
        entrada = in.next();
        b = Integer.parseInt(entrada);

        if (a > b) {
            System.out.println("Maior numero: " + a);
        }
        if (a == b) {
            System.out.println("Os numeros são iguais.");
        } else {
            System.out.println("Maior numero: " + b);
        }

    }

}
