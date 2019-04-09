package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double totalNumberOfHours;

    public Student() {
        this(0);
    }

    public Student(Integer id) {
        this.id = id;
        totalNumberOfHours = 0d;
    }

    public void learn(Double amountOfHours) {
        if (amountOfHours >= 0d) {
            totalNumberOfHours += amountOfHours;
        }
    }

    public Double getTotalStudyTime() {
        return totalNumberOfHours;
    }
}
