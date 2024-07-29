package com.wwt.searchAlgorithm;

// 分块查找
// **特点**
//      当数据表中的数据元素很多时，可以采用分块查找。
//      汲取了顺序查找和折半查找各自的优点，既有动态结构，又适于快速查找
//      分块查找适用于数据较多，但是数据不会发生变化的情况，如果需要一边添加一边查找，建议使用哈希查找
// **过程**
//      1. 需要把数据分成N多小块，块与块之间不能有数据重复的交集。
//      2. 给每一块创建对象单独存储到数组当中
//      3. 查找数据的时候，先在数组查，当前数据属于哪一块
//      4. 再到这一块中顺序查找
public class BlockSearch {
    public static void main(String[] args) {
        /*
            分块查找
            核心思想：
                块内无序，块间有序
            实现步骤：
                1.创建数组blockArr存放每一个块对象的信息
                2.先查找blockArr确定要查找的数据属于哪一块
                3.再单独遍历这一块数据即可
        */
        int[] arr = {16, 5, 9, 12,21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        // 创建分块对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        // 将每一块添加到块数组中去
        Block[] blocks = {b1, b2, b3};

        // 查询目标值的索引
        System.out.println(blockSearch(arr, blocks, 12));
        System.out.println(blockSearch(arr, blocks, 45));
        System.out.println(blockSearch(arr, blocks, 63));
    }

    private static int blockSearch(int[] arr, Block[] blocks, int target) {
        // 先要查找目标值在哪一个块中
        int blockIndex = getBlockIndex(blocks, target);
        if(blockIndex == -1){
            return -1;
        }
        // 找到块后，遍历该块的起始索引-结束索引，就可以找到target值
        int startIndex = blocks[blockIndex].getStartIndex();
        int endIndex = blocks[blockIndex].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int getBlockIndex(Block[] blocks, int target) {
        // 顺序查找每一个块的最大值，若target值 <= 块中的最大值，则找到了目标值在块中的位置
        for (int i = 0; i < blocks.length; i++) {
            if(target <= blocks[i].getMax()){
                return i;
            }
        }
        return -1;
    }

}

// 定义块对象
class Block{
    private int max;            // 每一块中的最大值
    private int startIndex;     // 每一块中的起始坐标
    private int endIndex;       // 每一块中的结束坐标


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
