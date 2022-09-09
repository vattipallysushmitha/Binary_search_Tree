/*
purpose=Ability to create a BST by adding 56 and then adding 30 & 70 
		- Use INode to create My Binary Node	
	    - Note the key has to extend comparable to compare and determine left or right node
		- First add 56 as root node so 30 will added to left and 70 to right
* @author= sushmitha
* @since=29-08-2022
*/
package com.bridzelab.BinarySearchTree;

public class BinaryTree
{
	// method name as insert
    public Node insert(Node root, int val)
    {
        if (root == null) 
        {
            return craeteNewNode(val);
        }
        if (val < root.data)
        {
            root.left = insert(root.left, val);
        } 
        else if (val > root.data) 
        {
            root.right = insert(root.right, val);
        }
        return root;

    }

     // method name as createNewNode
    public Node craeteNewNode(int k)
    {
        Node bst = new Node();
        bst.data = k;
        bst.left = null;
        bst.right = null;
        return bst;
    }

    // method to print
    public void print(Node root) 
    {
        if (root == null) 
        {
            return;
        }
        print(root.left);

        System.out.println(root.data);
        print(root.right);
    }

    //Size method For checking all nodes are added or Not
    public int size(Node node) 
    {

        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }
     //nodePresent method this is parameterized method.root and value are passed
    public boolean nodePresent(Node root, int val)
    {
        if (root == null) 
        {
            return false;
        }
        Boolean isPresent = false;
        while (root != null) 
        {
                if (val < root.data)
                {
                    root = root.left;
                } 
                else if (val > root.data)
                {
                    root = root.right;
                } else
                {
                    isPresent = true;
                    break;
                }
        }
            return isPresent;
        }

}
