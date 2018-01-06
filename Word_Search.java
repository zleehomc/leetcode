class Solution {
    public boolean exist(char[][] board, String word) {
        if(word == null) return true;
        if(board.length ==0 ) return false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0;i< board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                visited[i][j] = false;
            }
        }
        for(int i = 0;i < board.length ; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(word.length() == 1 || search(board, visited, i, j , word))
                        return true;
                }
            }
        }
        return false;
    }

    boolean search(char[][] board, boolean[][] visited, int i, int j, String word){
        if(word.length() == 0) return true;
        if(i< 0 || i >= board.length || j < 0 || j >= board[i].length ) {;return false;}
        if(visited[i][j] || board[i][j] != word.charAt(0)) {return false;}


        visited[i][j] = true;
        boolean result = search(board, visited, i - 1, j, word.substring(1)) ||
               search(board, visited, i, j - 1, word.substring(1)) ||
               search(board, visited, i + 1, j, word.substring(1)) ||
               search(board, visited, i, j + 1, word.substring(1));
        visited[i][j] = false;
        return result;
    }
}
