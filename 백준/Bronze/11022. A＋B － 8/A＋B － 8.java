import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        int[] result = new int[repeat];
        int[] procedure = new int[repeat*2];
        int j = 0;
        for(int i=0; i<repeat; i++){
            String line = br.readLine();
            String[] nums = line.split(" ");
            result[i] = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
            procedure[j] = Integer.parseInt(nums[0]);
            procedure[j+1] = Integer.parseInt(nums[1]);
            j+=2;
        }
        j=0;
        for(int i=0; i<repeat; i++){
            bw.write("Case #"+(i+1)+": "+procedure[j]+" + "+procedure[j+1]+" = "+result[i] + "\n");
            j+=2;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}