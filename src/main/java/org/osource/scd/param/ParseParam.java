package org.osource.scd.param;

import lombok.Data;
import org.osource.scd.constant.ParseType;
import org.osource.scd.parse.BusinessDefineParse;
import org.osource.scd.parse.error.DefaultErrorRecord;
import org.osource.scd.parse.error.ErrorRecord;
import org.osource.scd.parse.format.CellFormat;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @author chengdu
 *
 */
@Data
public class ParseParam<T> {
    private int startLine;

    private int sheetNum;

    private Map<String, Method> fieldSetterMap;

    private BusinessDefineParse businessDefineParse;

    private String encode;

    private ErrorRecord errorRecord;

    private CellFormat cellFormat;

    private ParseType parseType;

    private Consumer<List<T>> consumer;

    private int batchNum = 1000;

    public ParseParam() {
        errorRecord = new DefaultErrorRecord(new StringBuilder(""));
    }

    public ParseParam setStartLine(int startLine) {
        this.startLine = startLine;
        return this;
    }

    public ParseParam setSheetNum(int sheetNum) {
        this.sheetNum = sheetNum;
        return this;
    }

    public ParseParam setFieldSetterMap(Map<String, Method> fieldSetterMap) {
        this.fieldSetterMap = fieldSetterMap;
        return this;
    }

    public ParseParam setBusinessDefineParse(BusinessDefineParse businessDefineParse) {
        this.businessDefineParse = businessDefineParse;
        return this;
    }

    public ParseParam setEncode(String encode) {
        this.encode = encode;
        return this;
    }

    public ParseParam setErrorRecord(ErrorRecord errorRecord) {
        this.errorRecord = errorRecord;
        return this;
    }

    public ParseParam setCellFormat(CellFormat cellFormat) {
        this.cellFormat = cellFormat;
        return this;
    }

    public ParseParam setParseType(ParseType parseType) {
        this.parseType = parseType;
        return this;
    }

    public ParseParam setConsumer(Consumer<List<T>> consumer) {
        this.consumer = consumer;
        return this;
    }

    public ParseParam setBatchNum(int batchNum) {
        this.batchNum = batchNum;
        return this;
    }
}
