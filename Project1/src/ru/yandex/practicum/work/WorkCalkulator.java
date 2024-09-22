package ru.yandex.practicum.work;

public class WorkCalkulator {

    private int workingHours = 8;
    private String workerName;
    public double coefficient;

    public WorkCalkulator(String newName) {
        workerName = newName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public int calculate(int workDays) {
        return workDays * workingHours;
    }

    public double calculateWithCoefficient(int workDays) {
        return workDays * workingHours * coefficient;
    }
}