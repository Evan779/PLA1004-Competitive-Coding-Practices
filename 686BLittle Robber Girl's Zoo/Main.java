import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] data = new int[n];
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
 
		for (int i = 0; i < n; i++)
			data[i] = Integer.parseInt(st.nextToken());
		int i = 0;
		int j = 0;
		while (true) {
			
			for (i = 0; i < n - 1; i++) {
				if (data[i] <= data[i + 1])
					continue;
				else
					break;
			}
 
			if (i == n - 1)
				break;
 
			
			for (j = 0; i + j < n - 1; j += 2) {
				if (data[i + j] <= data[i + j + 1])
					break;
				else {
					int temp = data[i + j];
					data[i + j] = data[i + j + 1];
					data[i + j + 1] = temp;
				}
			}
 
			System.out.println((i + 1) + " " + (i + j));
		}
	}
}
