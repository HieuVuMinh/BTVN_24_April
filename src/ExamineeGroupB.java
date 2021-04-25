public class ExamineeGroupB extends Examinee{
    private double mathScores;
    private double chemistryScore;
    private double biologyScore;

    public ExamineeGroupB(){}

    public ExamineeGroupB(double mathScores, double chemistryScore, double biologyScore) {
        this.mathScores = mathScores;
        this.chemistryScore = chemistryScore;
        this.biologyScore = biologyScore;
    }

    public ExamineeGroupB(int orderNumber, String name, String address, String areasOfPriority, double mathScores, double chemistryScore, double biologyScore) {
        super(orderNumber, name, address, areasOfPriority);
        this.mathScores = mathScores;
        this.chemistryScore = chemistryScore;
        this.biologyScore = biologyScore;
    }

    public double getMathScores() {
        return mathScores;
    }

    public void setMathScores(double mathScores) {
        this.mathScores = mathScores;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public double getBiologyScore() {
        return biologyScore;
    }

    public void setBiologyScore(double biologyScore) {
        this.biologyScore = biologyScore;
    }

    @Override
    public String toString() {
        return "ExamineeGroupB{ orderNumber: " + getOrderNumber() + ", name: '" + getName() + '\'' +
                ", address: '" + getAddress() + '\'' + ", Areas Of Priority: '" + getAreasOfPriority() +
                ", Math Scores: " + mathScores + ", Chemistry Score: " + chemistryScore +
                ", Biology Score: " + biologyScore + '}';
    }
}
