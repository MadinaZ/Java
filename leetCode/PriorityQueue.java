class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public double getCGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

}

class Priorities{
    public static List<Student> getStudents(List<String> events){

        PriorityQueue<Student> queue = new PriorityQueue<>(Comparator.comparing(Student::getCGpa).reversed()
                .thenComparing(Student::getName).thenComparing(Student::getId));
        List<Student> students = new ArrayList<>();

        for (String s : events) {
            Scanner in = new Scanner(s);
            //if you put System.in it expects input from the console
            //now it expects input from the arguments passed in(that are separated by space)
            String event = in.next();
            if (s.startsWith("ENTER")) {
                String name = in.next();
                double cgpa = in.nextDouble();
                int id = in.nextInt();

                Student student = new Student(name, id, cgpa);
                queue.add(student);
            } else if (s.startsWith("SERVED")) {
                queue.poll();
            }
            in.close();
        }

        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }
        return students;

    }
}

public class Main {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

