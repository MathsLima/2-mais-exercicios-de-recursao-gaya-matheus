public class exercicio4 {
    public static int soma(int k, int j) {
        if (k == j)
            return j;
        if (k < j)
            return k + soma(k + 1, j);
        else
            return soma(j, k);
    }

    public static void main(String[] args) {
        System.out.println(soma(2, 5));
    }
}