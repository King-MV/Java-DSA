// A C program used to find an element inside a list and return its address if found..
#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};
struct node* head;

// Function used to insert elements..
void Insert(int value) {
    struct node *temp = (struct node*) malloc(sizeof(struct node));
    temp->data = value;
    temp->next = head; 
    head = temp;
}

// Function used to take input of elements..
void Input(int n) {
    int x;
    for (int i=0; i<n; i++) {
        printf("Enter element: ");
        scanf("%d",&x);
        Insert(x);
    }
}

// Function used to search for the element..
void Search() {
    int key , count = 0;
    printf("\nEnter element to be searched: ");
    scanf("%d",&key);
    while(head!=NULL) {
        if (head->data == key) {
            // Returns the address if key is found in the list..            
            printf("\nAddress of %d is %d\n",key,head);
            // Count used to find wheter element is found or not..            
            count++;
            break;
        } else {
            // This keeps changing the address to which head is pointing..            
            head = head->next;
        }
    }
    // If element not found inside list this will be executed..     
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
