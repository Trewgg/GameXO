package gameXO;

public class Main {

    public static void main(String[] arg) {
        System.out.println("Игра началась!");
        System.out.println("Введите два числа от 1 до 3");
        Field field = new Field();
        field.showMatrixEmpty();          //пустой массив

        InputText inputText = new InputText();
        CheckGame checkGame = new CheckGame();

        inputText.inputXCell();
        inputText.inputOCell();

//        while (checkGame.canMove() == true) {
//            inputText.inputXCell();
//            inputText.inputOCell();
//        }


     }

}
