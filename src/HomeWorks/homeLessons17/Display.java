package HomeWorks.homeLessons17;

public class Display {
    private int diagonal;
    private String manufacturer;
    private  String matrixType;


    public Display(){

    }

    public Display(int diagonal, String manufacturer, String matrixType){
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.matrixType = matrixType;
    }

    @Override
    public String toString(){
        return String.format(" Монитор \n " +
                             "Диагональ: %s, \n" +
                             "Производитель: %s \n" +
                             "Тип матрицы: %s", getDiagonal(), getManufacturer(), getMatrixType());
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setDiagonal(int diagonal){
        if(diagonal <= 0){
            System.err.println("Неверрно введено значение");
        }else {
            this.diagonal = diagonal;
        }
    }
    public int getDiagonal() {
        return diagonal;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public String getMatrixType() {
        return matrixType;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
