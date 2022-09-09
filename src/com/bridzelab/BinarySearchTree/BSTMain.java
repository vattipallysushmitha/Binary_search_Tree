package com.bridzelab.BinarySearchTree;

public class BSTMain
{

	public static void main(String[] args) 
	{
		System.out.println("******************************************");
		System.out.println("welcome to Binary Search Tree program");
		System.out.println("******************************************");

		
		BinaryTree bst = new BinaryTree();
        Node root = null;
        // inserting the value in root
        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70); // 30->56->70->80

        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 95);
        root = bst.insert(root, 11);
        root = bst.insert(root, 65);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 63);
        root = bst.insert(root, 67);

        bst.print(root);
        // if condition is true then 1st print o/p is boolean type coz this is boolean method
       
        
        System.out.println(bst.nodePresent(root, 63));
        /*
         * if else statement is used if condition is true then print 63 is present is binary tree
         * if condition false then print 63 is not present in binary tree.
         */
        if(root != null)
            System.out.println("\nElement 63 is present in the binary tree");
        else
            System.out.println("\nElement 63 is not present in the binary tree");
    }

}
