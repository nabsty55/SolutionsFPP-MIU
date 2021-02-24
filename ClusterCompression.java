package practice;

import java.util.Arrays;

public class ClusterCompression {
	static int[] clusterCompression(int[] a) {
		int numClusters = 0;
		for(int i=0, j = i+1; i < a.length-1; i++, j++) {
			if(a[i] != a[j])
				numClusters ++;
			if(j == a.length-1)
				numClusters ++;
			
		}
		int[] result = new int [numClusters];
		int index = 0;
		for(int i=0, j=i+1; i < a.length-1; i++, j++) {
			if(a[i] != a[j]) {
				result[index] = a[i];
				index ++;
			}
			if( j == a.length-1)
				result[index] = a[j];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(clusterCompression(new int[] {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));

	}

}
