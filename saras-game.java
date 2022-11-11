static int minDistanceCoveredBySara(int N){
    //Enter your code here
    int sum=0;
    for(int i=1;i<=N;i++){
        sum=sum+i;
    }
    if(sum%2==0){
        return 0;
    }
    return 1;
}
