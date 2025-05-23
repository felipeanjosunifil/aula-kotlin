public class Main {
    public static void main(String[] args) {
        int a = 1;

        System.out.println("O número é " + a + "!!!");

        switch (a) {
            case 1: {
                System.out.println("A");
                break;
            }
            case 2: {
                System.out.println("B");
                break;
            }
            case 3: {
                System.out.println("C");
                break;
            }
            default: {
                System.out.println("Nenhum dos casos");
                break;
            }
        }

        //realiza print de 1 até 10
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        Pessoa p1 = new Pessoa("Fulano", 20, "123546789-00");
    }
}
