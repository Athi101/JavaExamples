public class ShadowTest{

    public int x = 1;

    class First{
        public int x = 2;

        void methodOne(int x){
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }



    public static void main(String [] args){
        
        ShadowTest st = new ShadowTest();
        ShadowTest.First f = st.new First();
        f.methodOne(24);


    }
}