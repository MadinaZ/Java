import java.util.*;

public class Main {
    public static void main(String[] args) {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            list.add(scan.next());
        }

        Collections.sort(list);

        System.out.println(list);

    }
}
