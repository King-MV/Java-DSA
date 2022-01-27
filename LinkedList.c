// A C program used to Create , Insert and Display a Linked List...
#include <stdio.h>
#include <stdlib.h>

// Node structure created.
struct node {
    int data;
    struct node *next;
};
struct node* head;

// Insertion function()
void Insert(int value) {
    // New node temp is created here everytime for insertion...    
    struct node *temp = (struct node*) malloc(sizeof(struct node));
    // User input value is stored inside new node...    
    temp->data = value;
    // head is now pointing to the next node of the inserted node...    
    temp->next = head; 
    // Value of temp is stored inside head..    
    head = temp;
}

// Input function()
void Input(int n) {
    int x;
    for (int i=0; i<n; i++) {
        printf("Enter element: ");
        scanf("%d",&x);
        Insert(x);
    }
}

// Print function()
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
