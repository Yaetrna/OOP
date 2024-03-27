package Methoden;

public class Worker {
    int workerID;
    double hourlyWage;
    double workingTime;
    String workerName;

    public double getWorkingTime() {
        return this.workingTime;
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
