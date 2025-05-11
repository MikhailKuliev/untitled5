//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
switch (args.length) {
    case 1:
        System.out.println(args[0]);
        break;
        case 2:
            System.out.println(args[0] + " " + args[1]);
            break;
            case 3:
                System.out.println(args[0] + " " + args[1] + " " + args[2]);
                break;
                default:
                    break;


}
    }
}