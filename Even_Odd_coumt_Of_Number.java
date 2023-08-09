class Count
{
        public static void main(String[] args) {
                int number =44574658;

                int Even_Count=0;
                int Odd_Count=0;

                while(number>0)
                {
                        int reminder= number%10;  
                        if(reminder%2==0)
                        {
                                Even_Count++;
                        }
                        else{
                                Odd_Count++;
                        }
                        number=number/10;
                }
                System.out.println("Even Count of a NUmber is :"+Even_Count);
                System.out.println("Odd Count of a NUmber is :"+ Odd_Count);
        }

}
