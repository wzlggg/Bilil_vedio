package club.evolutioniot.ssh.system.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论实体类
 * @author EVolution 2018年11月1日-下午9:42:30
 */
public class Remark implements Serializable{
	private Integer remarkId;
	//TODO 使用blob优化
	private String remarkContent;
	private Date remarkTime;
	private Integer remarkState;
	private PlayUser playUser;//用户-评论  	一对多
	private Vedio vedio;
	

	public Integer getRemarkId() {
		return remarkId;
	}

	public void setRemarkId(Integer remarkId) {
		this.remarkId = remarkId;
	}

	public String getRemarkContent() {
		return remarkContent;
	}

	public void setRemarkContent(String remarkContent) {
		this.remarkContent = remarkContent;
	}

	public Date getRemarkTime() {
		return remarkTime;
	}

	public void setRemarkTime(Date remarkTime) {
		this.remarkTime = remarkTime;
	}

	public Integer getRemarkState() {
		return remarkState;
	}

	public void setRemarkState(Integer remarkState) {
		this.remarkState = remarkState;
	}

	public PlayUser getPlayUser() {
		return playUser;
	}

	public void setPlayUser(PlayUser playUser) {
		this.playUser = playUser;
	}

	public Vedio getVedio() {
		return vedio;
	}

	public void setVedio(Vedio vedio) {
		this.vedio = vedio;
	}

	@Override
	public String toString() {
		return "Remark [remarkId=" + remarkId + ", remarkContent=" + remarkContent + ", remarkTime=" + remarkTime
				+ ", remarkState=" + remarkState  + "]";
	}



}
