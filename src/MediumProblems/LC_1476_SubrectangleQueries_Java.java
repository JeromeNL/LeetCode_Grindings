package MediumProblems;

public class LC_1476_SubrectangleQueries_Java {
    int[][] matrix;
    public LC_1476_SubrectangleQueries_Java(int[][] rectangle) {
        matrix = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for(int row = row1; row <= row2; row++){
                for(int col = col1; col <= col2; col++){
                    matrix[row][col] = newValue;
                }
            }
    }

    public int getValue(int row, int col) {
        return matrix[row][col];
    }
}

