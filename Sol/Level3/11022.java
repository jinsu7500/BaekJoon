import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) throws IOException {
 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int A;
		int B;
 
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
        
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
            
			sb.append("Case #" + i + ": ").append(A + " + " + B + " = " + (A+B)).append('\n');
		}
		br.close();
		System.out.println(sb);
	}
 
}
