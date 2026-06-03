import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int E = sc.nextInt();

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                adj.add(new ArrayList<>());
            }

            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
            }

            for (int i = 0; i < N; i++) {
                Collections.sort(adj.get(i));
            }

            boolean[] vis = new boolean[N];
            Queue<Integer> q = new LinkedList<>();
            ArrayList<Integer> ans = new ArrayList<>();

            q.offer(0);
            vis[0] = true;

            while (!q.isEmpty()) {
                int node = q.poll();
                ans.add(node);

                for (int next : adj.get(node)) {
                    if (!vis[next]) {
                        vis[next] = true;
                        q.offer(next);
                    }
                }
            }

            for (int i = 0; i < ans.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(ans.get(i));
            }

            if (T > 0) System.out.println();
        }
    }
}
