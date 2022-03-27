public class main {

    public static void main(String[] args) {
        int mes = metodos.userInput();
        if(mes < 1 || mes > 12){
            System.out.println("Mes incorrecto");
        }
        else {
            metodos.switchCase(mes);
        }
<<<<<<< HEAD
test
=======
        \\ test hjo
>>>>>>> 2dd123e6d6c392fb0a91dba26e7350c9037820b8
        metodos.diasMes(mes);
    }
}
