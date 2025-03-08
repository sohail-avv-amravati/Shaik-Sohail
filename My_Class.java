class My_Class{
    static int num=0;
    double pi=3.1415;
    My_Class(){
        num++;
        pi++;
        System.out.println(num+"\n"+pi);
    }
    public static void main(String[] args){
        My_Class  C1=new My_Class();
        My_Class  C2=new My_Class();
        My_Class  C3=new My_Class();
        My_Class  C4=new My_Class();
        My_Class  C5=new My_Class();
}
}