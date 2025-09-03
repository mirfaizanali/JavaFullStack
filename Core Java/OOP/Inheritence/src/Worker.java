public class Worker {

    private String name;

    private String birthDate;
    private String endDate;

    public Worker() {}

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        int currentyear = 2025;
        int birthyear = Integer.parseInt(birthDate.substring(6));
        return  (currentyear-birthyear);
    }

    public double collectPay(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
