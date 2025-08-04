import java.util.Random;

public class Main {
  public static void main(String[] args) {

    BinaryTree binaryTree = new BinaryTree('g', null, null);

    BinaryTree[] children = new BinaryTree[15];
    children[0] = new BinaryTree('a', null, null);
    children[1] = new BinaryTree('b', null, null);
    children[2] = new BinaryTree('c', null, null);
    children[3] = new BinaryTree('d', null, null);
    children[4] = new BinaryTree('e', null, null);
    children[5] = new BinaryTree('f', null, null);
    children[6] = new BinaryTree('p', null, null);
    children[7] = new BinaryTree('h', null, null);
    children[8] = new BinaryTree('i', null, null);
    children[9] = new BinaryTree('j', null, null);
    children[10] = new BinaryTree('k', null, null);
    children[11] = new BinaryTree('l', null, null);
    children[12] = new BinaryTree('m', null, null);
    children[13] = new BinaryTree('n', null, null);
    children[14] = new BinaryTree('o', null, null);

    binaryTree.insertSort(children[4], children[10], children[3], children[5], 
                            children[7], children[11], children[2], children[9], 
                            children[14], children[1], children[12], children[6], 
                            children[8], children[13], children[0]);  
    
    System.out.println("\n Binary Tree inorder: \n");
    binaryTree.inorder();
    System.out.println();

    Random random = new Random();

    try {
      binaryTree.delete(children[random.nextInt(15)]);
      binaryTree.delete(children[random.nextInt(15)]);
      binaryTree.delete(children[random.nextInt(15)]);
    } catch (Exception e){
      System.out.println("Non valid node. \n");
    }
    
    System.out.println("\n Binary Tree after 3 random deletions: \n");
    binaryTree.inorder();

  }
}