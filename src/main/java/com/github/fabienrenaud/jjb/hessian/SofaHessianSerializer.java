package com.github.fabienrenaud.jjb.hessian;

import com.caucho.hessian.io.Hessian2Output;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class SofaHessianSerializer {

    public byte[] serialize(Object src, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        Hessian2Output hessian2Output = new Hessian2Output(byteArrayOutputStream);
        hessian2Output.writeObject(src);
        hessian2Output.close();
        return byteArrayOutputStream.toByteArray();
    }

}
