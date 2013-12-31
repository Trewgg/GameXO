package gameXO;

public class CheckGame {

    // Проверяем, остались ли еще ходы
    public static boolean canMove() {
        boolean canMove = false;
        Field fieldInput = new Field();


        for (int i = 0; i < Field.FIELD_SIZE ; i++) {
            for (int j = 0; j < Field.FIELD_SIZE ; j++) {
                if (fieldInput.matrix[i][j] == Field.DEF_FIELD_VALUE) {
                    canMove = true;
                }
            }
        }
        return canMove;
    }

    // Проерка состояния игры и есть ли победители
    // возвращает символ победителя или символ пробела если пока никто не
    // выиграл
    public char CheckGame() {
        char winner = ' ';
        Field fieldInput = new Field();

        // Проверка по горизонтали
        for (int i = 0; i < Field.FIELD_SIZE; i++) {
            if (fieldInput.matrix[i][0] == fieldInput.matrix[i][1] && fieldInput.matrix[i][1] == fieldInput.matrix[i][2]
                    && fieldInput.matrix[i][0] != Field.DEF_FIELD_VALUE) {
                winner = fieldInput.matrix[i][0];
                break;
            }
        }

        // Проверка по вертикали если победитель пока не найден
        if (winner == ' ') {
            for (int i = 0; i < Field.FIELD_SIZE; i++) {
                if (fieldInput.matrix[0][i] == fieldInput.matrix[1][i] && fieldInput.matrix[1][i] == fieldInput.matrix[2][i]
                        && fieldInput.matrix[0][i] != Field.DEF_FIELD_VALUE) {
                    winner = fieldInput.matrix[0][i];
                    break;
                }
            }
        }

        // Проверка главной диагонали если победитель пока не найден
        if (winner == ' ') {
            if (fieldInput.matrix[0][0] == fieldInput.matrix[1][1] && fieldInput.matrix[1][1] == fieldInput.matrix[2][2]
                    && fieldInput.matrix[0][0] != Field.DEF_FIELD_VALUE) {
                winner = fieldInput.matrix[0][0];
            }
        }

        // Проверка побочной диагонали если победитель пока не найден
        if (winner == ' ') {
            if (fieldInput.matrix[0][2] == fieldInput.matrix[1][1] && fieldInput.matrix[1][1] == fieldInput.matrix[2][0]
                    && fieldInput.matrix[0][2] != Field.DEF_FIELD_VALUE) {
                winner = fieldInput.matrix[0][0];
            }
        }
        // Возвращаем победителя или пробел, если такового пока нет
        return winner;
    }
}
