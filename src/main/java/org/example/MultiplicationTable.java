package org.example;

public class MultiplicationTable {

    public static void main(String[] args) {
        System.out.println(createMultiplicationTable(1, 9));
    }


    public static String createMultiplicationTable(int startNum, int endNum) {
        if (!isInRange(startNum, endNum) || !isEndNumGreaterThanStartNum(startNum, endNum)) {
            return null;
        }
        return doMultiplication(startNum, endNum);
    }

    public static boolean isEndNumGreaterThanStartNum(int startNum, int endNum) {
        return startNum <= endNum;
    }

    public static boolean isInRange(int startNum, int endNum) {
        return startNum >= 1 && endNum <= 1000;
    }

    public static String doMultiplication(int startNum, int endNum) {
        StringBuilder table = new StringBuilder();
        for (int i = startNum; i <= endNum; i++) {
            table.append(getRowMultiplication(i, startNum));
            if (i < endNum) {
                table.append("\n");
            }
        }
        return table.toString();
    }

    public static String getRowMultiplication(int rowNum, int startNum) {
        StringBuilder row = new StringBuilder();
        for (int i = startNum; i <= rowNum; i++) {
            row.append(i).append("*").append(rowNum).append("=").append(rowNum * i);
            if (i < rowNum) {
                row.append("\t");
            }
        }
        return row.toString();
    }
}
