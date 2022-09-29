package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(101, "Lee");
        Member memberKim = new Member(102, "Kim");
        Member memberShin = new Member(103, "Shin");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberShin);

        memberArrayList.showAll();

        memberArrayList.removeMember(memberKim.getMemberId());

        memberArrayList.showAll();
    }
}
