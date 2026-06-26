package Arrays;

class removeduplicates {
    public static void main(String[] args) {
        // remove duplicates in sorted Array
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// To remove duplicates in unsorted Array
/*
int [] arr = {5,5,4,4,3,2,1,1}
for(int i=0;i<arr.length;i++){
boolean duplicate = false;
for(int j=0;j<i;j++){
if(arr[i]==arr[j])
duplicate = true;
break;
}
}
if(!duplicate){
System.out.print(arr[i]+" ");
}



*/