#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};
struct node* head;

void Insert(int value) {
    struct node *temp = (struct node*) malloc(sizeof(struct node));
    temp->data = value;
    temp->next = head; 
    head = temp;
}

void Input(int n) {
    int x;
    for (int i=0; i<n; i++) {
        printf("Enter element: ");
        scanf("%d",&x);
        Insert(x);
    }
}

void Search() {
    int key , count = 0;
    printf("\nEnter element to be searched: ");
    scanf("%d",&key);
    while(head!=NULL) {
        if (head->data == key) {
            printf("\nAddress of %d is %d\n",key,head);
            count++;
            break;
        } else {
            head = head->next;
        }
    }
    if(count==0) {
        printf("\nElement not found\n");
    }
}

void main() {
    int n;
    head = NULL;
    printf("Enter number of elements: ");
    scanf("%d",&n);
    Input(n);
    Search();   
}