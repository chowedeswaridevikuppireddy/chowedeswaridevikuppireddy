import java.util.Scanner;

class Main11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        Sample sample = new Sample(); 
        sample.method(num); 
    }
}

class Sample {
    void method(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        System.out.println(count == 2 ? "prime" : "not prime");
    }
}
