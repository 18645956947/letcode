package zhx.day20190121; 

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import zhx.day20190108.TreeNode;;
/** 
* @author lenovo
* @date 2019年1月21日下午8:28:07 
* @Description: 二叉树的层次遍历
*/
public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root==null){
			return result;
		}
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int  size = queue.size();
			List<Integer> tem = new ArrayList<Integer>();
			for(int i=0;i<size;i++) {
				TreeNode node = queue.poll();
				tem.add(node.val);
				if(node.left!=null) {
					queue.offer(node.left);
				}
				if(node.right!=null) {
					queue.offer(node.right);
				}
			}
			result.add(tem);
		}
		return result;
		
	}
}
 