package com.webank.wecross.stub.bcos.protocol.request;

import com.webank.wecross.stub.TransactionRequest;

public class TransactionParams {

    public TransactionParams() {}

    /** */
    public enum TYPE {
        SEND_TX_BY_PROXY,
        CALL_BY_PROXY,
        SEND_TX,
        CALL
    };

    public TransactionParams(TransactionRequest transactionRequest, String data, TYPE tp_ype) {
        this.transactionRequest = transactionRequest;
        this.data = data;
        this.type = tp_ype;
    }

    private TransactionRequest transactionRequest;
    private String data;
    private String from;
    private String to;
    private String abi;
    private TYPE type;

    public TransactionRequest getTransactionRequest() {
        return transactionRequest;
    }

    public void setTransactionRequest(TransactionRequest transactionRequest) {
        this.transactionRequest = transactionRequest;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAbi() {
        return abi;
    }

    public void setAbi(String abi) {
        this.abi = abi;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TransactionParams{"
                + "transactionRequest="
                + transactionRequest
                + ", data='"
                + data
                + '\''
                + ", from='"
                + from
                + '\''
                + ", to='"
                + to
                + '\''
                + ", abi='"
                + abi
                + '\''
                + ", tp_ype="
                + type
                + '}';
    }
}
