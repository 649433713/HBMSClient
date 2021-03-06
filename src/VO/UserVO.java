package VO;

import java.io.Serializable;

import VO.CreditVO;
import VO.MemberInfoVO;
import VO.PersonalInfoVO;

public class UserVO implements Serializable{
	String id;
	String accountName;
	String password;
	PersonalInfoVO personalInfo;
	CreditVO creditInfo;
	MemberInfoVO memberInfo;
	
	public UserVO(String i,String aN,String p
			,PersonalInfoVO pI,CreditVO cI,MemberInfoVO mI){
		id=i;
		accountName=aN;
		password=p;
		personalInfo=pI;
		creditInfo=cI;
		memberInfo=mI;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PersonalInfoVO getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfoVO personalInfo) {
		this.personalInfo = personalInfo;
	}

	public CreditVO getCreditInfo() {
		return creditInfo;
	}

	public void setCreditInfo(CreditVO creditInfo) {
		this.creditInfo = creditInfo;
	}

	public MemberInfoVO getMemberInfo() {
		return memberInfo;
	}

	public void setMemberInfo(MemberInfoVO memberInfo) {
		this.memberInfo = memberInfo;
	}
	
}
