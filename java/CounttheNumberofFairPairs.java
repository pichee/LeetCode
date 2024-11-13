/*Complexidade de Tempo:
A complexidade de tempo é𝑂(𝑛2)(n2)), 
porque estamos usando dois laços aninhados para verificar todos os pares possíveis de elementos.
Isso é esperado para uma solução que precisa verificar todos os pares possíveis em um array de tamanho 𝑛
n.*/
Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
    int contador=0;
    int n=nums.length;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        if(0<=i && i<j && j<n && lower<=nums[i]+nums[j] && nums[i]+nums[j]<=upper){
            contador++;
        }}}
        return contador;
    }
    
}
