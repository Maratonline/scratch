public class Test {
    public static void main(String[] a) {
        int[] array = {1, 2, 1, 3, 3, 4, 6, 7, 11};
        int[] array2 = {12, 2, -5, 15, 177, 78, 38};
        int bestPlayer = 6;
        int[] arResult = merge(array, bobleSort(array2));
        for(int i : arResult)
            System.out.print(i +" ");
        System.out.println();
        System.out.println(binSearch(arResult, 13));
    }

    public static int binSearch(int[] a, int b){
        int r = a.length/2;
        while ( r>0 || r < a.length){
            if (a[r] > b){
                r = r/2;
            } else if (a[r] < b){
                r = r + (a.length - r)/2;
            } else
                return r;
        }
        return -1;
    }

    public static int[] bobleSort(int[] a) {
        int b = 0;
        boolean s = false;
        while (!s) {
            s = true;
            for (int i = 0; i < a.length - 1; ++i) {
                if (a[i] > a[i + 1]) {
                    b = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = b;
                    s = false;
                }
            }
        }
        return a;
    }

    public static int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] r = new int[a.length + b.length];
        while (k < a.length && k < b.length) {
            if (a[i] <= b[j])
                r[k++] = a[i++];
            else
                r[k++] = b[j++];
        }
        while (i < a.length)
            r[k++] = a[i++];
        while (j < b.length)
            r[k++] = b[j++];
        return r;
    }
}
