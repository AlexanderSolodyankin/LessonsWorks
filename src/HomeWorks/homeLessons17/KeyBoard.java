package HomeWorks.homeLessons17;

public class KeyBoard {
     private int numKeys;
     private boolean light;
     private boolean numBoard;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public  KeyBoard(int numKeys, boolean light, boolean numBoard){
        this.numKeys = numKeys;
        this.numBoard = numBoard;
        this.light=light;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setNumKeys(int num){
        numKeys = num;
    }
    public int getNumKeys(){
        return numKeys;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setLight(boolean light){
        this.light=light;
    }
    public boolean isLight(){
        return light;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setNumBoard(boolean numBoard) {
        this.numBoard = numBoard;
    }

    public boolean isNumBoard() {
        return numBoard;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString(){
        if (numBoard && light) {
            return String.format("Клавиатура \n" +
                    "Клавиатура имеет: %s клавишь \n" +
                    "Имеет подсветку и ддополнительную клавиатуру", getNumKeys());
        }
        if(!numBoard && light){
            return String.format("Клавиатура \n" +
                    "Клавиатура имеет: %s клавишь \n" +
                    "Имеет подсветку, дополнительной клавиатуры не имеет", getNumKeys());
        }
        if(numBoard && !light){
            return String.format("Клавиатура \n" +
                    "Клавиатура имеет: %s клавишь \n" +
                    "Не имеет подсветку, дополнительная клавиатура присутствует", getNumKeys());
        }
        else {
            return String.format("Клавиатура \n" +
                    "Клавиатура имеет: %s клавишь \n" +
                    "Не имеет подсветку и нет дополнительной клавиатуры", getNumKeys());
        }
    }
}
