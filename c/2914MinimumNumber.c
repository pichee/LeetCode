

#include <string.h>
int minChanges(char* s) {
    int chance=0;
    int tamanho=strlen(s);
    for(int i=0;i<tamanho-1;i+=2){
        if(s[i]!=s[i+1]){
            chance++;
            s[i+1]=s[i];
        }
    }
    return chance;
}
