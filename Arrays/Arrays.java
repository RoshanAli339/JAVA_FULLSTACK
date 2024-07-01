class Question1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        double avg = 0.0;

        for (int i : arr) {
            sum += i;
        }

        avg = (double) sum / arr.length;

        System.out.println("Sum of array : " + sum);
        System.out.println("Average of array : " + avg);
    }
}

class Question2 {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 12, 6, 4, 19 };

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int v : arr) {
            if (v < minValue)
                minValue = v;
            if (v > maxValue)
                maxValue = v;
        }

        System.out.println("Maximum value : " + maxValue);
        System.out.println("Minimum value : " + minValue);
    }
}

class Question3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Only 1 argument is allowed");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int arr[] = { 1, 4, 34, 56, 7 };
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                idx = i;
                break;
            }
        }

        System.out.println(idx);

    }
}

class Question4 {
    public static void main(String[] args) {
        int arr[] = { 67, 69, 72, 79, 80 };

        for (int i : arr) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }
}

class Question5 {
    public static void main(String[] args) {
        int arr[] = { 9, 12, 15, 3, 2, 14 };
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int v : arr) {
            if (v > max2) {
                if (v > max1) {
                    max2 = max1;
                    max1 = v;
                } else {
                    max2 = v;
                }
            }

            if (v < min2) {
                if (v < min1) {
                    min2 = min1;
                    min1 = v;
                } else {
                    min2 = v;
                }
            }
        }

        System.out.println("Largest 2 numbers : " + max1 + ", " + max2);
        System.out.println("Smallest 2 numbers : " + min1 + ", " + min2);
    }
}

class Question6 {

    static int partition(int arr[], int l, int h) {
        int pivot = arr[h];

        int i = l - 1;

        for (int j = l; j <= h; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return (i + 1);
    }

    static void quickSort(int arr[], int l, int h) {
        if (l < h) {
            int pivot = partition(arr, l, h);

            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot + 1, h);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array : ");
        for (int v : arr)
            System.out.print(v + " ");
        System.out.println();
    }
}

class Question7 {
    static int searchArray(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter atleast 1 integer!");
            return;
        }

        int arr[] = new int[args.length];
        for (int i = 0; i < args.length; i++)
            arr[i] = Integer.parseInt(args[i]);

        int temp[] = new int[arr.length];
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (searchArray(temp, idx + 1, arr[i]) == -1) {
                temp[++idx] = arr[i];
            }
        }

        arr = new int[idx + 1];
        for (int i = 0; i <= idx; i++)
            arr[i] = temp[i];

        System.out.print("After removing duplicates : ");
        for (int v : arr)
            System.out.print(v + " ");
        System.out.println();
    }
}

class Question8 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter atleast 1 element!");
            return;
        }
        int arr[] = new int[args.length];
        for (int i = 0; i < args.length; i++)
            arr[i] = Integer.parseInt(args[i]);

        int sum = 0;
        int tempSum = 0;
        boolean seenSix = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                seenSix = true;
                tempSum += arr[i];
            } else if (arr[i] == 7) {
                if (seenSix) {
                    seenSix = false;
                    tempSum = 0;
                } else {
                    sum += arr[i];
                }
            } else if (seenSix) {
                tempSum += arr[i];
            } else {
                sum += arr[i];
            }
        }

        if (seenSix)
            sum += tempSum;

        System.out.println("Sum = " + sum);
    }
}

class Question9 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Enter atleast 1 arguments");
            return;
        }
        int arr[] = new int[args.length];
        for (int i = 0; i < args.length; i++)
            arr[i] = Integer.parseInt(args[i]);
        
        int arr2[] = new int[arr.length];
        int count10 = 0;
        int idx = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 10){
                count10++;
                continue;
            }
            arr2[++idx] = arr[i];
        }
        for (int i = idx+1; i <= count10; i++)
            arr2[i] = 0;

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " "); 
        }
        System.out.println();
    }
}

class Question10{
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Enter atleast 1 arguments");
            return;
        }
        int arr[] = new int[args.length];
        int evenCount = 0;
        for (int i = 0; i < args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
            if ((arr[i] & 1) == 0)
                evenCount++;
        }

        int i = 0, j = evenCount;
        while (i < evenCount && j < arr.length){
            if (arr[i] % 2 == 0)
                i++;
            else if (arr[j] % 2 == 1)
                j++;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }

        for(int v : arr)
            System.out.print(v + " ");
        System.out.println();
    }
}

class Question11{
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Enter atleast 1 arguments");
            return;
        }
        int arr[] = new int[args.length];
        for (int i = 0; i < args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
            if (arr[i] != 1 && arr[i] != 4){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}

class Question12{
    public static void main(String[] args) {
        if (args.length != 6){
            System.err.println("Enter 6 arguments only");
            return;
        }
        int arr1[] = new int[3];
        for (int i = 0; i < 3; i++)
            arr1[i] = Integer.parseInt(args[i]);
        int arr2[] = new int[3];
        for (int i = 3; i < 6; i++)
            arr2[i - 3] = Integer.parseInt(args[i]);

        int arr3[] = new int[2];

        arr3[0] = arr1[1];
        arr3[1] = arr2[1];

        System.out.println(arr3[0] + ", " + arr3[1]);
    }
}

class Question13{
    public static void main(String[] args) {
        if (args.length != 4){
            System.out.println("Enter only 4 arguments");
            return;
        }

        int arr[][] = new int[2][2];
        int j;
        for (int i = 0; i < args.length; i++){
            j = i < 2 ? 0 : 1;
            arr[j][i % 2] = Integer.parseInt(args[i]);
        }

        System.out.println("The given array is: ");
        System.out.println(arr[0][0] + ", " + arr[0][1]);
        System.out.println(arr[1][0] + ", " + arr[1][1]);

        int temp = arr[0][0];
        arr[0][0] = arr[0][1];
        arr[0][1] = temp;

        temp = arr[1][0];
        arr[1][0] = arr[1][1];
        arr[1][1] = temp;

        temp = arr[0][0];
        arr[0][0] = arr[1][0];
        arr[1][0] = temp;

        temp = arr[0][1];
        arr[0][1] = arr[1][1];
        arr[1][1] = temp;

        System.out.println("The reverse of the array is: ");
        System.out.println(arr[0][0] + ", " + arr[0][1]);
        System.out.println(arr[1][0] + ", " + arr[1][1]);
    } 
}

class Question14{
    public static void main(String[] args) {
        if (args.length < 9){
            System.err.println("Please enter 9 integer numbers!");
            return;
        }
        int arr[][] = new int[3][3];
        int i, maxVal = Integer.MIN_VALUE;
        for (int j = 0; j < args.length; j++){
            i = j < 3 ? 0 : (j < 6 ? 1 : 2);
            arr[i][j % 3] = Integer.parseInt(args[j]);
            maxVal = arr[i][j % 3] > maxVal ? arr[i][j%3] : maxVal;
        }
        System.out.println("The given array is : ");
        for (i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("The biggest number in the given array is : " + maxVal);
    }
}