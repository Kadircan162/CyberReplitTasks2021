public class TestStackAndHeap {

    int x;
    double y;
    char c = 'c';
    String s = "Hello";
    
    TestStackAndHeap testStackAndHeap1 = new TestStackAndHeap();
    TestStackAndHeap testStackAndHeap2 = new TestStackAndHeap();

    public void main(String[] args) {

        testStackAndHeap1 = testStackAndHeap2;
    }
}
