package com.fortis.designmode.struct.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderTest {
    /**
     *  外观模式的主要优点如下：
     (1) 它对客户端屏蔽了子系统组件，减少了客户端所需处理的对象数目，并使得子系统使用起来更加容易。通过引入外观模式，客户端代码将变得很简单，与之关联的对象也很少。
     (2) 它实现了子系统与客户端之间的松耦合关系，这使得子系统的变化不会影响到调用它的客户端，只需要调整外观类即可。
     (3) 一个子系统的修改对其他子系统没有任何影响，而且子系统内部变化也不会影响到外观对象。

     5.2 模式缺点
     外观模式的主要缺点如下：
     (1) 不能很好地限制客户端直接使用子系统类，如果对客户端访问子系统类做太多的限制则减少了可变性和灵活 性。
     (2) 如果设计不当，增加新的子系统可能需要修改外观类的源代码，违背了开闭原则。

     * @throws Exception
     */
    @Test
    public void encode1() throws Exception {
        SecondEncoderDecorator secondEncoderDecorator = new SecondEncoderDecorator();
        SimpleEncoder simpleEncoder = new SimpleEncoder();
        secondEncoderDecorator.setEncoder(simpleEncoder);
        Encoder encoder = secondEncoderDecorator.getEncoder();

        System.out.println(encoder.encode("hello"));
    }


}