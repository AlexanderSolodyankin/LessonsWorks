package HomeWorks.homeWorcks19.TaskA;

// вызван метод для вписывания добавления ячеек в массив
import java.util.Arrays;
// Вызов метода для генерации случайностей
import java.util.Random;

// Создан класс УРОКИ
 class Lessons extends Groups{
    // Параметры данного класса
    String homeWorks;
    String exam;
    // Задал масиву нулевой размер для того чтобы в него добовлять ячейки
    Students[] atten = new Students[0];
    DateFound dateSpend;


// Конструктор данного класса
    public Lessons(Students[] students, Courses cours, DateFound dateStart,
                        int duration,  DateFound dateSpend) {

        // Метод наследования от класса "Группа"
        super(students, cours, dateStart, duration);

        // вызван метог генерации случайностей чтобы вписать студентов которые появились на уроке ( не доконца продуман)
        Random ran = new Random();

        // Создал цикл для того что бы генерировать случайность домашки (задано или не заданно)
        // Без цикла почему то выдает одно и тоже значение решил не заморачиватся и тупо его зациклил
        while (true){
            int tru = ran.nextInt(101);
            if(tru % 2 == 0){
                homeWorks = "Домашняя работа была задана";
                break;
            }
            if(tru % 3 == 0){
                homeWorks = "Не была задана";
                break;
            }
        }
        // такой же генератор случайности как и выше только на экзамен
        while (true){
            int tru = ran.nextInt(101);
            if(tru % 2 == 0){
                exam = "Экзамена не было";
                break;
            }
            if(tru % 3 == 0){
                exam = "Экзамен был";
                break;
            }
        }
        // Закоментировал присвоение массива так как его проверял решил не удолять
//        this.atten = atten;

        // Запись случайно генерации студентов так как некоторые могут и прогуливать
        while (true){

            // если исходный массив равен длине входящего массива (чтобы не превышал количество студентов)
            if (atten.length == students.length){
                break;
            }
            // копирую исходный массив для последующего вноса в него ячейки из входного массива
            atten = Arrays.copyOf(atten,atten.length + 1);
            atten[atten.length - 1] = students[ran.nextInt(students.length - 1 + 1)];

            // Попытка генерации случаности для случайного количества студентов
            // Это сделано для того чтобы исходный массив не был равет входному
            if(((ran.nextInt(100 - 1 + 1) + 1) % 3) == 0){
                break;
            }
        }

        // Присвоение даты
        this.dateSpend = dateSpend;
    }


    public String getHomeWorks() {
        return homeWorks;
    }

    public void setHomeWorks(String homeWorks) {
        this.homeWorks = homeWorks;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public Students[] getAtten() {
        return atten;
    }

    public void setAtten(Students[] atten) {
        this.atten = atten;
    }

    public DateFound getDateSpend() {
        return dateSpend;
    }

    public void setDateSpend(DateFound dateSpend) {
        this.dateSpend = dateSpend;
    }

    // Перевод исходного массива в строку
    public String getAttend(){
        String att = "";
        for(Students at : atten){
            att = att + "" + at;
        }
        return att;
    }

    // конвертация всего класса в строку
    @Override
    public String toString(){
        return String.format(" Дата проведения: %s \n Присутствующие студенты: %s \n " +
                            " Курс: %s  \n Время начала: %s \n" +
                            "Домашняя задание: %s   \n" +
                            " Экзамен: %s",dateSpend, getAttend(), super.getCours(),
                            super.getDateStart(), homeWorks, exam);
    }

}
