package code.LinkedList.newCoder;

import code.LinkedList.Node.RandomListNode;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/7/31
 * @Title: 复杂链表复制
 */
public class RandomListNodeClone {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead==null){
            return null;
        }

        RandomListNode currentNode  = pHead;
        //复制链表
        while (currentNode !=null){
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            RandomListNode temp = currentNode.next;
            currentNode.next = cloneNode;
            cloneNode.next = temp;
            currentNode = currentNode.next.next;
        }

        //复制random节点
        currentNode = pHead;
        while(currentNode!=null){
            currentNode.next.random = currentNode.random==null?null:currentNode.random.next;
            currentNode = currentNode.next.next;
        }

        currentNode = pHead;
        RandomListNode cloneHead = pHead.next;
//        RandomListNode head = cloneHead;
        while (currentNode!=null){
            RandomListNode clone = currentNode.next;
            currentNode.next = clone.next;
            currentNode = currentNode.next;
            clone.next = currentNode==null?null:currentNode.next;
        }
        return cloneHead;
    }
}
