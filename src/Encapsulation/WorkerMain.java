package Encapsulation;

public class WorkerMain {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setWorkerName("Frieda Fleissig");
        worker.setWorkerID(15);
        worker.setHourlyWage(16.5);

        worker.setWorkingTime(203);
        System.out.println(worker.getGrossWage());

        worker.changeHourlyWage(2.5);

        worker.setWorkerName("Frieda Emsig");

        System.out.println(worker.getWorkerName());
        System.out.println(worker.getHourlyWage());
    }
}
