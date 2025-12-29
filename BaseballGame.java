class Solution {
    public int calPoints(String[] operations) {
        int record=0;

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<operations.length;i++)
        {
            String x = operations[i];
            if(x.equals("+"))
            {
              int temp=stack.pop();
              int temp1=temp+stack.peek();
              stack.push(temp);
              stack.push(temp1);
              record=record+temp1;
          
            }
            else if(x.equals("D"))
            {
                int temp=stack.peek();
                stack.push(temp*2);
                record=record+temp*2;
            }
            else if(x.equals("C"))
            {
                int p = stack.pop();
                record=record-p;
            }
            else{
                int x1= Integer.parseInt(x);
                stack.push(x1);
                record=record+x1;
            }

        }

       
        return record;
        
    }
}