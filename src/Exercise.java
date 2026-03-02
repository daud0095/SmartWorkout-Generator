import java.util.ArrayList;

public class Exercise {
    private String name;
    private String muscleGroup;
    private int sets;
    private int reps;

    Exercise(String name, String muscleGroup, int sets, int reps){
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.sets = sets;
        this.reps = reps;
    }

    public String getName() {
        return name;
    }

    public String getMuscleGroup(){
        return muscleGroup;
    }

    public void setSets(int sets) {
        if(sets > 0) {
            this.sets = sets;
        } else {
            System.out.println("Du skal minimum har 1 set!");
        }
    }

    public void setReps(int reps){
        this.reps = reps;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", muscleGroup='" + muscleGroup + '\'' +
                ", sets=" + sets +
                ", reps=" + reps +
                '}';
    }
}

