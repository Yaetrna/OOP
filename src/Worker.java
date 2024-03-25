public class Worker {
    int workerID;
    double hourlyWage;
    double workingTime;
    String workerName;

    public double getWorkingTime() {
        return this.workingTime;
    }

    public double getGrossWage() {
        return this.workingTime * this.hourlyWage;
    }

    public void changeHourlyWage(double percent) {
        this.hourlyWage *= (1 + (percent / 100));
    }
}
