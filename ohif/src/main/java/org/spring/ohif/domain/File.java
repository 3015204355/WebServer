package org.spring.ohif.domain;



/**
 * 城市实体类
 *
 * Created by bysocket on 07/02/2017.
 */
public class File {

    
    private Long fid;
    private String filename;
    private String username;
    private String dataTime;
    private String comments;
    

    public Long getId() {
        return fid;
    }

    public void setId(Long fid) {
        this.fid = fid;
    }
    public String getFilename()
    {
    	return filename;
    }
    public void setFilename(String filename)
    {
    	this.filename=filename;
    }
    
    public String getUsername()
    {
    	return username;
    }
    public void setUsername(String username)
    {
    	this.username=username;
    }
   
    public String getDataTime()
    {
    	return dataTime;
    }
   
    public void setDataTime(String dataTime)
    {
    	this.dataTime=dataTime;
    }
    public String getComments()
    {
    	return comments;
    }
    public void setComments(String comments)
    {
    	this.comments=comments;
    }
}