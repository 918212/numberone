package two;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
public class Test2 {

	public static void main(String[] args) {
		
		String s1="2000-12-20 03:15:14";
		String s2="1998-05-09 07:14:58";
		String s3="2000-12-20 11:48:19";
		
		LocalDateTime l1=null;
		LocalDateTime l2=null;
		LocalDateTime l3=null;
				
	DateTimeFormatter da=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		l1= LocalDateTime.parse(s1,da);
		l2=	LocalDateTime.parse(s2,da);
		l3=	LocalDateTime.parse(s3,da);
		
		IDCard n1=new IDCard();
		n1.setName("���� ");
		n1.setNation("�� ");
		n1.setSex("�� ");
		n1.setCardNo("230101199001021789 ");
		n1.setAddr("������ʡ�������� ");
		n1.setBirthday(l1 );

		IDCard n2=new IDCard();
		n2.setName("���� ");
		n2.setNation("�� ");
		n2.setSex("Ů ");
		n2.setCardNo("230106200111221621 ");
		n2.setAddr("������ʡ������ ");
		n2.setBirthday(l2 );

		IDCard n3=new IDCard();
		n3.setName("����  ");
		n3.setNation("�� ");
		n3.setSex("�� ");
		n3.setCardNo("230101199001021789 ");
		n3.setAddr("������ʡ�������� ");
		n3.setBirthday(l3 );
		HashSet h=new HashSet();
		h.add(n1);
		h.add(n2);
		h.add(n3);
		System.out.println(h.toString());
			}

		}