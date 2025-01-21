import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        int[] result = new int[repeat];

        for(int i=0; i<repeat; i++){
            String line = br.readLine();
            String[]nums = line.split(" ");
            result[i] = Integer.valueOf(nums[0]) + Integer.valueOf(nums[1]);
        }
        for(int i=0; i<repeat; i++){
            bw.write(result[i] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}