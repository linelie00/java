import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String course[] = {"Java","C++","HTML5","ComputerStructure","Android"};
        int score[] = {95, 88, 76, 62, 55};
        while(true) {
            String subject = scanner.nextLine();
            if (subject.equals("-1"))
                break;
            for (int i = 0; i<5; i++) {
                if (subject.equals(course[i])) {
                    System.out.print(course[i]+" : "+score[i]+"\n");
                    break;
                }
                else if(i == 4)
                    System.out.print("N/A\n");
            }
        }
    }
}
