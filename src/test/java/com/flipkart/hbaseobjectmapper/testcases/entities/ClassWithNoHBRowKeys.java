package com.flipkart.hbaseobjectmapper.testcases.entities;

import com.flipkart.hbaseobjectmapper.*;

@SuppressWarnings("unused")
@HBTable(name = "blah", families = {@Family(name = "f")})
public class ClassWithNoHBRowKeys extends AbstractHBRecordWithDummyStringRowKey {

    @HBColumn(family = "f", column = "c")
    private Float f;
}
