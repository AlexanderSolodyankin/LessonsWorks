package Lessons.lessons21;

 class Cours extends Money {
    private double usd;
    private double eur;
    private double som;

    public Cours(){}



    public Cours(Money sum){
        if(isTarget()) { // продажа
            if (getVarMoney().equals("SOM")) {
                this.usd = getMoney() / 69;
                this.som = getMoney();
                this.eur = getMoney() / 79;
            }
            if (getVarMoney().equals("USD")) {
                this.usd = getMoney();
                this.som = getMoney() * 69;
                this.eur = this.som / 79;
            }
            if (getVarMoney().equals("EUR")) {
                this.eur = getMoney();
                this.som = getMoney() * 79;
                this.usd = this.som / 69;
            }
        }
        else { // покупка
            if (getVarMoney().equals("SOM")) {
                this.usd = getMoney() / 70;
                this.som = getMoney();
                this.eur = getMoney() / 80;
            }
            if (getVarMoney().equals("USD")) {
                this.usd = getMoney();
                this.som = getMoney() * 70;
                this.eur = this.som / 80;
            }
            if (getVarMoney().equals("EUR")) {
                this.eur = getMoney();
                this.som = getMoney() * 80;
                this.usd = this.som / 70;
            }
        }
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    public double getSom() {
        return som;
    }

    public void setSom(double som) {
        this.som = som;
    }

    @Override
     public String toString(){
        return String.format("Будет после конвертации:\n" +
                "Долары: %s\n" +
                "Сом: %s\n" +
                "Евро: %s",usd, som, eur);
    }
}
