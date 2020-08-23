package leetcode;

import java.util.*;

/**
 * Created by zhaorunqian on 2020/8/23.
 */
public class Leetcode_36 {

    /**
     * https://leetcode-cn.com/problems/valid-sudoku/
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        List<Map<Character, Integer>> columns = new ArrayList<Map<Character, Integer>>();
        Map<Character, Integer>[] subAreas = new Map[9];

        for (int i = 0; i < board.length; i++) {
            Map<Character, Integer> rowMap = new HashMap<Character, Integer>();
            for (int j = 0; j < board[i].length; j++) {
                if (i == 0) {
                    Map<Character, Integer> columnMap = new HashMap<Character, Integer>();
                    columns.add(columnMap);
                }

                if (isUnsetCell(board[i][j])) {
                    continue;
                }

                // 行是否有重复
                if (rowMap.get(board[i][j]) == null) {
                    rowMap.put(board[i][j], j);
                } else {
                    return false;
                }

                // 列是否有重复
                Map<Character, Integer> columnMap = columns.get(j);
                if (columnMap.get(board[i][j]) == null) {
                    columnMap.put(board[i][j], j);
                } else {
                    return false;
                }

                // 子区域是否有重复
                int subAreaIndex = getSubAreaIndex(i, j);
                if (subAreas[subAreaIndex] == null) {
                    subAreas[subAreaIndex] = new HashMap<Character, Integer>();
                    subAreas[subAreaIndex].put(board[i][j], 1);
                } else {
                    if (subAreas[subAreaIndex].get(board[i][j]) == null) {
                        subAreas[subAreaIndex].put(board[i][j], 1);
                    }else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean isUnsetCell(Character character){
        return character == '.' ? true : false;
    }

    private int getSubAreaIndex(int row, int column) {
        int rowArea = row / 3;
        if(rowArea == 0) {
            return column / 3;
        }
        if(rowArea == 1) {
            return column / 3 + 3;
        }
        if(rowArea == 2) {
            return column / 3 + 6;
        }
        return 0;
    }

}