import somepackage.Other;
import somepackage.Some;
import somethinggreen.Contract;

public class Test {
    public static void main(String[] args) {
        Some some = new Some();
        System.out.println(some.noMoreSecrets);
        System.out.println(some.getNoMoreSecrets());
        System.out.println(some.getSecret());
        System.out.println(some.getДаТакТожеМожно());

    }
}
