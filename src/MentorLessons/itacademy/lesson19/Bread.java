package MentorLessons.itacademy.lesson19;

public class Bread {
    double weight;
    double pricd;
    String producerCompany;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPricd() {
        return pricd;
    }

    public void setPricd(double pricd) {
        this.pricd = pricd;
    }

    public String getProducerCompany() {
        return producerCompany;
    }

    public void setProducerCompany(String producerCompany) {
        this.producerCompany = producerCompany;
    }

    void bake() {
        System.out.println("Bake bread");
    }

    void pack() {
        System.out.println("Pack bread");
    }
}
