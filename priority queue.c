#include<stdio.h>
int size=0,i;
void swap(int *a,int *b){
    int temp=*b;
    *b=*a;
    *a=temp;
}
void heapify(int array[],int size,int j){
    if(size==1){
        printf("single");
    }
    else{
    int largest=j;
    int l=2*j+1;
    int r=2*j+2;
    if(l<size&&array[l]>array[largest])
      largest=l;
    if(r<size&&array[r]>array[largest])
      largest=r;
    if(largest!=j){
        swap(&array[j],&array[largest]);
        heapify(array,size,largest);
    }
    }
}
void insert(int arr[],int data){
   if(size==0){
      arr[size]=data;
      size=size+1;
   }
   else{
    arr[size]=data;
    size=size+1;
    for(i=size/2-1;i>=0;i--){
        heapify(arr,size,i);
    }
   }
}
void display(int ar[],int size){
    for(i=0;i<size;i++){
        printf("%d\n",ar[i]);
    }
}
/*
                         11
                       /    \
                    10        9
                    /\         \
                   3  5         4
*/

int main(){
   int arr[10];
   insert(arr,3);
   insert(arr,4);
   insert(arr,5);
   insert(arr,9);
   insert(arr,10);
   insert(arr,11);
   display(arr,size);
}

