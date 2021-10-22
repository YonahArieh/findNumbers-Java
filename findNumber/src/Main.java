public class Main {

    public static void main(String[] args) {
	 int [] numbers = new int [] {1,2,3,4,7,9,0};
        int searchValue = 4 ;
        boolean x = false;

        for ( int number : numbers){
            if (number==searchValue){
                x = true;
                    break;
            }
        }
        if (x){
            System.out.println("There are numbers");
        }
        else{
            System.out.println("There are no numbers");
        }

    }
}
