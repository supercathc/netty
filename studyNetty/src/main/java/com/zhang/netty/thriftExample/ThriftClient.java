package com.zhang.netty.thriftExample;

import com.zhang.thrift.generated.Person;
import com.zhang.thrift.generated.PersonService;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by Administrator on 2019/3/2.
 */
public class ThriftClient {
    public static void main(String[] args) throws TTransportException {
        TTransport transport = new TFramedTransport(new TSocket("localhost",8899),630);
        TProtocol protocol = new TCompactProtocol(transport);
        PersonService.Client client = new PersonService.Client(protocol);
        try{    //socket打开
                transport.open();
               Person person = client.getPersonByUsrename("花花");
            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.isMarried());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            transport.close();
        }
    }
}
