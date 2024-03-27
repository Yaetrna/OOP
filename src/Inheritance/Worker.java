package Inheritance;

public class Worker {
    private int workerID;
    private double hourlyWage;
    private double workingTime;
    private String workerName;

    public Worker(int workerID, String workerName) {
        this.workerID = workerID;
        this.workerName = workerName;
    }

    public Worker(int workerID, String workerName, double hourlyWage) {
        this.workerID = workerID;
        this.workerName = workerName;
        this.hourlyWage = hourlyWage;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setWorkingTime(double workingTime) {
        this.workingTime = workingTime;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public int getWorkerID() {
        return this.workerID;
    }

    public double getHourlyWage() {
        return this.hourlyWage;
    }

    public double getWorkingTime() {
        return this.workingTime;
    }

    public String getWorkerName() {
        return this.workerName;
    }

    public double getGrossWage() {
        double bonus;
        if (this.workingTime > 160.0) {
            if (this.workingTime > 180.0) {
                bonus = (this.workingTime - 180.0) * this.hourlyWage * 1.1 * 1.05;
            } else {
                bonus = (this.workingTime - 160.0) * this.hourlyWage * 1.1;
            }
        } else {
            return this.hourlyWage * this.workingTime;
        }
        return this.hourlyWage * 160.0 + bonus;
    }

    public void changeHourlyWage(double percent, double minimumChange) {
        double newWage = this.hourlyWage * (1 + percent / 100);
        this.hourlyWage = Math.max(newWage, this.hourlyWage + minimumChange);
    }

    public void changeHourlyWage(double percent) {
        this.hourlyWage *= 1 + percent / 100;
    }
}
