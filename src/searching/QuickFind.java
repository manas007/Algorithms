package searching;

import java.util.Scanner;

public class QuickFind {

    int[] storageArray = null;

    public QuickFind(int N) {
        storageArray = new int[N];
        for (int i = 0; i < storageArray.length; i++) {
            storageArray[i] = i;
            System.out.println(storageArray[i]);
        }
    }


    public void union(int p, int q) {
        int pval = storageArray[p];
        int qval = storageArray[q];
        for(int i =0; i< storageArray.length; i++){
            if(pval == storageArray[i]){
                storageArray[i] = qval;
            }
        }
        return;
    }

    public boolean connected(int p, int q) {
        return storageArray[p] == storageArray[q];
    }

    public static void main(String[] args) {
        System.out.println("Size of Array?");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        QuickFind uf = new QuickFind(N);
        while (scan.hasNext()) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            System.out.println("p is " + p);
            System.out.println("q is " + q);
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
        }
    }
}
