package searching;

import java.util.Scanner;

public class QuickUnion {

    private int idArr[];

    public QuickUnion(int N) {
        idArr = new int[N];
        for (int i = 0; i < idArr.length; i++) {
            idArr[i] = i;
        }
    }

    public int findRoot(int N) {
        int root = N;
        while (root != idArr[N]) {
            root = idArr[N];
        }
        return root;
    }

    public boolean connected(int p, int q) {
        return findRoot(p)==findRoot(q);
    }

    public void union(int p, int q) {
        int proot = findRoot(p);
        int qroot = findRoot(q);
        idArr[proot] = qroot;
    }


    public static void main(String[] args) {
        System.out.println("Give your size of array");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        QuickUnion uf = new QuickUnion(N);
        System.out.println("Give two integers within 0 to " + (uf.idArr.length -1) + " separated by whitespace to connect the integers" );
        while (scan.hasNext()) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println("Connected " + p + " with " + q);
                System.out.println("Checking connected() method " + uf.connected(p,q));
            }
        }
    }
}
