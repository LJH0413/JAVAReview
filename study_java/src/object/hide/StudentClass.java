package object.hide;

public class StudentClass {

    private String name;
    private int score;

    public StudentClass(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void getInfo(){
        System.out.println("-- getInfo() --");
        System.out.println("name: " + name);
        System.out.println("score: " + score);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
