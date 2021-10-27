package Exercise4;

import java.util.Date;

public class DataForArray implements Comparable {


    private int fid;  //FID  2000;
    private int serialNum;  //SERIAL_NUM   2202099;
    private String MEMBER_CODE; //MEMBER_CODE   4B01GG000001;
    private int ACCT_TYPE;      //ACCT_TYPE  9;

    private Date OPENED_DT;     //OPENED_DT    04.06.2014;
    private int ACCT_RTE_CDE;  //ACCT_RTE_CDE     0
    private Date REPORTING_DT;    //REPORTING_DT     14.10.2014
    private int CREDIT_LIMIT;       //;CREDIT_LIMIT  100000

    public DataForArray() {
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getMEMBER_CODE() {
        return MEMBER_CODE;
    }

    public void setMEMBER_CODE(String MEMBER_CODE) {
        this.MEMBER_CODE = MEMBER_CODE;
    }

    public int getACCT_TYPE() {
        return ACCT_TYPE;
    }

    public void setACCT_TYPE(int ACCT_TYPE) {
        this.ACCT_TYPE = ACCT_TYPE;
    }

    public Date getOPENED_DT() {
        return OPENED_DT;
    }

    public void setOPENED_DT(Date OPENED_DT) {
        this.OPENED_DT = OPENED_DT;
    }

    public int getACCT_RTE_CDE() {
        return ACCT_RTE_CDE;
    }

    public void setACCT_RTE_CDE(int ACCT_RTE_CDE) {
        this.ACCT_RTE_CDE = ACCT_RTE_CDE;
    }

    public Date getREPORTING_DT() {
        return REPORTING_DT;
    }

    public void setREPORTING_DT(Date REPORTING_DT) {
        this.REPORTING_DT = REPORTING_DT;
    }

    public int getCREDIT_LIMIT() {
        return CREDIT_LIMIT;
    }

    public void setCREDIT_LIMIT(int CREDIT_LIMIT) {
        this.CREDIT_LIMIT = CREDIT_LIMIT;
    }

    @Override
    public int compareTo(Object o) {
        DataForArray another = (DataForArray) o;
        if (this.fid > another.fid)
            return 1;
        if (this.fid < another.fid)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "MyData3{" +
                "fid=" + fid +
                ", serialNum=" + serialNum +
                ", MEMBER_CODE='" + MEMBER_CODE + '\'' +
                ", ACCT_TYPE=" + ACCT_TYPE +
                ", OPENED_DT=" + OPENED_DT +
                ", ACCT_RTE_CDE=" + ACCT_RTE_CDE +
                ", REPORTING_DT=" + REPORTING_DT +
                ", CREDIT_LIMIT=" + CREDIT_LIMIT +
                '}';
    }
}

