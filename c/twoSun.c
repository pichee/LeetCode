#include <stdio.h>
#include <stdlib.h>
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    *returnSize = 2; 
    int* resultado = (int*)malloc(2 * sizeof(int));
    for (int i = 0; i < numsSize; i++) {
        for (int j = i + 1; j < numsSize; j++) {
            if (nums[i] + nums[j] == target) {
                resultado[0] = i;
                resultado[1] = j;
                return resultado;
            }
        }
    }
    return NULL; 
}
int main() {
    int nums[] = {2, 7, 11, 15};
    int target = 9;
    int returnSize;
    int* resultado = twoSum(nums, 4, target, &returnSize);
    if (resultado != NULL) {
        printf("Output: [%i, %i]\n", resultado[0], resultado[1]);
        free(resultado);
    }
    return 0;
}
