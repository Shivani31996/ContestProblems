import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagBT {
    List<List<Integer>> result;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        result = new ArrayList<>();
        
        if(root == null)
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> li = new ArrayList<>();
            for(int i=0; i<size; i++)
            {
                TreeNode curr = q.poll();
                li.add(curr.val);
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            result.add(li);
        }
        
        for(int i=1; i<result.size();i=i+2)
        {
            Collections.reverse(result.get(i));
        }
        return result;
    }
}
