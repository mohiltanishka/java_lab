class ReverseArray {
    void reverse(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int a[] = {10, 20, 30, 40, 50};
        obj.reverse(a);
    }
}