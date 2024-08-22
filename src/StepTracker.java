public class StepTracker {

    private int minimumSteps;
    private int steps;
    private int activeDays;
    private int days;


    public StepTracker (int num){
        this.minimumSteps =  num;
        days = 0;
        activeDays = 0;
        steps = 0;
    }

    public void addDailySteps(int a){
        steps += a;
        days ++;
        if (a >= minimumSteps) {activeDays++;}
    }

    public double averageSteps() {
        if (days > 0) {return (double)steps / (double)days;}
        return steps;
    }

    public int activeDays() {
        return activeDays;
    }

    public int getDays() {
        return days;
    }

    public int getStepsForActiveDay() {
        return minimumSteps;
    }

    public int getTotalSteps() {
        return steps;
    }

    public int getActiveDays() {
        return activeDays;
    }

}
