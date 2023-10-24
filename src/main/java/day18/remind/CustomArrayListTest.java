package day18.remind;

public class CustomArrayListTest {
    public static void main(String[] args) {

        CustomArrayList customArrayList = new CustomArrayList();

        customArrayList.add(10);
        customArrayList.add(20);
        customArrayList.add(30);
        customArrayList.add(40);
        customArrayList.add(50);
        System.out.println(customArrayList);

        customArrayList.add(1, 60);
        System.out.println(customArrayList);
        customArrayList.add(3, 50);
        System.out.println(customArrayList);

        customArrayList.remove(4);
        System.out.println(customArrayList);
    }
}

class CustomArrayList {
    private int size;

    private int[] innerArray;

    public CustomArrayList() {
        this.innerArray = new int[size];
    }

    public void add(int num) {

        int[] oldArr = getOldArrAndSetThisArray(1);
        if (oldArr != null) {
            this.innerArray = new int[this.size];

            this.innerArray[this.size - 1] = num;
            for (int i = 0; i < oldArr.length; i++) {
                this.innerArray[i] = oldArr[i];
            }
        }
    }

    public void add(int index, int num) {

        int[] oldArr = getOldArrAndSetThisArray(1);
        if (oldArr != null) {
            this.innerArray[index] = num;
            for (int i = 0; i < oldArr.length; i++) {
                int jumpIndex = i;
                if (i >= index) jumpIndex++;
                this.innerArray[jumpIndex] = oldArr[i];
            }
        }

    }

    public void remove(int index) {

        int[] oldArr = getOldArrAndSetThisArray(-1);
        if (oldArr != null) {
            for (int i = 0; i < oldArr.length; i++) {
                int jumpIndex = i;
                if (i == index) continue;
                if (i > index) jumpIndex--;
                this.innerArray[jumpIndex] = oldArr[i];
            }
        }

    }

    private int[] getOldArrAndSetThisArray(int plusNum) {
        if (plusNum < 2 && plusNum > -2) {
            int[] oldArr = this.innerArray;
            if (this.size == 0 && plusNum < 1) return null;
            this.size += plusNum;
            this.innerArray = new int[size];
            return oldArr;
        }
        return null;
    }

    @Override
    public String toString() {
        int commaIdx = 0;
        String rtStr = "[";

        for (int i = 0; i < this.innerArray.length; i++) {
            if (commaIdx != 0) rtStr += ", ";
            rtStr += String.valueOf(this.innerArray[i]);
            commaIdx++;
        }

        rtStr += "]";
        return rtStr;
    }

}

