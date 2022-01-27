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

void Print() {
    struct node *temp = head;
    while(temp!=NULL) {
        printf("%d ",temp->data);
        temp = temp->next;
    }
}

void main() {
    int n;
    head = NULL;
    printf("Enter number of elements: ");
    scanf("%d",&n);
    Input(n);   
    Print();
}