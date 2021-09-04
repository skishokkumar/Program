/*******************************************************************************INFIX TO PREFIX******************************************************************************************/
#include<stdio.h>
#include/<ctype.h>
#include<string.h>
char stack[20],top=-1;
void push(char ch){
  stack[++top]=ch;
}
char pop(){
  if(top==-1)
    return -1;
  else
    return stack[top--];
}
int priority(char p){
  if(p==')')
    return 0;
  if(p=='+'||p=='-')
     return 1;
  if(p=='*'||p=='/')
     return 2;
  return 0;
}
int main(){
   char s[30],*q,p;
   scanf("%s",s);
   q=strrev(s);
   char a[strlen(s)];
   int j=0;
   while(*q!='\0'){
   if(isalnum(*q))
    a[j++]=*q;
   else if(*q==')')
    push(*q);
   else if(*q=='(')
   while((p=pop())!=')'){
       a[j++]=p;
    }
    else{
        while(priority(stack[top])>=priority(*q))
               a[j++]=pop();
               push(*q);
    }
    q++;
}
while(top!=-1){
    a[j++]=pop();
}
q=strrev(a);
printf("%s",q);
}
