class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean firstRow=false;
        boolean firstColumn=false;
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0){
                firstRow=true;
                break;
            }
        }
        
        for(int j=0;j<col;j++){
            if(matrix[0][j]==0){
                firstColumn=true;
                break;
            }
        }
        
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                    
                }
            }
        }
        
        if(firstColumn){
            for(int i=0;i<col;i++){
                matrix[0][i]=0;
            }
        }
        
        if(firstRow){
            for(int j=0;j<row;j++){
                matrix[j][0]=0;
            }
        }
    }
}