package z11;

public class Problem4 {
    public static int[] totalScore(String[][] arr){
        //Germany, Ireland, Poland , Scotland
        int[] totalArr = {0,0,0,0};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j+=2){
                if("Germany".equals(arr[i][j])){
                    totalArr[0] += Integer.parseInt(arr[i][j+1]);
                }
                if("Ireland".equals(arr[i][j])){
                    totalArr[1] += Integer.parseInt(arr[i][j+1]);
                }
                if("Poland".equals(arr[i][j])){
                    totalArr[2] += Integer.parseInt(arr[i][j+1]);
                }
                if("Scotland".equals(arr[i][j])){
                    totalArr[3] += Integer.parseInt(arr[i][j+1]);
                }
            }
        }
        return totalArr;
    }
    public static void main(String[] args) {
        String[][] arr = {{"Germany", "2", "Scotland", "1"},
                         {"Poland", "2", "Germany", "0"},
                         {"Germany", "1", "Ireland", "1"},
                         {"Poland", "2", "Scotland", "2"},
                         {"Scotland", "1", "Ireland", "0"},
                         {"Ireland", "1", "Poland", "1"},
                         {"Ireland", "1", "Scotland", "1"},
                         {"Germany", "3", "Poland", "1"},
                         {"Scotland", "2", "Germany", "3"},
                         {"Ireland", "1", "Germany", "0"},
                         {"Scotland", "2", "Poland", "2"},
                         {"Poland", "2", "Ireland", "1"}};
        int[] total = totalScore(arr);
        System.out.println("Germany score: " + total[0] +
                           "\nIreland score: " + total[1] +
                           "\nPoland score: " + total[2] +
                           "\nScotland score: " + total[3]);
    }
}
