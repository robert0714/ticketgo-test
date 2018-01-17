package develop.service.basic.model;

import java.util.Date;
 

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
 
public class Record {
	
	/**
	 * 建立時間 nullable=false
	 */ 
    private Date createTime;
	
	/**
	 * 修改時間
	 */
	@LastModifiedDate 
    private Date updateTime;
	
	/**
	 * 建立人員 optional=true
	 */ 

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	 
}
