package com.test.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * Created by Administrator on 2019/2/25.
 */
public class ProtoBufTest {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        DataInfo.Studnet studnet = DataInfo.Studnet.newBuilder().
                setName("曲曲").setAge(18).setAddress("山路十八弯").build();
        byte[] data =studnet.toByteArray();

        DataInfo.Studnet student2 = DataInfo.Studnet.parseFrom(data);
        System.out.println(student2);
        System.out.println(student2.getName());
        System.out.println(student2.getAddress());
    }
}
