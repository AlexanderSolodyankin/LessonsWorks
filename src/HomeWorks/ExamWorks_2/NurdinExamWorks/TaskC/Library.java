package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskC;

public class Library {
    private ArtDepartment artDepartment = new ArtDepartment();
    private LegalDepartment legalDepartment = new LegalDepartment();
    private TechnicalDepartment technicalDepartment = new TechnicalDepartment();

    public Library() {
    }

    public Library(ArtDepartment artDepartment, LegalDepartment legalDepartment,
                   TechnicalDepartment technicalDepartment) {
        this.artDepartment = artDepartment;
        this.legalDepartment = legalDepartment;
        this.technicalDepartment = technicalDepartment;
    }

    @Override
    public String toString() {
        return "Library{" +
                "artDepartment=" + artDepartment +
                ", legalDepartment=" + legalDepartment +
                ", technicalDepartment=" + technicalDepartment +
                '}';
    }

    public ArtDepartment getArtDepartment() {
        return artDepartment;
    }

    public void setArtDepartment(ArtDepartment artDepartment) {
        this.artDepartment = artDepartment;
    }

    public LegalDepartment getLegalDepartment() {
        return legalDepartment;
    }

    public void setLegalDepartment(LegalDepartment legalDepartment) {
        this.legalDepartment = legalDepartment;
    }

    public TechnicalDepartment getTechnicalDepartment() {
        return technicalDepartment;
    }

    public void setTechnicalDepartment(TechnicalDepartment technicalDepartment) {
        this.technicalDepartment = technicalDepartment;
    }
}
