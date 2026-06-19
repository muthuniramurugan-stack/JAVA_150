class tworeduced{
    public static void main(String[] args) {
        int num =6928;
        int temp = num;
        int count =0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int [] arr = new int[count];
        temp=num;
        for(int i=count-1;i>=0;i--){
            arr[i]=temp%10;
            temp/=10;
        }
        int size = count;
        while(size>2){
        for(int i=0;i<size-1;i++){
            int diff = arr[i]-arr[i+1];
            if(diff<0){
                diff=-diff;
            }
            arr[i]=diff;
        }
            size--;
        }
        System.out.println(arr[0]+""+arr[1]);
    }
}