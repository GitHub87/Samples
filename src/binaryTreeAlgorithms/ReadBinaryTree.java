package binaryTreeAlgorithms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ReadBinaryTree {
	
	public static BinaryTree<String> readBinaryTree(Scanner scan){
		String data = scan.next();
		if(data.equals("null")){
			return null;
		}else{
			BinaryTree<String> leftTree = readBinaryTree(scan);
			BinaryTree<String> rightTree = readBinaryTree(scan);
			return new BinaryTree<String>(data, leftTree, rightTree);
		}
	}
	
	public void writeBinaryTreeToFile(BinaryTree<String> binaryTree) throws FileNotFoundException, IOException{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("nameOfFile"));
		out.writeObject(binaryTree);
	}
	
	public BinaryTree<String> readBinaryTreeFromFile(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
		return (BinaryTree)in.readObject();
	}
	
	

}
