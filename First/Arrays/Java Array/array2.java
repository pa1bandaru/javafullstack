class Test{
    public static void main(String[] args){
        cal_Marks(new int[]{35,36,37,38,39,40});
    }
    public static void cal_Marks(int[] x){
                int total = 0;
                for (int v:x){
                    total = total +v;
                }
        System.out.println(total);        
    }
}