class Arr {
  public static void main(String[] args) {
    int[] arr = {1, 7, 2, 3, 4, 5};

    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      System.out.println("Element " + arr[i] + " is repeated " + count + " times");
    }
  }
}