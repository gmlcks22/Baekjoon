import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> xArr = new ArrayList<Integer>();
        ArrayList<Integer> yArr = new ArrayList<Integer>();

        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            xArr.add(Integer.parseInt(st.nextToken()));
            yArr.add(Integer.parseInt(st.nextToken()));
        }

        int xMax = Integer.MIN_VALUE, yMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE, yMin = Integer.MAX_VALUE;

        for(int i=0; i<xArr.size(); i++){
            int x = xArr.get(i);
            int y = yArr.get(i);

            if(x > xMax) xMax = x;
            if(x < xMin) xMin = x;
            if(y > yMax) yMax = y;
            if(y < yMin) yMin = y;
        }

        System.out.print((xMax - xMin) * (yMax - yMin));
    }
}