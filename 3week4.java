public class Main {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (i!=0 && j!=0 && i%3==0 && j%3==0)
                    System.out.print((i*10+j) + " jjakjjak\n");
                else if (i!=0 && i%3==0)
                    System.out.print((i*10+j) + " jjak\n");
                else if (j!=0 && j%3==0)
                    System.out.print((i*10+j) + " jjak\n");
            }
        }
    }
}
