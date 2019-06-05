import java.util.Scanner;
public class Read {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Nhap so can doc:");
        int so=scanner.nextInt();

        String ketqua = twoDigit(so);

        System.out.println(ketqua);
    }

    public static String twoDigit(int so) {
        int chuc = (int) (so/10);
        String ketqua = Twenty(chuc);
        int donvi = so % 10;
        ketqua += oneDigit(donvi);
        return ketqua;
    }

    public static String oneDigit(int so)
    {
        switch(so) {
            case 1:
                return "one";
            case 2:
                return "tow";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            default:
                return "out of ability";
        }
    }
    public static String Twenty(int so){
        switch (so){
            case 1:
                return "teen ";
            case 2:
                return "twenty ";

            case 3:
                return "thirty ";
            case 4:
                return "forty ";
            case 5:
                return "fifty ";
            case 6:
                return "sixty ";
            case 7:
                return "seventy ";
            case 8:
                return "eighty ";
            case 9:
                return "ninety ";
            default:return "";

        }
    }

}
