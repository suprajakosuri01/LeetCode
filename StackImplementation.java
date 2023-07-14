//stack implementationusing Arrays
public class StackImplementation {

   private int maxSize;
   private int top;
   private int[] stackArray;
public StackImplementation(int size) {
       maxSize=size;
       top=-1;
       stackArray=new int[maxSize];
   }

        void push(int nums) {
            if (top == maxSize - 1) {
                return;

            } else {
                top = top + 1;
                stackArray[top] = nums;
            }
        }
     public int pop(){
           if(top==-1){
               return -1;
           }
           else{
               int poppedvalue=stackArray[top];
               top=top-1;
               return poppedvalue;

           }

        }
        int isEmpty(){
           if(top==-1){
               return 1;
           }
           else{
               return 0;
           }

        }
        int isFull(){
           if(top==maxSize-1){
               return 1;
           }
           else{
               return 0;
           }

        }
        void display(){
    for(int j=top;j>=0;j--){
        System.out.println("print elments in the stack "+stackArray[j]);
    }
        }
        public static void main(String[] args){
            StackImplementation st=new StackImplementation(5);
            st.push(5);
            st.push(4);
            st.push(3);
            st.push(2);
            st.push(1);
            st.push(6);
            st.pop();
            st.display();
            // 5,4,3,2,

        }

}
