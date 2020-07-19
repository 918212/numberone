package two;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class IDCard {

	private String  name;
	private String  sex;
	private String  nation;
	private String  addr;
	private String  cardNo;
	private LocalDateTime  birthday;
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public LocalDateTime getBirthday() {
		return this.birthday;
	}
	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}
	
	public String toString() {
		DateTimeFormatter da=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String st=da.format(this.birthday);
	
		StringBuffer a = new StringBuffer("姓名: ");
		StringBuffer b = new StringBuffer("民族: ");
		StringBuffer c = new StringBuffer("性别: ");
		StringBuffer d = new StringBuffer("出生日期: ");
		StringBuffer e = new StringBuffer("住址: ");
		StringBuffer f = new StringBuffer("身份证号: ");
		
		a.append(this.name);
		b.append(this.nation);
		c.append(this.sex);
		d.append(this.birthday);
		e.append(this.addr);
		f.append(this.cardNo);
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		System.out.print(e);
		System.out.print(f);
		return super.toString();
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((cardNo == null) ? 0 : cardNo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nation == null) ? 0 : nation.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IDCard other = (IDCard) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (cardNo == null) {
			if (other.cardNo != null)
				return false;
		} else if (!cardNo.equals(other.cardNo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nation == null) {
			if (other.nation != null)
				return false;
		} else if (!nation.equals(other.nation))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
}
	