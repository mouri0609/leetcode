package test.xiaoHongshu;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
T是回合数
H是怪物的血量
 */

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt();
        int M = in.nextInt();
        int[] H = new int[N];
        for (int i=0;i<N;i++){
            H[i] = in.nextInt();
        }

        System.out.println(solution(H, T, M));
    }

    public static int solution(int[] H, int T, int M) {
        if (T < H.length) return -1;
        Arrays.sort(H);
        int high = H[H.length - 1];
        if (!canBeat(H, T, M, high)) return -1;

        int low = 0;

        while (low < high) {
            int mid = (low + high) / 2;
            if (canBeat(H, T, M, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static boolean canBeat(int[] H, int T, int M, int X) {
        if (X == 0) {
            int sum = 0;
            for (int h : H) {
                sum += h;
            }
            if (sum <= T) return true;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i = H.length - 1; i >= 0; i--) {
            if (H[i] >= X) {
                int time = H[i] / X;
                if (M >= time) {
                    T -= time;
                    M -= time;
                    int rest = H[i] - time * X;
                    if (rest != 0) pq.offer(rest);
                } else {
                    int rest = H[i] - M * X;
                    T -= M;
                    M = 0;
                    if (rest != 0) pq.offer(rest);
                }
            } else {
                pq.offer(H[i]);
            }
        }

        while (M != 0 && !pq.isEmpty()) {
            pq.poll();
            M--;
            T--;
        }

        while (T > 0 && !pq.isEmpty()) {
            int time = pq.poll();
            T -= time;
        }

        return pq.isEmpty();
    }
}
