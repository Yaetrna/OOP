package Methoden;

public class WorkerMain {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.workerName = "Leo Lustig";
        worker.workerID = 11;
        worker.hourlyWage = 12.0;
        worker.workingTime = 149;

        System.out.println(worker.getGrossWage());

        worker.changeHourlyWage(3.5, 0.5);
        System.out.println(worker.hourlyWage);

        worker.workingTime = 153;
        System.out.println(worker.getGrossWage());

        Worker worker1 = new Worker();
        worker1.workerName = "Klara Kluge";
        worker1.workerID = 14;
        worker1.hourlyWage = 20.0;
        worker1.workingTime = 172;

        System.out.println(worker1.getGrossWage());

        worker1.changeHourlyWage(3.5, 0.5);
        System.out.println(worker1.hourlyWage);

        Worker worker2 = new Worker();
        worker2.workerName = "Frieda Fleißig";
        worker2.workerID = 15;
        worker2.hourlyWage = 16.5;
        worker2.workingTime = 203;

        System.out.println(worker2.getGrossWage());
    }
}
