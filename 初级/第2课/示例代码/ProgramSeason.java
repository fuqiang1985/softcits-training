
public class ProgramSeason {
    public static void main(String[] args) {
        int month = 4; // �������ݵ��·ݱ���
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("����һ��������");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("����һ��������");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("����һ���ļ���");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("����һ���＾��");
                break;
            default:
                System.out.println("�����ʲôʱ���ݵİ���");
                break;
        }
    }
}
