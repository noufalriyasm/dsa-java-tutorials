package tree.binaryTree;

public class BinaryTreeArray {
    String[] arr;
    int lastUsedIndex;

    public BinaryTreeArray(int size){
        arr=new String[size+1];
        this.lastUsedIndex=0;
        System.out.println("A blank tree created successfully");
    }

    public boolean isFull(){
        if(lastUsedIndex== arr.length-1){
            return true;
        }
        else {
            return false;
        }
    }

    public void insert(String value){
        if (!isFull()){
            arr[lastUsedIndex+1]=value;
            lastUsedIndex +=1;
            System.out.println("The value of "+value +"inserted successfully");
        }
        else {
            System.out.println("The binary tree is full");
        }
    }

    public void preOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        else {
            System.out.println(arr[index]+" ");
            preOrderTraversal(2*index);
            preOrderTraversal(2*index+1);
        }
    }

    public void inOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        else {
            inOrderTraversal(2*index);
            System.out.println(arr[index]+" ");
            inOrderTraversal(2*index+1);
        }
    }

    public void postOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        else {
            postOrderTraversal(2*index);
            postOrderTraversal(2*index+1);
            System.out.println(arr[index]+" ");
        }
    }

    public void levelOrderTraversal(){
        for(int i=1;i<=lastUsedIndex;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public int search(String value){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i]==value){
                System.out.println("The value found at index "+i);
                return i;
            }

        }
        System.out.println("the value does not exist in tree");
        return -1;
    }

    public void deleteNode(String value){
        int location=search(value);
        if(location == -1){
            return;
        }
        arr[location]=arr[lastUsedIndex];
        lastUsedIndex--;
        System.out.println("The node deleted successfully");
    }

    public void deleteBinaryTree(){
        try{
            arr=null;
            System.out.println("The binary tree has been deleted successfully");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
