    public class eg{
        public static void main(String[] args){
            String s= "red";
            switch(s){
                case "red":
                System.out.println("stop");
                break;
                case "yellow":
                System.out.println("wait");
                break;
                case "green":
                System.out.println("go");   
                break;
                    default:
                    System.out.println("invalid");
                    break;
            }
        }
    }