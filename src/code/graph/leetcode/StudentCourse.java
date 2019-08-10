package code.graph.leetcode;

import java.util.HashSet;

/**
 * @Author: Agile����Mouri
 * @Date: 2019/8/8
 */
public class StudentCourse {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0) {
            return false;
        }
        int plen = prerequisites.length;
        if (plen == 0) {
            return true;
        }
        int[] marked = new int[numCourses];

        // ��ʼ������ͼ begin
        HashSet<Integer>[] graph = new HashSet[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new HashSet<>();
        }
        // ��ʼ������ͼ end
        // ����ͼ�� key ��ǰ����㣬value �Ǻ�̽��ļ���
        for (int[] p : prerequisites) {
            graph[p[1]].add(p[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (dfs(i, graph, marked)) {
                // ע�ⷽ�������壬���ͼ�д��ڻ�����ʾ�γ���������ɣ�Ӧ�÷��� false
                return false;
            }
        }
        // �ڱ����Ĺ����У�һֱ dfs ��û�������Ѿ��ظ����ʵĽ�㣬�ͱ�ʾ����ͼ��û�л�
        // ���пγ����������ɣ�Ӧ�÷��� true
        return true;
    }

    /**
     * ע����� dfs ����������
     *
     * @param i      ��ǰ���ʵĿγ̽��
     * @param graph
     * @param marked ��� == 1 ��ʾ���ڷ����У���� == 2 ��ʾ�Ѿ���������
     * @return true ��ʾͼ�д��ڻ���false ��ʾ���ʹ��ˣ������ٷ�����
     */
    private boolean dfs(int i,
                        HashSet<Integer>[] graph,
                        int[] marked) {
        // ������ʹ��ˣ��Ͳ����ٷ�����
        if (marked[i] == 1) {
            // �����ڷ����У������ڷ����У���ʾ�����˻�
            return true;
        }

        if (marked[i] == 2) {
            // ��ʾ�ڷ��ʵĹ�����û��������������ڵ���ʹ���
            return false;
        }
        // �ߵ��������Ϊ��ʼ���أ���ʱ marked[i] == 0
        // ��ʾ���ڷ�����
        marked[i] = 1;
        // ��̽��ļ���
        HashSet<Integer> successorNodes = graph[i];

        for (Integer successor : successorNodes) {
            if (dfs(successor, graph, marked)) {
                // ���ݹ鷵�� true ����ʾͼ�д��ڻ�
                return true;
            }
        }
        // i �����к�̽�㶼�������ˣ���û�д��ڻ�����������Ϳ��Ա����Ϊ�Ѿ����ʽ���
        // ״̬����Ϊ 2
        marked[i] = 2;
        // false ��ʾͼ�в����ڻ�
        return false;
    }
}
