// A C program which implements the concept of Stack(Last in First out) data structure.
// It uses Linked List to implement stack here. 
#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};
struct node* top = NULL;

struct node* CreateNode() {
    struct node* new = (struct node*) malloc(sizeof(struct node));
    return new;
}

void push(int value) { /*Inserts new node at head everytime to maintain O(1) time complexity*/
    struct node* NewNode = CreateNode();
    NewNode->data = value;
    NewNode->next = top;
    top = NewNode;
}

void pop() { /*Deletes head node everytime to maintain O(1) time complexity*/
    struct node* temp = top;
    if(temp == NULL) {
        printf("\n\t**Stack Underflow**\n");
        return;
    }
    top = temp->next;
    printf("\n\t**%d deleted successfully**\n",temp->data);
    free(temp);
}

void Top() {
    if(top==NULL) {
        printf("\n\t**Stack Underflow**\n");
        return;
    }
    printf("\n\t**Top Element: %d**\n",top->data);
}

void main() {
    int choice, item;

    while(1) {
        printf("\n\t\t**MENU**\n\t1. Insert an element\n\t\2. Delete an element\n\t3. Find top element\n\t4. Exit\n");

        printf("Enter your choice: ");
        scanf("%d",&choice);

        switch(choice) {
            case 1:
                printf("\nEnter value to be inserted: ");
                scanf("%d",&item);
                push(item);
                break;
            case 2:
                pop();
                break;
            case 3:
                Top();
                break;
            case 4:
                exit(0);
            default:
                printf("\n\t**Enter a valid choice**\n");
        }
    }
}