package com.github.fabienrenaud.jjb.hessian;

import com.caucho.hessian.io.Hessian2Output;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class SofaHessianSerializer implements SofaHessian {

    public byte[] serialize(Object src, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        try {
            Hessian2Output hessian2Output = new Hessian2Output(byteArrayOutputStream);
//            hessian2Output.setSerializerFactory(factory);
            hessian2Output.writeObject(src);
            hessian2Output.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable e) {
            System.out.println("serialize error.....");
        }
        return null;
    }

}
