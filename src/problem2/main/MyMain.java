/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem1.mybst.MyBinarySearchTree;
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(20);
        obj.insert(22);
        obj.insert(19);
        obj.insert(15);
        obj.insert(25);
        obj.insert(29);
        obj.insert(5);
        System.out.print("Left Child nodes are: ");
        obj.printLeftNode(obj.root);
        System.out.println();
        System.out.println("No of nodes that dosn't have a left child node are: " + obj.getCount());
    }
}
