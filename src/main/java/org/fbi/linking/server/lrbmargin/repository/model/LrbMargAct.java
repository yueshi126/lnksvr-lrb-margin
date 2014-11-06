package org.fbi.linking.server.lrbmargin.repository.model;

import java.math.BigDecimal;

public class LrbMargAct extends LrbMargActKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.MATUDAY
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private String matuday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.ACCTNO
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private String acctno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.CBS_ACTNO
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private String cbsActno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.ACT_STS
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private String actSts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.ACT_BAL
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private BigDecimal actBal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.INTC_PDT
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private BigDecimal intcPdt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.LAST_TXN_DT
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private String lastTxnDt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.LAST_ACT_BAL
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private BigDecimal lastActBal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.OPEN_ACT_DATE
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private String openActDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.CLOSE_ACT_DATE
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private String closeActDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.FRZ_ACT_DATE
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private String frzActDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.REMARK
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.RECVERSION
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private Integer recversion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LNK.LRB_MARG_ACT.IF_TIA_SN
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    private String ifTiaSn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.MATUDAY
     *
     * @return the value of LNK.LRB_MARG_ACT.MATUDAY
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public String getMatuday() {
        return matuday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.MATUDAY
     *
     * @param matuday the value for LNK.LRB_MARG_ACT.MATUDAY
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setMatuday(String matuday) {
        this.matuday = matuday == null ? null : matuday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.ACCTNO
     *
     * @return the value of LNK.LRB_MARG_ACT.ACCTNO
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public String getAcctno() {
        return acctno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.ACCTNO
     *
     * @param acctno the value for LNK.LRB_MARG_ACT.ACCTNO
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setAcctno(String acctno) {
        this.acctno = acctno == null ? null : acctno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.CBS_ACTNO
     *
     * @return the value of LNK.LRB_MARG_ACT.CBS_ACTNO
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public String getCbsActno() {
        return cbsActno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.CBS_ACTNO
     *
     * @param cbsActno the value for LNK.LRB_MARG_ACT.CBS_ACTNO
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setCbsActno(String cbsActno) {
        this.cbsActno = cbsActno == null ? null : cbsActno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.ACT_STS
     *
     * @return the value of LNK.LRB_MARG_ACT.ACT_STS
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public String getActSts() {
        return actSts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.ACT_STS
     *
     * @param actSts the value for LNK.LRB_MARG_ACT.ACT_STS
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setActSts(String actSts) {
        this.actSts = actSts == null ? null : actSts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.ACT_BAL
     *
     * @return the value of LNK.LRB_MARG_ACT.ACT_BAL
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public BigDecimal getActBal() {
        return actBal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.ACT_BAL
     *
     * @param actBal the value for LNK.LRB_MARG_ACT.ACT_BAL
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setActBal(BigDecimal actBal) {
        this.actBal = actBal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.INTC_PDT
     *
     * @return the value of LNK.LRB_MARG_ACT.INTC_PDT
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public BigDecimal getIntcPdt() {
        return intcPdt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.INTC_PDT
     *
     * @param intcPdt the value for LNK.LRB_MARG_ACT.INTC_PDT
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setIntcPdt(BigDecimal intcPdt) {
        this.intcPdt = intcPdt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.LAST_TXN_DT
     *
     * @return the value of LNK.LRB_MARG_ACT.LAST_TXN_DT
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public String getLastTxnDt() {
        return lastTxnDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.LAST_TXN_DT
     *
     * @param lastTxnDt the value for LNK.LRB_MARG_ACT.LAST_TXN_DT
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setLastTxnDt(String lastTxnDt) {
        this.lastTxnDt = lastTxnDt == null ? null : lastTxnDt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.LAST_ACT_BAL
     *
     * @return the value of LNK.LRB_MARG_ACT.LAST_ACT_BAL
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public BigDecimal getLastActBal() {
        return lastActBal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.LAST_ACT_BAL
     *
     * @param lastActBal the value for LNK.LRB_MARG_ACT.LAST_ACT_BAL
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setLastActBal(BigDecimal lastActBal) {
        this.lastActBal = lastActBal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.OPEN_ACT_DATE
     *
     * @return the value of LNK.LRB_MARG_ACT.OPEN_ACT_DATE
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public String getOpenActDate() {
        return openActDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.OPEN_ACT_DATE
     *
     * @param openActDate the value for LNK.LRB_MARG_ACT.OPEN_ACT_DATE
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setOpenActDate(String openActDate) {
        this.openActDate = openActDate == null ? null : openActDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.CLOSE_ACT_DATE
     *
     * @return the value of LNK.LRB_MARG_ACT.CLOSE_ACT_DATE
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public String getCloseActDate() {
        return closeActDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.CLOSE_ACT_DATE
     *
     * @param closeActDate the value for LNK.LRB_MARG_ACT.CLOSE_ACT_DATE
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setCloseActDate(String closeActDate) {
        this.closeActDate = closeActDate == null ? null : closeActDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.FRZ_ACT_DATE
     *
     * @return the value of LNK.LRB_MARG_ACT.FRZ_ACT_DATE
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public String getFrzActDate() {
        return frzActDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.FRZ_ACT_DATE
     *
     * @param frzActDate the value for LNK.LRB_MARG_ACT.FRZ_ACT_DATE
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setFrzActDate(String frzActDate) {
        this.frzActDate = frzActDate == null ? null : frzActDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.REMARK
     *
     * @return the value of LNK.LRB_MARG_ACT.REMARK
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.REMARK
     *
     * @param remark the value for LNK.LRB_MARG_ACT.REMARK
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.RECVERSION
     *
     * @return the value of LNK.LRB_MARG_ACT.RECVERSION
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public Integer getRecversion() {
        return recversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.RECVERSION
     *
     * @param recversion the value for LNK.LRB_MARG_ACT.RECVERSION
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setRecversion(Integer recversion) {
        this.recversion = recversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LNK.LRB_MARG_ACT.IF_TIA_SN
     *
     * @return the value of LNK.LRB_MARG_ACT.IF_TIA_SN
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public String getIfTiaSn() {
        return ifTiaSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LNK.LRB_MARG_ACT.IF_TIA_SN
     *
     * @param ifTiaSn the value for LNK.LRB_MARG_ACT.IF_TIA_SN
     *
     * @mbggenerated Thu Nov 06 13:12:08 CST 2014
     */
    public void setIfTiaSn(String ifTiaSn) {
        this.ifTiaSn = ifTiaSn == null ? null : ifTiaSn.trim();
    }
}