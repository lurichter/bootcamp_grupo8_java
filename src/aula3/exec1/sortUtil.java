package aula3.exec1;

public class sortUtil {

    public static <T> void sort(Precedente<T> arr[]) {

        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].precedeA(arr[j+1]) == 0) {
                    Precedente<T> temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
