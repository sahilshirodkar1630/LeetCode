package Easy;

public class Remove_Element_27 {
//
//	Given an array nums and a value val, remove all instances of that value in-place and return the new length.
//
//			Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//
//			The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//
//			Clarification:
//
//			Confused why the returned value is an integer but your answer is an array?
//
//			Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
	public int removeElement(int[] a, int val) {
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=val){
                a[k]=a[i];
                k++;
            }
        }
        return k;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
