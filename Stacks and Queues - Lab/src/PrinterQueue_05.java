import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while(!line.equals("print")){
            if (line.equals("cancel")){
                String fileName = printerQueue.poll();
                if (fileName != null){
                    System.out.println("Canceled " + fileName);
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                printerQueue.offer(line);
            }
            line = scanner.nextLine();
        }
        for (String s : printerQueue) {
            System.out.println(s);
        }
    }
}
