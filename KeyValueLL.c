#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
    int key, value;
    struct Node *next;
}node;
node *head = NULL;

struct Node *CreateNode() {
    node *new = (node*) malloc(sizeof(node));
    return new;
}

void Insert_Update(int k, int item) {
    node *temp = head;
    node *NewNode = CreateNode();
    NewNode->value = item;
    NewNode->key = k;
    if(temp == NULL || temp->key > k) {
        NewNode->next = head;
        head = NewNode;
    } else {
        while(temp->next != NULL && temp->next->key < k) {
            temp =temp->next;
        }
        NewNode->next = temp->next;
        temp->next = NewNode;
    }
}

int Delete(int k) {
    node *temp = head;
    node *temp2 = temp->next;
    while(temp!=NULL) {
        if(k == head->key) {
            head = head->next;
            return 0;
        } else if(temp->next->key == k) {
            temp2->next = temp2->next->next;
            return 0;
            free(temp2);
            if(temp->next->next == NULL) {
                temp->next = NULL;
                return 0;
                free(temp->next);
            }
        }
        temp = temp->next;
    }
    return -1;
}

int Search(int k) {
    node *temp = head;
    while(temp!=NULL) {
        if(temp->key == k) {
            return temp->value;
        }
        temp = temp->next;
    }
    return -1;
}

int length() {
    int count = 0;
    node *temp = head;
    if(temp==NULL) {
        return -1;
    } else {
        while(temp!=NULL) {
            temp = temp->next;
            count++;
        }
    return count;
    }
}

void Display() {
    node *temp = head;
    while(temp!=NULL) {
        printf("%d ",temp->value);
        temp = temp->next;
    }
}

void main() {
    int ch, key, val;
    int x, key1;
    int y, key2, z;
    while(1) {
        printf("\n\t\t**MENU**\n\t1. Insert\n\t2. Delete\n\t3. Search\n\t4. Length\n\t5. Display\n\t6. Exit\n");

        printf("\nEnter your choice: ");
        scanf("%d",&ch);

        switch(ch) {
            case 1:
                printf("\nEnter key: ");
                scanf("%d",&key);
                printf("Enter Value: ");
                scanf("%d",&val);
                Insert_Update(key, val);
                break;
            case 2:
                printf("\nEnter key to delete: ");
                scanf("%d",&key1);
                x = Delete(key1);
                if(x == -1) {
                    printf("\n**Element does not exist**\n");
                } else {
                    printf("\n**Element deleted successfully**\n");
                }
                break;
            case 3:
                printf("\nEnter key to search element: ");
                scanf("%d",&key2);
                y = Search(key2);
                if(y == -1) {
                    printf("\n**Element does not exist**\n");
                } else {
                    printf("\n**%d Found**\n",y);
                }
                break;
            case 4:
                z = length();
                if(z == -1) {
                    printf("\n**No element exist**\n");
                } else {
                    printf("\n**Length: %d**\n",z);
                }
                break;
            case 5:
                Display();
                break;
            case 6:
                exit(0);
                break;
        }
    }
}