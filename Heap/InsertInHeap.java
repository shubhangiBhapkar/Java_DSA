import java.util.ArrayList;

public class InsertInHeap {

    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {

            arr.add(data);
            int x = arr.size() - 1; // child index
            int par = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(par)) { // O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        // peek
        public int peek() {
            return arr.get(0);
        }

        // fix the heap
        private void heapify(int i) {

            int left = (2 * i + 1);
            int right = (2 * i + 2);
            int mididx = i;

            if (left < arr.size() && arr.get(left) < arr.get(mididx)) {
                mididx = left;

            }

            if (right < arr.size() && arr.get(right) < arr.get(mididx)) {
                mididx = right;
            }

            if (mididx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(mididx));
                arr.set(mididx, temp);

                heapify(mididx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // swap 1st ele with the last ele
            int lastIndex = arr.size() - 1;
            int temp = arr.get(0);
            arr.set(0, arr.get(lastIndex));
            arr.set(lastIndex, temp);

            // remove last element
            arr.remove(arr.size() - 1);

            // heapify
            heapify(0);
            return data;

        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String args[]) {
        Heap hp = new Heap();
        hp.add(3);
        hp.add(4);
        hp.add(1);
        hp.add(5);

        while (!hp.isEmpty()) {
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}
