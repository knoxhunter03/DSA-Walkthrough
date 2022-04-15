import java.util.ArrayList;
import java.util.Stack;

class maxHistoigramArea{
    class Pair{
        int first;
        int second;

        public Pair(int x, int y){
            this.first = x;
            this.second = y;
        }
    }

   int[] maxArea(int hist[], int n){
        Stack<Pair> s = new Stack<>();
        ArrayList<Integer> left = new ArrayList<>();
        int psudeoInt = -1;

        // NSL
        for(int i = 0; i < n; i++){
            if(s.size() == 0){
                left.add(psudeoInt);
            }
            else if(s.size() > 0 && s.peek().first > hist[i]){
                left.add(s.peek().second);
            }
            else if(s.size() > 0 && s.peek().first <= hist[i]){
                while (s.size() > 0 && s.peek().first <= hist[i]){
                    s.pop();
                }

                if (s.size() == 0){
                    left.add(psudeoInt);
                }
                else
                    left.add(s.peek().second);
            }
            s.push(new Pair(hist[i], i));
        }

        s.clear();
        psudeoInt = n;

        // NSR
        ArrayList<Integer> right = new ArrayList<>();
        for(int i = n; i >= 0; i--){
            if(s.size() == 0){
                right.add(psudeoInt);
            }
            else if(s.size() > 0 && s.peek().first > hist[i]){
                right.add(s.peek().second);
            }
            else if(s.size() > 0 && s.peek().first <= hist[i]){
                while (s.size() > 0 && s.peek().first <= hist[i]){
                    s.pop();
                }

                if (s.size() == 0){
                    right.add(psudeoInt);
                }
                else
                    right.add(s.peek().second);
            }
            s.push(new Pair(hist[i], i));
        }

        int[] width = new int[n];
        int[] area = new int[n];

        int max = -1;
        for(int i = 0; i < n; i++){
            width[i] = right.get(i) - left.get(i) - 1;
            area[i] = hist[i] * width[i];

        }

        return area;
    }

    public static void main(String[] args) {
        maxHistoigramArea m = new maxHistoigramArea();
        int[] arr = {6,2,5,4,5,1,6};
        int[] maximum = m.maxArea(arr, arr.length);

        for (int i = 0; i <= maximum.length; i++){
            System.out.println(maximum[i]);
        }





    }
}