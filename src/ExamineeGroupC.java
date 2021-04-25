public class ExamineeGroupC extends Examinee{
    private double literatureScore;
    private double historyScore;
    private double geographyScore;

    public ExamineeGroupC(){}

    public ExamineeGroupC(double literatureScore, double historyScore, double geographyScore) {
        this.literatureScore = literatureScore;
        this.historyScore = historyScore;
        this.geographyScore = geographyScore;
    }

    public ExamineeGroupC(int orderNumber, String name, String address, String areasOfPriority, double literatureScore, double historyScore, double geographyScore) {
        super(orderNumber, name, address, areasOfPriority);
        this.literatureScore = literatureScore;
        this.historyScore = historyScore;
        this.geographyScore = geographyScore;
    }

    public double getLiteratureScore() {
        return literatureScore;
    }

    public void setLiteratureScore(double literatureScore) {
        this.literatureScore = literatureScore;
    }

    public double getHistoryScore() {
        return historyScore;
    }

    public void setHistoryScore(double historyScore) {
        this.historyScore = historyScore;
    }

    public double getGeographyScore() {
        return geographyScore;
    }

    public void setGeographyScore(double geographyScore) {
        this.geographyScore = geographyScore;
    }

    @Override
    public String toString() {
        return "ExamineeGroupC{ orderNumber: " + getOrderNumber() + ", name: '" + getName() + '\'' +
                ", address: '" + getAddress() + '\'' + ", Areas Of Priority: '" + getAreasOfPriority() +
                ", Literature Score: " + literatureScore + ", History Score: " + historyScore +
                ", Geography Score: " + geographyScore + '}';
    }
}
