package ShardaJAVA.LAB_sep_01.Overriding;

public class Child extends Parent {
    @Override
    public int add(int a, int b) {
        return 10+b;
    }
}