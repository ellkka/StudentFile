import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner list = new Scanner(System.in);
        System.out.println("Enter a new user?");
        boolean add = list.nextBoolean();

        while (add){
            Student stud = new Student();
            Student max = new Student();
            System.out.println("Enter student name:");
            stud.setName(list.next());
            System.out.println("How old is the student?");
            stud.setAge(list.nextInt());
            System.out.println("Is student married?");
            stud.setMarried(list.nextBoolean());

            System.out.println("Do you want to add new user?");
            add = list.nextBoolean();
            }
    }

//        Scanner list = new Scanner(System.in);
//        System.out.println("Input number of students: ");
//        int size = Integer.parseInt(list.nextLine().trim());
//        System.out.println("Enter Name, age, status: ");
//        Student stud = new Student();
//        Student max = new Student();
//
//        for (int i = 0; i < size; i ++){
//            stud.setName(list.next());
//            stud.setAge(list.nextInt());
//            stud.setMarried(list.nextBoolean());
//            if (max.getAge() < stud.getAge() && stud.isMarried()){
//                max.setName(stud.getName());
//                max.setAge(stud.getAge());
//            }
//        }
//        System.out.println(max.getName() +"Is the oldest student not married. He is "+ max.getAge() + "old.");
//        list.close();

    }

