package com.github.fabienrenaud.jjb.hessian;

import com.caucho.hessian.io.Hessian2Input;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class SofaHessianDeserializer implements SofaHessian {

    public Object deserializer(byte[] data) throws IOException {
        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
            Hessian2Input hessian2Input = new Hessian2Input(inputStream);
//            hessian2Input.setSerializerFactory(factory);
            Object object = hessian2Input.readObject();
            hessian2Input.close();
            return object;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("deserializer error..................");
        }
        return null;
    }

}
