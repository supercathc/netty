package com.zhang.netty.thriftExample;

import com.zhang.thrift.generated.DataException;
import com.zhang.thrift.generated.Person;
import com.zhang.thrift.generated.PersonService;
import org.apache.thrift.TException;

/**
 * Created by Administrator on 2019/3/2.
 */
public class PersonServiceImpl implements PersonService.Iface{
    @Override
    public Person getPersonByUsrename(String username) throws DataException, TException {
        System.out.println("Got Client Param :"+ username);
        Person person = new Person();
        person.setName("花花");
        person.setAge(18);
        person.setMarried(false);
        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.isMarried());
    }
}
