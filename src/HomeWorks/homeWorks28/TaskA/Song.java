package HomeWorks.homeWorks28.TaskA;

class Song {
    private String name;
    private String executor;
    private String genre;
    private String sonfText;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getSonfText() {
        return sonfText;
    }

    public void setSonfText(String sonfText) {
        this.sonfText = sonfText;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString(){
        return String.format("Название песни: %s\n" +
                "Исполнитель: %s \n" +
                "Жанр песни: %s\n" +
                "Текст Песни: %s\n",name,executor, genre, sonfText);
    }
}
