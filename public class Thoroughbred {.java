public class Thoroughbred {
    private Thoroughbred mother;   // 母马
    private Thoroughbred father;   // 父马
    private int birthyear;         // 出生年份

    public Thoroughbred(Thoroughbred mother, Thoroughbred father, int birthyear) {
        this.mother = mother;
        this.father = father;
        this.birthyear = birthyear;
    }

    /** 根据出生年份计算当前年龄 */
    public int getCurrentAge() {
        return java.time.Year.now().getValue() - birthyear;
    }

    public Thoroughbred getFather() { return father; }
    public Thoroughbred getMother() { return mother; }
}
