package com.wadiz.client.model;

import java.util.Date;

public class ClientRequest {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request.request_seq
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    private Integer requestSeq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request.request_uuid
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    private String requestUuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request.content
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request.reg_time
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    private Date regTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request.request_seq
     *
     * @return the value of request.request_seq
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    public Integer getRequestSeq() {
        return requestSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request.request_seq
     *
     * @param requestSeq the value for request.request_seq
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    public void setRequestSeq(Integer requestSeq) {
        this.requestSeq = requestSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request.request_uuid
     *
     * @return the value of request.request_uuid
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    public String getRequestUuid() {
        return requestUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request.request_uuid
     *
     * @param requestUuid the value for request.request_uuid
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    public void setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request.content
     *
     * @return the value of request.content
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request.content
     *
     * @param content the value for request.content
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request.reg_time
     *
     * @return the value of request.reg_time
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request.reg_time
     *
     * @param regTime the value for request.reg_time
     *
     * @mbggenerated Mon Dec 21 19:30:25 KST 2015
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}