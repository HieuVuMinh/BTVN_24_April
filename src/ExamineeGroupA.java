public class ExamineeGroupA extends Examinee{
    private double mathScores;
    private double physicsScore;
    private double chemistryScore;

    public ExamineeGroupA(){}

    public ExamineeGroupA(double mathScores, double physicsScore, double chemistryScore) {
        this.mathScores = mathScores;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    public ExamineeGroupA(int orderNumber, String name, String address, String areasOfPriority, double mathScores, double physicsScore, double chemistryScore) {
        super(orderNumber, name, address, areasOfPriority);
        this.mathScores = mathScores;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    public double getMathScores() {
        return mathScores;
    }

    public void setMathScores(double mathScores) {
        this.mathScores = mathScores;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    @Override
    public String toString() {
        return "ExcamineeGroupA{ orderNumber: " + getOrderNumber() + ", name: '" + getName() + '\'' +
                ", address: '" + getAddress() + '\'' + ", Areas Of Priority: '" + getAreasOfPriority() +
                ", Math Scores: " + mathScores + ", Physics Score: " + physicsScore +
                ", Chemistry Score: " + chemistryScore + '}';
    }
}
