package projecteuler1;
import java.util.HashSet;

/**
 *
 * @author Eynar Roshev
 */
public class ProjectEuler1 {
    public static void main(String[] args) {
        ProjectEuler1 pe1 = new ProjectEuler1();
        HashSet<Integer> m3 = pe1.multiples(3, 1000);
        HashSet<Integer> m5 = pe1.multiples(5, 1000);
        HashSet<Integer> m3m5 = new HashSet<Integer>(m3);
        m3m5.addAll(m5);
        int sum = 0;
        for (Integer i: m3m5) {
            sum += i;
        }
        System.out.println(sum);
        
    }

    HashSet<Integer> multiples(int n, int range) {
        HashSet<Integer> list = new HashSet<Integer>();
        int increment = 1;
        int multiple = n * increment;
        while (multiple < range) {
            list.add(multiple++);
            increment++;
            multiple = n * increment;
        }
        return list;
    }
}