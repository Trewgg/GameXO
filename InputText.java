package gameXO;

import java.util.Scanner;   //класс для считывания с консоли

public class InputText {
    private static final char VALUE_X = 'x';
    private static final char VALUE_O = 'o';
    private int iText;
    private int jText;

    Field fieldInput = new Field();

    //вставить Х
    public void inputXCell() {
        Scanner inX = new Scanner(System.in);

        System.out.println("Игрок X ставит: ");
        iText = inX.nextInt() - 1;
        jText = inX.nextInt() - 1;

        //if (fieldInput.matrix[iText][jText] == ' ') {
            fieldInput.textCell(iText, jText,VALUE_X);
            fieldInput.showMatrix();
        //}
        //else {
        //    System.out.println("Значение уже есть!");
        //}


    }

    //вставить О
    public void inputOCell() {
        Scanner inO = new Scanner(System.in);

        System.out.println("Игрок О ставит: ");
        iText = inO.nextInt() - 1;
        jText = inO.nextInt() - 1;

        fieldInput.textCell(iText, jText,VALUE_O);
        fieldInput.showMatrix();
    }




}
