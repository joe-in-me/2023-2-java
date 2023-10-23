package day18.ch7;

public class MyArrayList {
    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int value) {
        int index = this.arr.length;

        int[] newArray = new int[index + 1];
        for (int i = 0; i < this.arr.length; i++) {
            newArray[i] = this.arr[i];
        }
        newArray[index] = value;
        this.arr = newArray;
    }

    public void add(int index, int value) {
        int[] newArr = new int[this.arr.length + 1];
        for (int i = 0; i < this.arr.length; i++) {
            int newIdx = i;
            if (i >= index) newIdx++;
            newArr[newIdx] = this.arr[i];
        }
        newArr[index] = value;
        this.arr = newArr;

    }

    public void add(int index, int value, boolean v2) {
        int[] newArr = new int[this.arr.length + 1];
        for (int i = 0; i < this.arr.length; i++) {
            newArr[i < index ? i : i + 1] = this.arr[i];
        }
        newArr[index] = value;
        this.arr = newArr;

    }


    @Override
    public String toString() {
        String tmp = "[";
        if (this.arr.length != 0) {
            tmp += String.valueOf(this.arr[0]);
            for (int i = 1; i < this.arr.length; i++) {
                tmp += ", " + this.arr[i];
            }

        }
        tmp += "]";
        return tmp;
    }
}

class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 40); // [10, 40, 20, 30]



        System.out.println(list);
    }
}
