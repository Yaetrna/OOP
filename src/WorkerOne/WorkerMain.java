package WorkerOne;

public class WorkerMain {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.workerName = "Leo Lustig";
        worker.workerID = 11;
        worker.hourlyWage = 17.50;
        worker.workingTime = 149;

        System.out.println("Entgelt: " + worker.getGrossWage());

        worker.changeHourlyWage(2.5);
        worker.workingTime = 153;

        System.out.println("Entgelt: " + worker.getGrossWage());
    }
}
