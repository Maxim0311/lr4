package chemical;

import chemical.classes.Compound;
import chemical.classes.CompoundComparator;

import java.util.*;

public class Main {
    private Compound read(Scanner sc){
        System.out.println("Введите t, e, r");
        int t = sc.nextInt();
        int e = sc.nextInt();
        int r = sc.nextInt();
        return new Compound(t, e, r);
    }

    private void run(){
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();

        System.out.println("Введите количество хим. соединений:");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            list.add(read(sc));
        }
        sort(list);
    }

    private void sort(ArrayList list) {
        Collections.sort(list, new CompoundComparator());
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
