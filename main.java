public class main {

    public static void main(String[] args) {
        int mes = metodos.userInput();
        if(mes < 1 || mes > 12){
            System.out.println("Mes incorrecto");
        }
        else {
            metodos.switchCase(mes);
        }
        \\ test hjo ggg
        metodos.diasMes(mes);
    }
}
