package kr.co.collie.mgr.qna.vo;

public class MgrModifyQnaReplyVO {
	
	private int qna_num;
	
	private String qna_reply;
	
	private String qna_flag="N";

	public int getQna_num() {
		return qna_num;
	}

	public void setQna_num(int qna_num) {
		this.qna_num = qna_num;
	}

	public String getQna_reply() {
		return qna_reply;
	}

	public void setQna_reply(String qna_reply) {
		this.qna_reply = qna_reply;
	}

	public String getQna_flag() {
		return qna_flag;
	}

	public void setQna_flag(String qna_flag) {
		this.qna_flag = qna_flag;
	}

}
