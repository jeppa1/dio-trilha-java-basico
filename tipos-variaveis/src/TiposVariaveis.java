public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo, puxe a cadeira, pegue um cafezinho e acenda um.");
    }
    public class TiposDados {
        public static void main (String[] args) {
            byte idade = 31;
            short ano = 2024;
            int cep = 55555555;    //se começar com zero, tem que colocar outro tipo, no caso String
            long = 98765432109L;   //se começar com zero, tem que colocar outro tipo, no caso String
            float pi = 3.14F;
            double  salario = 1500;

            short numeroCurto = 1;
            int numeroNormal = numeroCurto;
            short numeroCurto2 = (short) numeroNormal;   //casting
        }
    }
}
