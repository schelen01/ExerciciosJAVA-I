public class Main {
    public static void main(String[] args) {
        String nome = "Schelen";
        int quantidade;
        char inicial;

        quantidade = nome.length(); //Usando o length da classe String pode calcula o comprimento da string armazenada em nome.
        nome.toUpperCase(); //Coloca em maiúsculo

        if (nome.equals("SCHELEN")) {
            System.out.println("Está em maiúsculo"); //verifica se foi convertido para maiúscula corretamente.
        }
        inicial = nome.charAt(); //Obtem o primeiro caractere da string na variável inicial do tipo char
    }
}

//String Vazia
public class EmptyString {
    public static void main(String[] args) {
        String nome1;

        if (nome1 == null) { //Comprova se a variável não foi inicializada
            System.out.println("String com valor nulo");
        }
    }
}

//Integer
public class IntegerExplicacao {
    public static void main(String[] args) {
     Integer valor1 =10;
     Integer valor2 =30;
     int comparar;

     if(valor1.equals(valor2)){ //comprovamos se os 2 valores são iguais
         System.out.println("são iguais");
     }else{
         comparar=valor1.compareTo(valor2); //Compare a relação entre os dois valores, se o valor1 for maior, ele dará 1, se o valor2 for maior, ele dará -1.
         if (comparar>0)
             System.out.println("valor1 é maior que valor2");
         else
            System.out.println("valor2 é maior que valor1");
     }
    }
