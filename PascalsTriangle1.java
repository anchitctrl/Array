class Solution {
    public List<List<Integer>> generate(int numRows) {  
    List<List<Integer>> result=new ArrayList<>();
    result.add(new ArrayList<>(Arrays.asList(1)));
    if(numRows==1){
        return result;
    }
    result.add(new ArrayList<>(Arrays.asList(1,1)));
    if(numRows==2){
        return result;
    }
    for(int i=2;i<numRows;i++){
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        for(int j=1;j<i;j++){
            arr.add( result.get(i-1).get(j-1)+result.get(i-1).get(j));
        }
    arr.add(1);
    result.add(arr);

    }
    
    return result;
}
}
