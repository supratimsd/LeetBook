class Solution{
    
    public int[] getIndices(String S , String P){
        String ZS = P + "#" + S;
        int N = ZS.length();

        int[] Z = new int[N];
        for(int i = 1 , L = 0 , R = 0 ; i < N ; i++){
            if(i < R) Z[i] = Math.min(R - i , Z[i - L]);
            while(i + Z[i] < N && ZS.charAt(Z[i]) == ZS.charAt(i + Z[i])) Z[i]++;
            if(i + Z[i] > R) R = i + (Z[L = i]);
        }

        ArrayList<Integer> indicesList = new ArrayList<>();
        for(int i = 0 ; i < Z.length ; i++){
            if(Z[i] == P.length()){
                indicesList.add(i - P.length() - 1);
            }
        }

        int[] indices = new int[indicesList.size()];
        for(int i = 0 ; i < indices.length ; i++){
            indices[i] = indicesList.get(i);
        }
        return indices;
    }

    public int countCells(char[][] A , String P){
        int N = A.length , M = A[0].length;
        
        
        StringBuilder H = new StringBuilder() , V = new StringBuilder();
        for(int i = 0 ; i < N ; i++) for(int j = 0 ; j < M ; j++) H.append(A[i][j]);
        for(int j = 0 ; j < M ; j++) for(int i = 0 ; i < N ; i++) V.append(A[i][j]);
        
        
        int[] H_indices = getIndices(H.toString() , P);
        int[] V_indices = getIndices(V.toString() , P);

        
        int[] H_mark = new int[N * M + 2];
        int[] V_mark = new int[N * M + 2];

        
        for(int index : H_indices){
            H_mark[index] += 1;
            H_mark[index + P.length()] -= 1;
        }
        
        
        for(int index : V_indices){
            V_mark[index] += 1;
            V_mark[index + P.length()] -= 1;
        }
        
        
        for(int i = 1 ; i < N * M ; i++){
            H_mark[i] += H_mark[i - 1];
            V_mark[i] += V_mark[i - 1];
        }
        
        int goodCells = 0;

        
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                int Count_H_mark = H_mark[i * M + j];
                int Count_V_mark = V_mark[j * N + i];
                if(Count_H_mark > 0 && Count_V_mark > 0){
                    goodCells++;
                }
            }
        }
        
        return goodCells;
    }
}