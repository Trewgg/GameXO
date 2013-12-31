package gameXO;

public class Field {
    public static final int FIELD_SIZE = 3;
    public static final char DEF_FIELD_VALUE = ' ';

    private final int fieldSize;
    private final char[][] matrixEmpty;
    public final char[][] matrix;

    //private char matrixEmpty[][] = new char[FIELD_SIZE][FIELD_SIZE];  // Игровое поле
    //public char matrix[][] = new char[FIELD_SIZE][FIELD_SIZE];  // Игровое поле

    //конструктор 1
    public Field() {
        this(FIELD_SIZE);   //вызывает конструктор 2
        //fieldSize = FIELD_SIZE;
        //matrixEmpty = new char[fieldSize][fieldSize];
        //matrix = new char[fieldSize][fieldSize];
    }

    //конструктор 2 (с указанием размера поля)
    public Field(int size) {
        fieldSize = size;
        matrixEmpty = new char[fieldSize][fieldSize];
        matrix = new char[fieldSize][fieldSize];
    }

    //показать стартовое поле
    public void showMatrixEmpty() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                matrixEmpty[i][j] = DEF_FIELD_VALUE;
                System.out.print("[" + matrixEmpty[i][j] + "]");
            }
            System.out.println();
        }
    }

    //показать массив
    public void showMatrix() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    //Вставка текста в ячейку
    public void textCell(int i, int j, char value) {
        matrix[i][j] = value;

//        if (matrix[i][j] != 'x' || matrix[i][j] != 'o') {
//            matrix[i][j] = value;
//        }
//        else {
//            System.out.println("Ввведите другое число");
//        }
    }
}
