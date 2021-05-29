package HomeWorks.homeWorks22.TaskA;


class Credit {
    private int id;
    private int sum;
    private String date;
    private int procent;

    private  static int count;
    private static  int countSum;




    public Credit(){count++;}
    public Credit(int id, int sum, String date, int procent){
        countSum = getCreditCountSum() + sum;
        count++;
        this.id = id;
        this.sum = sum;
        this.date = date;
        this.procent = procent;
    }

    public static int getCreditCount(){
        return count;
    }
    public static int getCreditCountSum(){
        return countSum;
    }
    public static String outInform(){
        return String.format("Количество кредитов: %s\n" +
                "Среднеарефметическое зночение: %s",count,countSum);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getProcent() {
        return procent;
    }

    public void setProcent(int procent) {
        this.procent = procent;
    }
}
