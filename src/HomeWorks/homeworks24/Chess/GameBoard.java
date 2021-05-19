package HomeWorks.homeworks24.Chess;

/**
 * Страница 4
 */
public class GameBoard {
   private RectengleDraft[][] gameBoard = new RectengleDraft[8][8]; // Создали двухмерный масив из кубиков

   public final boolean fillField(RectengleDraft field){
       // Метод заполняющий ячейку в масиве

       if(field == null){
           /* если входящий прямоугольник пустой то возврощаем значение */  return false;
       }
       if(field.getLocal().getX() >= 8 || field.getLocal().getX() < 0){
           // Сравнение по масиву
           /* если локация прямоугольника по оси "Х" больше или равна 8 или меньше нуля
           * то мы возврощаем значение */ return false;
       }
       if(field.getLocal().getY() >= 8 || field.getLocal().getY() < 0){
           // Сравнение по масиву
           /* если локация прямоугольника по оси "Х" больше или равна 8 или меньше нуля
            * то мы возврощаем значение */ return false;

       }
       // вписываем прямоуголькик как обьект
       gameBoard[field.getLocal().getX()][field.getLocal().getY()] = field;
       return true; // воврощаем значение  правда
   }

   //метод позволяющий получить элемент ячейки из масива
   public RectengleDraft getGameBoard(int i, int j){ return  gameBoard[i][j];}



}
