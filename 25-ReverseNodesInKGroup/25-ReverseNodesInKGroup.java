// Last updated: 8/1/2025, 10:42:19 PM

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Convert the linked list to an ArrayList
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        
        int len = arr.size();
        int i=0;

        while(i<arr.size()){
            if(i+k<=arr.size()){
        swap(arr,i,i+k-1);
            }else{
                // swap(arr,i,arr.size()-1);
            }
        i+=k;
        }
        temp = head;
        for ( i = 0; i < len; i++) {
            temp.val = arr.get(i);
            temp = temp.next;
        }
        
        return head;
    }
    private void swap(ArrayList<Integer> arr,int st,int end){
        while(st<=end){
            int temp=arr.get(st);
            arr.set(st,arr.get(end));
            arr.set(end,temp);
            st++;
            end--;
        }
    }
}

